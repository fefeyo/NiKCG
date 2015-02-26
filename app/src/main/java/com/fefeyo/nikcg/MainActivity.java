package com.fefeyo.nikcg;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.fefeyo.nikcg.data.BattleListItem;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private ListView list;
    private BattleListAdapter adapter;
    private ArrayList<BattleListItem> arr;
    private BattleListItem item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.battleList);
        arr = new ArrayList<>();
        item = new BattleListItem();

        //　テスト用開始
        String[] a = new String[]{"red","red","red","red","red"};
        String[] b = new String[]{"blue","blue","blue","blue","blue"};
        int[] c = new int[]{R.drawable.red,R.drawable.red,R.drawable.red,R.drawable.red,R.drawable.red};
        int[] d = new int[]{R.drawable.blue,R.drawable.blue,R.drawable.blue,R.drawable.blue,R.drawable.blue};
        for(int i = 0;i < 5;i++){
            item.setRightGavament(BitmapFactory.decodeResource(getResources(),c[i]));
            item.setRightName(a[i]);
            item.setLeftGavament(BitmapFactory.decodeResource(getResources(),d[i]));
            item.setLeftName(b[i]);
            arr.add(item);
        }
        //　テスト用終了
        adapter = new BattleListAdapter(
                this,
                0,
                arr
        );
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i =  new Intent(MainActivity.this,BattleDetailActivity.class);
                startActivity(i);
            }
        });
    }
}