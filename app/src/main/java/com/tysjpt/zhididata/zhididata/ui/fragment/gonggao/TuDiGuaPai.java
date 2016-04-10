package com.tysjpt.zhididata.zhididata.ui.fragment.gonggao;

import android.support.v4.app.Fragment;
import android.view.View;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.github.obsessive.library.eventbus.EventCenter;
import com.tysjpt.zhididata.zhididata.R;

/**
 * Created by luo on 16-4-9.
 */
public class TuDiGuaPai extends BaseLazyFragment {
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
        return R.layout.fragment_gonggao_tudiguapai;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }
}
