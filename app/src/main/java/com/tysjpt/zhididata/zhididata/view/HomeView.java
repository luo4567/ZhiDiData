package com.tysjpt.zhididata.zhididata.view;

import android.graphics.drawable.Drawable;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.nightonke.boommenu.Types.PlaceType;
import com.tysjpt.zhididata.zhididata.bean.BoomMenuEntity;
import com.tysjpt.zhididata.zhididata.bean.BottomEntity;

import java.util.List;

/**
 * Created by luo on 16-4-9.
 */
public interface HomeView {
    void initializeViews(List<BaseLazyFragment> fragments,List<BottomEntity> bottomEntities);

    void initBoomMenu(BoomMenuEntity boomMenuEntity);
}
