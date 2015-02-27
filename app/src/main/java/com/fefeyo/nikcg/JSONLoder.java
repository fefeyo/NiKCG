package com.fefeyo.nikcg;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;


/**
 * Created by hitroki on 2015/02/27.
 */
public  class JSONLoder extends AsyncTaskLoader<JSONObject> {
    private String urlText;
    public JSONLoder(Context context, String urlText) {
        super(context);
        this.urlText = urlText;
    }

    @Override
    public JSONObject loadInBackground() {
        HttpClient httpClient = new DefaultHttpClient();

        StringBuilder uri = new StringBuilder(urlText);
        HttpGet request = new HttpGet(uri.toString());
        HttpResponse httpResponse = null;

        try {
            httpResponse = httpClient.execute(request);
        } catch (Exception e) {
            Log.d("JsonLoader", "Error Execute");
            return null;
        }

        int status = httpResponse.getStatusLine().getStatusCode();

        if (HttpStatus.SC_OK == status) {
            try {
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                httpResponse.getEntity().writeTo(outputStream);
                String data;
                data = outputStream.toString(); // JSONデータ

                JSONObject rootObject = new JSONObject(data);

                return rootObject;

            } catch (Exception e) {
                Log.d("JsonLoader", "Error");
            }
        } else {
            Log.d("JsonLoader", "Status" + status);
            return null;
        }

        return null;
    }


}
