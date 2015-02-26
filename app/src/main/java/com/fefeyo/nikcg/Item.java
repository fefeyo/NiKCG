package com.fefeyo.nikcg;

import android.graphics.Bitmap;

/**
 * Created by FEFE on 2015/02/26.
 */
public class Item {
    private Bitmap rightGavament;
    private Bitmap leftGavament;
    Item(){
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
}
