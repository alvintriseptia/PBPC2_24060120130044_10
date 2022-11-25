package com.pbp.user_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBuy, btnCp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBuy = findViewById(R.id.btn_buy);
        btnCp = findViewById(R.id.btn_cp);

        btnBuy.setOnClickListener(this);
        btnCp.setOnClickListener(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Macbook Air M2");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_buy:
                Intent moveIntent = new Intent(MainActivity.this, SuccessActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_cp:
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:08123456789"));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}