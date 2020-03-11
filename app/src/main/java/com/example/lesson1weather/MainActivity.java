package com.example.lesson1weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setColorOfTextView();
    }
    private void initViews() {
        textView = findViewById(R.id.cityTextView);

//        int orientation = getResources().getConfiguration().orientation;
//        if (orientation != Configuration.ORIENTATION_LANDSCAPE) {
//            beginnerSwitch = findViewById(R.id.switch1);
//        }

    }
    private void setColorOfTextView() {
        //String appName = getString(R.string.app_name);
        textView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
    }
}
