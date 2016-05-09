package com.tysjpt.zhididata.zhididata.view;

import com.tysjpt.zhididata.zhididata.bean.UserInfoEntity;

/**
 * Created by luo on 16-5-9.
 *
 */
public interface LoginView {
    // 初始化控件
    void initViews(UserInfoEntity userInfo);

    // 登录
    void login();

    // 定位当前城市
    void position(String locationCity);

    // 登录成功导航到主界面
    void navigateToHomePage();

    // 导航到注册页面
    void navigateToRegisterPage();
}
