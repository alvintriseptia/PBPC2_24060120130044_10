package com.pbp.user_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Success Buy");
        }
    }
}