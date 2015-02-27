package com.fefeyo.nikcg;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;


public class DetailActivity extends ActionBarActivity {
    JSONLoder jsonLoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        AssetManager assetManager = getResources().getAssets();
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;


            jsonLoder = new JSONLoder(this,"http://dac2.snnm.net:80/api/search?keyword=%E6%94%BF%E6%B2%BB%E3%81%A8%E3%82%AB%E3%83%8D%E3%81%A7%E8%B3%AA%E5%95%8F%E6%94%BB%E5%8B%A2&volume=1");
            // JSONObject に変換します
            JSONObject json = jsonLoder.loadInBackground();

            // JSONObject を文字列に変換してログ出力します
            Log.d("Detail", json.toString());


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
