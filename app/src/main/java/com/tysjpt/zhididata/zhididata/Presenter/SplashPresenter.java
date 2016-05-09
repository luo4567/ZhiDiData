package com.tysjpt.zhididata.zhididata.Presenter;

import android.view.animation.Animation;

import com.tysjpt.zhididata.zhididata.bean.CityInfoEntity;

import java.util.List;

/**
 * Created by luo on 16-5-9.
 */
public interface SplashPresenter {
    void initialized();

    List<CityInfoEntity> getCityInfo();

    Animation animateBackgroundImage();
}
