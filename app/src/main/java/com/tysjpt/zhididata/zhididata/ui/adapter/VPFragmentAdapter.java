package com.tysjpt.zhididata.zhididata.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.github.obsessive.library.base.BaseLazyFragment;

import java.util.List;

/**
 * Created by luo on 16-4-9.
 */
public class VPFragmentAdapter extends FragmentPagerAdapter {
    private List<BaseLazyFragment> mListFragments = null;

    public VPFragmentAdapter(FragmentManager fm, List<BaseLazyFragment> fragments) {
        super(fm);
        mListFragments = fragments;
    }

    @Override
    public int getCount() {
        return null != mListFragments ? mListFragments.size() : 0;
    }

    @Override
    public Fragment getItem(int index) {
        if (mListFragments != null && index > -1 && index < mListFragments.size()) {
            return mListFragments.get(index);
        } else {
            return null;
        }
    }
}
