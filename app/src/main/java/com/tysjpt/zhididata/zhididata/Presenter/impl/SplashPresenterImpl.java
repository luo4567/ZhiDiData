package com.tysjpt.zhididata.zhididata.Presenter.impl;

import android.content.Context;
import android.view.animation.Animation;

import com.tysjpt.zhididata.zhididata.Presenter.Presenter;
import com.tysjpt.zhididata.zhididata.Presenter.SplashPresenter;
import com.tysjpt.zhididata.zhididata.bean.CityInfoEntity;
import com.tysjpt.zhididata.zhididata.bean.SplashEntity;
import com.tysjpt.zhididata.zhididata.interactor.impl.SplashViewInteractorImpl;
import com.tysjpt.zhididata.zhididata.view.SplashView;

import java.util.List;

/**
 * Created by luo on 16-5-9.
 */
public class SplashPresenterImpl implements SplashPresenter {

    private SplashView mSplashView = null;
    private SplashViewInteractorImpl mSplashInteractor = null;

    public SplashPresenterImpl(Context context,SplashView splashView) {
        if (null == splashView) {
            throw new IllegalArgumentException("构造参数不能为空！");
        }

        mSplashView = splashView;
        mSplashInteractor = new SplashViewInteractorImpl(context);
    }

    @Override
    public void initialized() {
        mSplashView.initializeViews(mSplashInteractor.initializeSplashInfo());

        mSplashView.animateBackgroundImage(mSplashInteractor.animateBackgroundImage());

        Boolean isFirstUse=mSplashInteractor.checkIsFirstUse();
        if (isFirstUse){
            mSplashView.navigateToTourPage();
        }else{
            mSplashView.navigateToLoginPage();
        }
    }

    @Override
    public List<CityInfoEntity> getCityInfo() {
        return mSplashInteractor.getCityInfo();
    }


    @Override
    public Animation animateBackgroundImage() {
        return mSplashInteractor.animateBackgroundImage();
    }

}
