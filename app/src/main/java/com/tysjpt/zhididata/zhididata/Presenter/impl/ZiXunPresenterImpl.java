package com.tysjpt.zhididata.zhididata.Presenter.impl;

import android.content.Context;

import com.tysjpt.zhididata.zhididata.Presenter.Presenter;
import com.tysjpt.zhididata.zhididata.interactor.impl.ZiXunContainerInteractorImpl;
import com.tysjpt.zhididata.zhididata.view.CommonContainerView;

/**
 * Created by luo on 16-4-9.
 */
public class ZiXunPresenterImpl implements Presenter{

    private ZiXunContainerInteractorImpl ziXunContainerInteractor;
    private CommonContainerView commonContainerView;
    private Context context;

    public ZiXunPresenterImpl(Context context,CommonContainerView commonContainerView) {
        this.commonContainerView = commonContainerView;
        this.context = context;
        ziXunContainerInteractor=new ZiXunContainerInteractorImpl();
    }

    @Override
    public void initialized() {
        commonContainerView.initializePagerViews(ziXunContainerInteractor.getPagers(),ziXunContainerInteractor.getCommonCategoryList(context));
    }
}
