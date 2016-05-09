package com.tysjpt.zhididata.zhididata.bean;

/**
 * Created by luo on 16-5-9.
 *
 */
public class SplashEntity {
    String versionName;
    String copyright;
    int backgroundResId;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public int getBackgroundResId() {
        return backgroundResId;
    }

    public void setBackgroundResId(int backgroundResId) {
        this.backgroundResId = backgroundResId;
    }
}
