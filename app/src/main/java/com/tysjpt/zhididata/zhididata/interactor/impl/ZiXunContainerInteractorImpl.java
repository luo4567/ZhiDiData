package com.tysjpt.zhididata.zhididata.interactor.impl;

import android.content.Context;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.tysjpt.zhididata.zhididata.R;
import com.tysjpt.zhididata.zhididata.bean.BaseEntity;
import com.tysjpt.zhididata.zhididata.interactor.CommonContainerInteractor;
import com.tysjpt.zhididata.zhididata.ui.fragment.GongGaoContainerFragment;
import com.tysjpt.zhididata.zhididata.ui.fragment.zixun.GongYeYuPing;
import com.tysjpt.zhididata.zhididata.ui.fragment.zixun.ZhouKan;
import com.tysjpt.zhididata.zhididata.ui.fragment.zixun.ZhuZhaiYuPing;
import com.tysjpt.zhididata.zhididata.ui.fragment.zixun.ZhuanYeRenShi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luo on 16-4-9.
 */
public class ZiXunContainerInteractorImpl implements CommonContainerInteractor {
    
    @Override
    public List<BaseEntity> getCommonCategoryList(Context context) {
        List<BaseEntity> resultData = new ArrayList<>();
        String[] imagesCategoryArrayId = context.getResources().getStringArray(R.array.zixun_category_list_id);
        String[] imagesCategoryArrayName = context.getResources().getStringArray(R.array.zixun_category_list_name);
        resultData.add(new BaseEntity(imagesCategoryArrayId[0], imagesCategoryArrayName[0]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[1], imagesCategoryArrayName[1]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[2], imagesCategoryArrayName[2]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[3], imagesCategoryArrayName[3]));
        return resultData;
    }

    @Override
    public List<BaseLazyFragment> getPagers() {
        List<BaseLazyFragment> pagers=new ArrayList<>();
        pagers.add(new ZhuZhaiYuPing());
        pagers.add(new GongYeYuPing());
        pagers.add(new ZhouKan());
        pagers.add(new ZhuanYeRenShi());
        return pagers;
    }
}
