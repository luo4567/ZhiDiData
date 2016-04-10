package com.tysjpt.zhididata.zhididata.interactor;

import android.content.Context;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.tysjpt.zhididata.zhididata.bean.BoomMenuEntity;
import com.tysjpt.zhididata.zhididata.bean.BottomEntity;

import java.util.List;

/**
 * Created by luo on 16-4-9.
 */
public interface HomeInteractor {
    List<BottomEntity> getBottomListData(Context context);

    List<BaseLazyFragment> getPagerFragments();

    BoomMenuEntity getBoomMenuData(Context context);
}
