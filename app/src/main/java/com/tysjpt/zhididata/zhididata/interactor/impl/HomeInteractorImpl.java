package com.tysjpt.zhididata.zhididata.interactor.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.nightonke.boommenu.Types.PlaceType;
import com.nightonke.boommenu.Util;
import com.tysjpt.zhididata.zhididata.R;
import com.tysjpt.zhididata.zhididata.bean.BoomMenuEntity;
import com.tysjpt.zhididata.zhididata.bean.BottomEntity;
import com.tysjpt.zhididata.zhididata.interactor.HomeInteractor;
import com.tysjpt.zhididata.zhididata.ui.fragment.GongGaoContainerFragment;
import com.tysjpt.zhididata.zhididata.ui.fragment.WoDeFragment;
import com.tysjpt.zhididata.zhididata.ui.fragment.XunJiaFragment;
import com.tysjpt.zhididata.zhididata.ui.fragment.ZiXunContainerFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by luo on 16-4-9.
 */
public class HomeInteractorImpl implements HomeInteractor {

    @Override
    public List<BaseLazyFragment> getPagerFragments() {
        List<BaseLazyFragment> fragments = new ArrayList<>();
        fragments.add(new XunJiaFragment());
        fragments.add(new ZiXunContainerFragment());
        fragments.add(new GongGaoContainerFragment());
        fragments.add(new WoDeFragment());
        return fragments;
    }

    @Override
    public List<BottomEntity> getBottomListData(Context context) {
        List<BottomEntity> bottomEntities=new ArrayList<>();
        String[] bottomArrays = context.getResources().getStringArray(R.array.bottom_list);
        bottomEntities.add(new BottomEntity("",bottomArrays[0],R.mipmap.xunjia,12));
        bottomEntities.add(new BottomEntity("",bottomArrays[1],R.mipmap.zixun,12));
        bottomEntities.add(new BottomEntity("",bottomArrays[2],R.mipmap.gonggao,12));
        bottomEntities.add(new BottomEntity("",bottomArrays[3],R.mipmap.wode,12));
        return bottomEntities;
    }

    @Override
    public BoomMenuEntity getBoomMenuData(Context context) {
        Drawable[] drawables = new Drawable[4];
        int[] drawablesResource = new int[]{
                R.mipmap.mark,
                R.mipmap.refresh,
                R.mipmap.copy,
                R.mipmap.heart,
        };
        for (int i = 0; i < 4; i++)
            drawables[i] = ContextCompat.getDrawable(context, drawablesResource[i]);

        String[] boomMenuArray=context.getResources().getStringArray(R.array.boommenu_list);

        int[][] colors = new int[4][2];
        for (int i = 0; i < 4; i++) {
            colors[i][1] = GetRandomColor();
            colors[i][0] = Util.getInstance().getPressedColor(colors[i][1]);
        }

        BoomMenuEntity boomMenuEntity=new BoomMenuEntity(drawables,boomMenuArray,colors, PlaceType.SHARE_4_2,GetRandomColor(),GetRandomColor());
        return boomMenuEntity;
    }

    private String[] Colors = {
            "#F44336",
            "#E91E63",
            "#9C27B0",
            "#2196F3",
            "#03A9F4",
            "#00BCD4",
            "#009688",
            "#4CAF50",
            "#8BC34A",
            "#CDDC39",
            "#FFEB3B",
            "#FFC107",
            "#FF9800",
            "#FF5722",
            "#795548",
            "#9E9E9E",
            "#607D8B"};

    private int GetRandomColor() {
        Random random = new Random();
        int p = random.nextInt(Colors.length);
        return Color.parseColor(Colors[p]);
    }
}
