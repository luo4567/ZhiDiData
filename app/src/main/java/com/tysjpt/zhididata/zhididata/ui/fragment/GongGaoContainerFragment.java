package com.tysjpt.zhididata.zhididata.ui.fragment;

import android.support.v4.view.ViewPager;
import android.view.View;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.github.obsessive.library.eventbus.EventCenter;
import com.github.obsessive.library.smartlayout.SmartTabLayout;
import com.github.obsessive.library.widgets.XViewPager;
import com.tysjpt.zhididata.zhididata.Presenter.Presenter;
import com.tysjpt.zhididata.zhididata.Presenter.impl.GongGaoPresenterImpl;
import com.tysjpt.zhididata.zhididata.R;
import com.tysjpt.zhididata.zhididata.bean.BaseEntity;
import com.tysjpt.zhididata.zhididata.ui.adapter.ZiXunContainerPagerAdapter;
import com.tysjpt.zhididata.zhididata.view.CommonContainerView;

import java.util.List;

import butterknife.InjectView;

/**
 * Created by luo on 16-4-9.
 */
public class GongGaoContainerFragment extends BaseFragment implements CommonContainerView {

    @InjectView(R.id.fragment_gonggao_tab_smart)
    SmartTabLayout smartTabLayout;

    @InjectView(R.id.fragment_gonggao_pager)
    XViewPager viewPager;

    private Presenter presenter = null;

    @Override
    protected void onFirstUserVisible() {
        presenter=new GongGaoPresenterImpl(getContext(),this);
        presenter.initialized();
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
        return R.layout.fragment_gonggao;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    public void initializePagerViews(List<BaseLazyFragment> fragments,List<BaseEntity> categoryList) {
        if (null != categoryList && !categoryList.isEmpty()) {
            viewPager.setOffscreenPageLimit(categoryList.size());
            viewPager.setAdapter(new ZiXunContainerPagerAdapter(getSupportFragmentManager(), categoryList,fragments));
            smartTabLayout.setViewPager(viewPager);
            smartTabLayout.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    //ImagesListFragment fragment = (ImagesListFragment) viewPager.getAdapter().instantiateItem(viewPager, position);
                    //fragment.onPageSelected(position, categoryList.get(position).getId());
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
    }
}
