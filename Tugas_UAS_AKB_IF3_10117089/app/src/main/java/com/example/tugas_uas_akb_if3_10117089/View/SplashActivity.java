package com.example.tugas_uas_akb_if3_10117089.View;

import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.example.tugas_uas_akb_if3_10117089.R;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;


/** NIM : 10117089
 * Nama : Shendi Permana
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/
public class SplashActivity extends AwesomeSplash {
    @Override
    public void initSplash(ConfigSplash configSplash){
        getSupportActionBar().hide();
        //menambahkan background
        configSplash.setBackgroundColor(R.color.colorAccent);
        configSplash.setAnimCircularRevealDuration(3000);
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);
        configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);

        //menambahkan logo
        configSplash.setLogoSplash(R.drawable.logosplash);
        configSplash.setAnimLogoSplashDuration(2000);
        configSplash.setAnimTitleTechnique(Techniques.FadeIn);

        //menambahkan title
        configSplash.setTitleSplash("Let's Have a Vacation");
        configSplash.setTitleTextColor(R.color.colorPrimaryDark);
        configSplash.setTitleTextSize(30f);
        configSplash.setAnimTitleDuration(2000);
        configSplash.setAnimTitleTechnique(Techniques.ZoomIn);
    }
    @Override
    public void animationsFinished(){
        startActivity(new Intent(SplashActivity.this, OnBoardSliderActivity.class));
    }
}
