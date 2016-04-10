package com.tysjpt.zhididata.zhididata.interactor.impl;

import android.content.Context;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.tysjpt.zhididata.zhididata.R;
import com.tysjpt.zhididata.zhididata.bean.BaseEntity;
import com.tysjpt.zhididata.zhididata.interactor.CommonContainerInteractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luo on 16-4-9.
 */
public class XunJiaContainerInteractorImpl implements CommonContainerInteractor {

    @Override
    public List<BaseEntity> getCommonCategoryList(Context context) {
        List<BaseEntity> resultData = new ArrayList<>();
        String[] imagesCategoryArrayId = context.getResources().getStringArray(R.array.XunJia_category_list_id);
        String[] imagesCategoryArrayName = context.getResources().getStringArray(R.array.XunJia_category_list_name);
        resultData.add(new BaseEntity(imagesCategoryArrayId[0], imagesCategoryArrayName[0]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[1], imagesCategoryArrayName[1]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[2], imagesCategoryArrayName[2]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[3], imagesCategoryArrayName[3]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[4], imagesCategoryArrayName[4]));
        resultData.add(new BaseEntity(imagesCategoryArrayId[5], imagesCategoryArrayName[5]));
        return resultData;
    }

    @Override
    public List<BaseLazyFragment> getPagers() {
        return null;
    }
}
