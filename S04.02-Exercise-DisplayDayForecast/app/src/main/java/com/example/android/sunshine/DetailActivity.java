package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    TextView mDisplayWeatherText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mDisplayWeatherText = (TextView) findViewById(R.id.tv_display_weather_text);

        Intent intent = getIntent();
        String stringData;

        if (intent.getStringExtra("weather") != null) {
            stringData = getIntent().getStringExtra("weather");
        } else {
            stringData = "";
        }

        mDisplayWeatherText.setText(stringData);

    }
}