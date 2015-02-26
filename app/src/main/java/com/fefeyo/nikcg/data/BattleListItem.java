package com.fefeyo.nikcg.data;

import android.graphics.Bitmap;

/**
 * Created by FEFE on 2015/02/26.
 */
public class BattleListItem {
    private Bitmap rightGavament;
    private String rightName;
    private Bitmap leftGavament;
    private String leftName;
    BattleListItem(){
        rightGavament = null;
        leftGavament = null;
    }
    public Bitmap getRightGavament(){
        return rightGavament;
    }

    public void setRightGavament(Bitmap b){
        this.rightGavament = b;
    }

    public Bitmap getLeftGavament(){
        return leftGavament;
    }

    public void setLeftGavament(Bitmap b){
        this.leftGavament = b;
    }

    public String getRightName(){
        return rightName;
    }

    public void setRightName(String name){
        this.rightName = name;
    }

    public String getLeftName(){
        return leftName;
    }

    public void setLeftName(String name){
        this.leftName = name;
    }
}
