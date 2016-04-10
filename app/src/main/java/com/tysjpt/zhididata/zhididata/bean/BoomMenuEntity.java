package com.tysjpt.zhididata.zhididata.bean;

import android.graphics.drawable.Drawable;

import com.nightonke.boommenu.Types.PlaceType;

/**
 * Created by luo on 16-4-9.
 */
public class BoomMenuEntity {

    private Drawable[] drawables;
    private String[] strings;
    private int[][] colors;
    private PlaceType placeType;
    private int color1;
    private int color2;

    public BoomMenuEntity(Drawable[] drawables, String[] strings, int[][] colors, PlaceType placeType, int color1, int color2) {
        this.drawables = drawables;
        this.strings = strings;
        this.colors = colors;
        this.placeType = placeType;
        this.color1 = color1;
        this.color2 = color2;
    }

    public Drawable[] getDrawables() {
        return drawables;
    }

    public void setDrawables(Drawable[] drawables) {
        this.drawables = drawables;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public int[][] getColors() {
        return colors;
    }

    public void setColors(int[][] colors) {
        this.colors = colors;
    }

    public PlaceType getPlaceType() {
        return placeType;
    }

    public void setPlaceType(PlaceType placeType) {
        this.placeType = placeType;
    }

    public int getColor1() {
        return color1;
    }

    public void setColor1(int color1) {
        this.color1 = color1;
    }

    public int getColor2() {
        return color2;
    }

    public void setColor2(int color2) {
        this.color2 = color2;
    }

}
