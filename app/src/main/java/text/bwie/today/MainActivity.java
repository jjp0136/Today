package text.bwie.today;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import text.bwie.today.fragments.LeftFragment;

public class MainActivity extends SlidingFragmentActivity {

    private SlidingMenu slidingMenu;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLeftFragment();
    }

    private void initLeftFragment() {
        Fragment leftFragment=new LeftFragment();
        setBehindContentView(R.layout.left_frame);
        getSupportFragmentManager().beginTransaction().replace(R.id.left_frame,leftFragment).commit();
        
        slidingMenu = getSlidingMenu();

        slidingMenu.setMode(SlidingMenu.LEFT_RIGHT);

        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);

        slidingMenu.setShadowWidthRes(R.dimen.shadow_width);

        slidingMenu.setShadowDrawable(R.drawable.shadow);

        slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);

        slidingMenu.setFadeDegree(0.35f);
    }
}