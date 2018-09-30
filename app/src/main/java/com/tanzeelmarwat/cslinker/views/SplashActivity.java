package com.tanzeelmarwat.cslinker.views;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tanzeelmarwat.cslinker.R;
import com.tanzeelmarwat.cslinker.utils.Constants;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This task will excute after a delay
                finish();

            }
        }, Constants.DELAY_INTERVAL);
    }


}
