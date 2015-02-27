package com.fefeyo.nikcg;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;


public class BattleDetailActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    private final int MAX = 100;
   private ImageView leftFace;
   private ImageView rightFace;
   private ProgressBar battleBar;
   private ListView listView;
    private int scrollFrag;

   private TextView leftDamage;
    private TextView rightDamage;

   private int position;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_detail);

      battleBar = (ProgressBar)findViewById(R.id.Progress);
        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(view.getId()){
            case R.id.rightApprove :
                progress -= 10;
                battleBar.setProgress(progress);

                break;
            case R.id.leftApprove :
                progress += 10;
                battleBar.setProgress(progress);
                break;
        }
    }
}