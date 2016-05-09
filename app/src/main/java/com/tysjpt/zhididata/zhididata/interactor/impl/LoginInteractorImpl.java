package com.tysjpt.zhididata.zhididata.interactor.impl;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.tysjpt.zhididata.zhididata.bean.UserInfoEntity;
import com.tysjpt.zhididata.zhididata.interactor.LoginInteractor;
import com.tysjpt.zhididata.zhididata.locationservice.LocationService;

/**
 * Created by luo on 16-5-9.
 */
public class LoginInteractorImpl implements LoginInteractor {

    /**
     * 通过在本地数据库中获取
     * @return
     */
    @Override
    public UserInfoEntity getUserInfo() {
        return null;
    }

    @Override
    public boolean login() {
        return false;
    }

    @Override
    public void location(final LocationService locationService, final ILocationCallBack locationCallBack) {

        locationService.registerListener(new BDLocationListener() {
            @Override
            public void onReceiveLocation(BDLocation bdLocation) {
                if (bdLocation!=null){
                    locationCallBack.onResult(bdLocation.getCity());
                }else{
                    locationCallBack.onResult("地位失败！");
                }
                locationService.stop();
            }
        });
        locationService.setLocationOption(locationService.getDefaultLocationClientOption());
        locationService.start();
    }
}
