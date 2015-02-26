package com.fefeyo.nikcg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.fefeyo.nikcg.data.Item;

import java.util.ArrayList;

/**
 * Created by FEFE on 2015/02/26.
 */
public class BattleListAdapter extends ArrayAdapter<Item> {
    private LayoutInflater inflater;

    public BattleListAdapter(Context context, int resource,ArrayList<Item> item) {
        super(context, resource,item);
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        if(convertView == null){
            convertView = inflater.inflate(R.layout.activity_main,null);
        }
        Item item = (Item)getItem(position);
        ImageView right = (ImageView)convertView.findViewById(R.id.rightGavament);
        right.setImageBitmap(item.getRightGavament());
        ImageView left = (ImageView)convertView.findViewById(R.id.leftGavament);
        left.setImageBitmap(item.getLeftGavament());
        return convertView;
    }
}

