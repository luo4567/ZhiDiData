package com.tysjpt.zhididata.zhididata;

import android.app.Application;
import android.app.Service;
import android.os.Vibrator;

import com.tysjpt.zhididata.zhididata.locationservice.LocationService;

/**
 * Created by luo on 16-4-9.
 */
public class ZhiDiDataApplication extends Application {
    public LocationService locationService;

    @Override
    public void onCreate() {
        super.onCreate();
        /***
         * 初始化定位sdk，建议在Application中创建
         */
        locationService = new LocationService(getApplicationContext());
    }
}
