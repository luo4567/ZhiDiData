/*
 * Copyright (c) 2015 [1076559197@qq.com | tchen0707@gmail.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tysjpt.zhididata.zhididata.view;

import android.view.animation.Animation;

import com.tysjpt.zhididata.zhididata.bean.SplashEntity;


public interface SplashView {

    // 首页动画
    void animateBackgroundImage(Animation animation);

    // 初始化控件
    void initializeViews(SplashEntity splashEntity);

    // 获取城市列表
    void getCityInfo();

    // 检查是否第一次登录
    //void checkIsFirstUse();

    // 导航到登录界面
    void navigateToLoginPage();

    // 导航到引导界面
    void navigateToTourPage();
}
