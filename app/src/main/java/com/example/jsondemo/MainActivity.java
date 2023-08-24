package com.example.jsondemo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue  requestQueue;
        requestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonobjectRequest = new JsonObjectRequest(Request.Method.GET,
                "https://patoliyaitsolution.com/demo/Applist.txt",
                null,
                new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d("TTT", "onResponse: response = "+response);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("TTT", "onErrorResponse: error = "+error);
            }
        });

        requestQueue.add(jsonobjectRequest);

    }

}