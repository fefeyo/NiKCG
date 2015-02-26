package com.fefeyo.nikcg;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.fefeyo.nikcg.data.DetailListItem;


public class BattleDetailActivity extends ActionBarActivity {
    private ProgressBar pb;
    private DetailAdapter adapter;
    private DetailListItem item;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_detail);

        list = (ListView)findViewById(R.id.listView);
        pb = (ProgressBar)findViewById(R.id.seekBar);
        item = new DetailListItem();
        pb.setMax(100);
        pb.setProgress(30);


    }
}