package com.fefeyo.nikcg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fefeyo.nikcg.data.DetailListItem;

import java.util.ArrayList;

/**
 * Created by FEFE on 2015/02/27.
 */
public class DetailAdapter extends ArrayAdapter<DetailListItem> {
    private LayoutInflater inflater;
    private int count;

    public DetailAdapter(Context context, int resource,ArrayList<DetailListItem> item) {
        super(context, resource,item);
        count = 0;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        if(convertView == null){
            if(count % 2 == 0){
                convertView = inflater.inflate(R.layout.battledetail_right,null);
                DetailListItem item = (DetailListItem)getItem(position);
                ImageView image = (ImageView)convertView.findViewById(R.id.rightFace);
                image.setImageBitmap(item.getBitmap());
                TextView text = (TextView)convertView.findViewById(R.id.rightSpeak);
                text.setText(item.getSpeak());
                count++;
            }else{
                convertView = inflater.inflate(R.layout.battledetail_left,null);
                DetailListItem item = (DetailListItem)getItem(position);
                ImageView image = (ImageView)convertView.findViewById(R.id.leftFace);
                image.setImageBitmap(item.getBitmap());
                TextView text = (TextView)convertView.findViewById(R.id.leftSpeak);
                text.setText(item.getSpeak());
                count++;
            }
        }
        return convertView;
    }
}
