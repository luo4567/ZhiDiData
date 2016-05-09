package com.tysjpt.zhididata.zhididata.interactor;

import android.view.animation.Animation;

import com.tysjpt.zhididata.zhididata.bean.CityInfoEntity;
import com.tysjpt.zhididata.zhididata.bean.SplashEntity;

import java.util.List;

/**
 * Created by luo on 16-5-9.
 *
 */
public interface SplashViewInteractor {
    // 首页动画
    Animation animateBackgroundImage();

    // 初始化内容
    SplashEntity initializeSplashInfo();

    // 获取城市列表
    List<CityInfoEntity> getCityInfo();

    // 检查是否第一次登录
    boolean checkIsFirstUse();
}
