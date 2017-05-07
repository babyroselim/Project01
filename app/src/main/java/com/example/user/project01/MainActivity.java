package com.example.user.project01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(myIntent);
    }

    public void onButton2Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:11111"));
        startActivity(myIntent);
    }
}
