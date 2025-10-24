package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    TextView cityNameView;
    Intent intent;
    String cityName;
    Button backButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showactivity);
        cityNameView = findViewById(R.id.cityNameTextView);
        backButton = findViewById(R.id.backActivityButton);
        Intent intent = getIntent();
        cityName = intent.getStringExtra("cityName");
        cityNameView.setText(cityName);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
