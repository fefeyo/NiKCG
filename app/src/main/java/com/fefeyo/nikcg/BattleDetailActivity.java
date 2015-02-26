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
   private ArrayList<DetailListItem> rightItem;
    private ArrayList<DetailListItem> leftItem;
   private int position;
    private final int MAX = 100;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_detail);

       leftFace = (ImageView)findViewById(R.id.leftFace);
       rightFace = (ImageView)findViewById(R.id.rightFace);
        battleBar = (ProgressBar)findViewById(R.id.ProBar);
        listView = (ListView)findViewById(R.id.listView);
        progress = 50;
        battleBar.setMax(MAX);
        battleBar.setProgress(progress);

        detailAdapter =new DetailAdapter(this,
                    0,
                   rightItem,
                   leftItem
                );
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
                    if(battleBar.getProgress() < 50){
                        //左側が勝った場合

                    }else if(battleBar.getProgress() > 50){
                       //右側が勝った場合
                    }else {
                        //引き分けの場合
                    }
                }else {

                    if ((firstVisibleItem + visibleItemCount - 1) % 2 == 0) {
                        //ターンが終わった場合

                        battleBar.setProgress(progress);

                    }
                }

            }
        });












    }
}