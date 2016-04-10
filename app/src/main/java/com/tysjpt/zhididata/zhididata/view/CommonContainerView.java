package com.tysjpt.zhididata.zhididata.view;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.tysjpt.zhididata.zhididata.bean.BaseEntity;

import java.util.List;

/**
 * Created by luo on 16-4-9.
 */
public interface CommonContainerView {
    void initializePagerViews(List<BaseLazyFragment> fragments,List<BaseEntity> categoryList);
}
