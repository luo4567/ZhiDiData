package com.tysjpt.zhididata.zhididata.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.tysjpt.zhididata.zhididata.bean.BaseEntity;

import java.util.List;

/**
 * Created by luo on 16-4-9.
 */
public class ZiXunContainerPagerAdapter extends FragmentPagerAdapter{
    private List<BaseEntity> mCategoryList = null;
    private List<BaseLazyFragment> fragments=null;

    public ZiXunContainerPagerAdapter(FragmentManager fm, List<BaseEntity> categoryList, List<BaseLazyFragment> fragments) {
        super(fm);
        mCategoryList = categoryList;
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return null != mCategoryList ? mCategoryList.size() : 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null != mCategoryList ? mCategoryList.get(position).getName() : null;
    }
}
