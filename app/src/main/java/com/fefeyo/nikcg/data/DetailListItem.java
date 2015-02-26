package com.fefeyo.nikcg.data;

import android.graphics.Bitmap;

/**
 * Created by FEFE on 2015/02/27.
 */
public class DetailListItem {
    private Bitmap bitmap;
    private String speak;

    public DetailListItem(){
        bitmap = null;
        speak = null;
    }
    public Bitmap getBitmap(){
        return bitmap;
    }
    public void setBitmap(Bitmap bitmap){
        this.bitmap = bitmap;
    }
    public String getSpeak(){
        return speak;
    }
    public void setSpeak(String s){
        this.speak = s;
    }
}
