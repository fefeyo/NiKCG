package com.fefeyo.nikcg;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import com.fefeyo.nikcg.data.BattleListItem;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private ListView list;
    private BattleListAdapter adapter;
    private ArrayList<BattleListItem> arr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.battleList);
        arr = new ArrayList<>();
        adapter = new BattleListAdapter(
                this,
                R.layout.item_row,
                arr
        );
        list.setAdapter(adapter);
    }
}