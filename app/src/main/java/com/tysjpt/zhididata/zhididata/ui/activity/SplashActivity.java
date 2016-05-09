package com.tysjpt.zhididata.zhididata.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;

import com.tysjpt.zhididata.zhididata.Presenter.SplashPresenter;
import com.tysjpt.zhididata.zhididata.bean.SplashEntity;
import com.tysjpt.zhididata.zhididata.view.SplashView;

/**
 * Created by luo on 16-5-9.
 *
 */
public class SplashActivity extends AppCompatActivity implements SplashView {

    private SplashPresenter mSplashPresenter = null;


    @Override
    public void animateBackgroundImage(Animation animation) {
        mSplashPresenter.animateBackgroundImage();
    }

    @Override
    public void initializeViews(SplashEntity splashEntity) {
        mSplashPresenter.initialized();
    }

    @Override
    public void getCityInfo() {

    }

    @Override
    public void navigateToLoginPage() {

    }

    @Override
    public void navigateToTourPage() {

    }
}
