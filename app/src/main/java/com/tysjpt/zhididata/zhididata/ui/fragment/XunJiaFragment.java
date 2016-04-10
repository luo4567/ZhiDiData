package com.tysjpt.zhididata.zhididata.ui.fragment;

import android.view.View;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.github.obsessive.library.eventbus.EventCenter;
import com.tysjpt.zhididata.zhididata.R;
import com.tysjpt.zhididata.zhididata.bean.BaseEntity;
import com.tysjpt.zhididata.zhididata.view.CommonContainerView;

import java.util.List;

/**
 * Created by luo on 16-4-9.
 */
public class XunJiaFragment extends BaseFragment {

    @Override
    protected void onFirstUserVisible() {
        
    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_xunjia;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }
}
