package com.tysjpt.zhididata.zhididata.interactor;

import com.tysjpt.zhididata.zhididata.bean.UserInfoEntity;
import com.tysjpt.zhididata.zhididata.locationservice.LocationService;

/**
 * Created by luo on 16-5-9.
 */
public interface LoginInteractor {

    UserInfoEntity getUserInfo();

    boolean login();

    void location(LocationService locationService,ILocationCallBack locationCallBack);



    interface ILocationCallBack{
        void onResult(String data);
    }
}
