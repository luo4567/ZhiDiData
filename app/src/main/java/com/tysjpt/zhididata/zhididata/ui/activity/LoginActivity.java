package com.tysjpt.zhididata.zhididata.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tysjpt.zhididata.zhididata.Presenter.LoginPresenter;
import com.tysjpt.zhididata.zhididata.Presenter.impl.LoginPresenterImpl;
import com.tysjpt.zhididata.zhididata.bean.UserInfoEntity;
import com.tysjpt.zhididata.zhididata.view.LoginView;

/**
 * Created by luo on 16-5-9.
 */
public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginPresenter=new LoginPresenterImpl(this,this);
        loginPresenter.location();
    }

    @Override
    public void initViews(UserInfoEntity userInfo) {

    }

    @Override
    public void login() {

    }

    @Override
    public void position(String locationCity) {
        
    }

    @Override
    public void navigateToHomePage() {

    }

    @Override
    public void navigateToRegisterPage() {

    }
}
