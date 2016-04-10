package com.tysjpt.zhididata.zhididata.Presenter.impl;

import android.content.Context;

import com.tysjpt.zhididata.zhididata.Presenter.Presenter;
import com.tysjpt.zhididata.zhididata.interactor.impl.GongGaoContainerInteractorImpl;
import com.tysjpt.zhididata.zhididata.view.CommonContainerView;

/**
 * Created by luo on 16-4-9.
 */
public class GongGaoPresenterImpl implements Presenter{

    private GongGaoContainerInteractorImpl gongGaoContainerInteractor;
    private CommonContainerView commonContainerView;
    private Context context;

    public GongGaoPresenterImpl(Context context, CommonContainerView commonContainerView) {
        this.commonContainerView = commonContainerView;
        this.context = context;
        gongGaoContainerInteractor=new GongGaoContainerInteractorImpl();
    }

    @Override
    public void initialized() {
        commonContainerView.initializePagerViews(gongGaoContainerInteractor.getPagers(),gongGaoContainerInteractor.getCommonCategoryList(context));
    }
}
