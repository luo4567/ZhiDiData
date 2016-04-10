package com.tysjpt.zhididata.zhididata.Presenter.impl;

import android.content.Context;

import com.tysjpt.zhididata.zhididata.Presenter.Presenter;
import com.tysjpt.zhididata.zhididata.interactor.impl.HomeInteractorImpl;
import com.tysjpt.zhididata.zhididata.view.HomeView;

/**
 * Created by luo on 16-4-9.
 */
public class HomePresenterImpl implements Presenter {

    private Context context;
    private HomeInteractorImpl homeInteractor;
    private HomeView homeView;

    public HomePresenterImpl(Context context,HomeView homeView){
        if (null == homeView) {
            throw new IllegalArgumentException("构造函数参数不能为空");
        }
        this.context=context;
        this.homeView=homeView;
        homeInteractor=new HomeInteractorImpl();
    }

    @Override
    public void initialized() {
        homeView.initializeViews(homeInteractor.getPagerFragments(),homeInteractor.getBottomListData(context));
    }

    public void initBoomMenu(){
        homeView.initBoomMenu(homeInteractor.getBoomMenuData(context));
    }
}
