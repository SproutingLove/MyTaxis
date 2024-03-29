package com.atoken.mytaxis.splash;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.atoken.mytaxis.R;

/**
 * Author Aatoken
 * Date 2019/12/2 12:38
 * Description
 */
public class SplashActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            final AnimatedVectorDrawable anim1 = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim);
            final ImageView logo = ((ImageView) findViewById(R.id.logo));
            logo.setImageDrawable(anim1);
            anim1.start();
        }
    }
}
