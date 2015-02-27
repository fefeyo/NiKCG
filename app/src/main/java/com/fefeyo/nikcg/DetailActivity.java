package com.fefeyo.nikcg;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;


public class DetailActivity extends ActionBarActivity {
    private JSONLoder jsonLoder;
    private TextView titleView;
    private TextView bodyView;
    private String title;
    private String body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       titleView = (TextView)findViewById(R.id.title);
       bodyView = (TextView)findViewById(R.id.body);




            jsonLoder = new JSONLoder(this,"http://dac2.snnm.net:80/api/search?keyword=%E6%94%BF%E6%B2%BB%E3%81%A8%E3%82%AB%E3%83%8D%E3%81%A7%E8%B3%AA%E5%95%8F%E6%94%BB%E5%8B%A2&volume=1");
            // JSONObject に変換します
            JSONObject json = jsonLoder.loadInBackground();

            // JSONObject を文字列に変換してログ出力します
            Log.d("Detail", json.toString());

        try {
          title  = json.getString("title");
           body = json.getString("snippet");

        } catch (JSONException e) {
            e.printStackTrace();
        }
        titleView.setText(title);
        bodyView.setText(body);

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
