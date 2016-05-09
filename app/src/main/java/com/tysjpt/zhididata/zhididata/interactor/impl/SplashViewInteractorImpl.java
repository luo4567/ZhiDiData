package com.tysjpt.zhididata.zhididata.interactor.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.view.animation.Animation;

import com.tysjpt.zhididata.zhididata.R;
import com.tysjpt.zhididata.zhididata.bean.CityInfoEntity;
import com.tysjpt.zhididata.zhididata.bean.SplashEntity;
import com.tysjpt.zhididata.zhididata.interactor.SplashViewInteractor;

import java.util.Calendar;
import java.util.List;

/**
 * Created by luo on 16-5-9.
 *
 */
public class SplashViewInteractorImpl implements SplashViewInteractor {

    private Context context;

    public SplashViewInteractorImpl(Context context){

        this.context = context;
    }

    @Override
    public Animation animateBackgroundImage() {
        return null;
    }

    @Override
    public SplashEntity initializeSplashInfo() {
        SplashEntity splashEntity=new SplashEntity();
        String versionName= null;
        try {
            versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        versionName=String.format(context.getResources().getString(R.string.splash_version), versionName);
        splashEntity.setVersionName(versionName);
        splashEntity.setCopyright(context.getResources().getString(R.string.splash_copyright));

        int resId;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(calendar.HOUR_OF_DAY);
        if (hour >= 6 && hour <= 12) {
            resId = R.mipmap.home_default_ad;
        } else if (hour > 12 && hour <= 18) {
            resId = R.mipmap.home_default_ad;
        } else {
            resId = R.mipmap.home_default_ad;
        }
        splashEntity.setBackgroundResId(resId);
        return splashEntity;
    }

    @Override
    public List<CityInfoEntity> getCityInfo() {
        return null;
    }

    @Override
    public boolean checkIsFirstUse() {
        SharedPreferences setting = context.getSharedPreferences("SHARE_APP_TAG", 0);
        Boolean user_first = setting.getBoolean("FIRST",true);
        if(user_first){//第一次
            setting.edit().putBoolean("FIRST", false).commit();
            return true;
        }else{
            return false;
        }
    }
}
