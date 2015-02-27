package com.fefeyo.nikcg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.fefeyo.nikcg.data.BattleListItem;

import java.util.ArrayList;

/**
 * Created by FEFE on 2015/02/26.
 */
public class BattleListAdapter extends ArrayAdapter<BattleListItem> {
    private LayoutInflater inflater;
    private int count = 0;

    public BattleListAdapter(Context context, int resource,ArrayList<BattleListItem> item) {
        super(context, resource,item);
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        if(convertView == null){
            convertView = inflater.inflate(R.layout.item_row,null);
        }
        BattleListItem item = getItem(position);
        ImageView rightImage = (ImageView)convertView.findViewById(R.id.rightGavament);
        rightImage.setImageBitmap(item.getRightGavament());
        ImageView leftImage = (ImageView)convertView.findViewById(R.id.leftGavament);
        leftImage.setImageBitmap(item.getLeftGavament());
        TextView rightName = (TextView)convertView.findViewById(R.id.rightName);
        rightName.setText(item.getRightName());
        TextView leftName = (TextView)convertView.findViewById(R.id.leftName);
        leftName.setText(item.getLeftName());
        TextView title = (TextView)convertView.findViewById(R.id.title);
        title.setText(item.getTitle());
        ProgressBar p = (ProgressBar)convertView.findViewById(R.id.titleProgress);
        if(position != 0) {
            p.setProgress(position * 20);
        }else{
            p.setProgress(50);
        }
        return convertView;
    }
}

