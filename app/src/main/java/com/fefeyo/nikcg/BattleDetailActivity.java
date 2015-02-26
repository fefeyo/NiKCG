package com.fefeyo.nikcg;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.fefeyo.nikcg.data.DetailListItem;

import java.util.ArrayList;


public class BattleDetailActivity extends ActionBarActivity {
   private ImageView leftFace;
   private ImageView rightFace;
   private ProgressBar battleBar;
   private ListView listView;
   private DetailAdapter detailAdapter;
   private ArrayList<DetailListItem> item;
   private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_detail);

       leftFace = (ImageView)findViewById(R.id.leftFace);
       rightFace = (ImageView)findViewById(R.id.rightFace);
        battleBar = (ProgressBar)findViewById(R.id.Bar);
        listView = (ListView)findViewById(R.id.listView);

        detailAdapter =new DetailAdapter(this,
                    0,
                   item );
        listView.setAdapter(detailAdapter);

        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                  position = listView.getChildAt(0).getTop();
                if(firstVisibleItem + visibleItemCount == totalItemCount) {
                    //勝敗処理
                }else {

                    if ((firstVisibleItem + visibleItemCount - 1) % 2 == 0) {
                        //ターンが終わった場合

                    }
                }

            }
        });










    }
}