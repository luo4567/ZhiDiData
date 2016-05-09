package com.tysjpt.zhididata.zhididata.Presenter.impl;

import android.content.Context;

import com.tysjpt.zhididata.zhididata.Presenter.LoginPresenter;
import com.tysjpt.zhididata.zhididata.ZhiDiDataApplication;
import com.tysjpt.zhididata.zhididata.interactor.LoginInteractor;
import com.tysjpt.zhididata.zhididata.interactor.impl.LoginInteractorImpl;
import com.tysjpt.zhididata.zhididata.view.LoginView;

/**
 * Created by luo on 16-5-9.
 */
public class LoginPresenterImpl implements LoginPresenter {
    private LoginInteractor loginInteractor;
    private LoginView loginView;
    private Context context;

    public LoginPresenterImpl(LoginView loginView, Context context) {
        this.loginView = loginView;
        this.context = context;
        loginInteractor=new LoginInteractorImpl();
    }

    @Override
    public void location() {
        loginInteractor.location(((ZhiDiDataApplication)context.getApplicationContext()).locationService,new LoginInteractor.ILocationCallBack() {
            @Override
            public void onResult(String data) {
                loginView.position(data);
            }
        });
    }
}
