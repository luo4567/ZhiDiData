package com.tysjpt.zhididata.zhididata.bean;

/**
 * Created by luo on 16-4-9.
 */
public class BottomEntity extends BaseEntity {
    private int iconResId;

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    private int textSize;

    public BottomEntity(String id, String name, int iconResId,int textSize) {
        super(id, name);
        this.iconResId = iconResId;
        this.textSize=textSize;
    }

    public int getIconResId() {
        return iconResId;
    }

    public void setIconResId(int iconResId) {
        this.iconResId = iconResId;
    }


}
