package com.fefeyo.nikcg;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.fefeyo.nikcg.data.BattleListItem;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private ListView list;
    private BattleListAdapter adapter;
    private ArrayList<BattleListItem> arr;
    private BattleListItem item;
    private ImageButton profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar ac = getSupportActionBar();
        ac.setDisplayShowTitleEnabled(false);
        ac.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        ac.setCustomView(R.layout.bar);
        list = (ListView) findViewById(R.id.battleList);
        arr = new ArrayList<>();

        //　テスト用開始
        String[] title = new String[]{"政治とカネ","農協・安保","経済再生","衆議院解散総選挙"};
        String[] a = new String[]{"【自民】\n阿部首相","【自民】\n稲田朋美","【自民】\n谷垣禎一","【自民】\n稲田朋美"};
        String[] b = new String[]{"【民主】\n野党","【共産】\n小池晃","【民主】\n枝野幸男","【維新】\n柿崎未途"};
        int[] c = new int[]{R.drawable.abe,R.drawable.inada,R.drawable.tani,R.drawable.inada2};
        int[] d = new int[]{R.drawable.yato,R.drawable.koike,R.drawable.edano,R.drawable.kakizaki};
        for(int i = 0;i < a.length;i++){
            item = new BattleListItem();
            item.setTitle(title[i]);
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
        profile = (ImageButton)findViewById(R.id.profileButton);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Profile.class);
                startActivity(i);
            }
        });
    }
}