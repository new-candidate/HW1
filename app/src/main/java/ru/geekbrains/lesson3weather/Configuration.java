package ru.geekbrains.lesson3weather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.TwoStatePreference;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.example.lesson1weather.R;

public class Configuration extends AppCompatActivity  {
    private boolean switchLoc; //switchLocation
    private boolean switchNot; //switchNotification
    private boolean switchCFI; //switchCFIndication
    private boolean switchThm; //switchTheme


    String LocDataKey = "LocDataKey";
    String NotDataKey = "NotDataKey";
    String CFIDataKey = "CFIDataKey";
    String ThDataKey = "ThDataKey";

//    Switch switchL = findViewById(R.id.switchLocation);
//    Switch switchN = findViewById(R.id.switchNotification);
//    Switch switchCF = findViewById(R.id.switchCFIndication);
//    Switch switchTh = findViewById(R.id.switchTheme);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuration);


//        if (switchL != null) {
//            switchL.setOnCheckedChangeListener(this);
//        }

        Button toBack = findViewById(R.id.buttonBack);
        toBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        InitViews();

    }
//    public void InitViews () {
////        Switch switchL = findViewById(R.id.switchLocation);
////        Switch switchN = findViewById(R.id.switchNotification);
////        Switch switchCF = findViewById(R.id.switchCFIndication);
////        Switch switchTh = findViewById(R.id.switchTheme);
//        switchL.setChecked(switchLoc);
//        switchN.setChecked(switchNot);
//        switchCF.setChecked(switchCFI);
//        switchTh.setChecked(switchThm);
//    }


//    @Override
//    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//        Toast.makeText(this, "Отслеживание переключения: " + (isChecked ? "on" : "off"),
//                Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.d("STATE", "onStart()");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        switchLoc = saveInstanceState.getBoolean("LocDataKey");
        switchNot = saveInstanceState.getBoolean("NotDataKey");
        switchCFI = saveInstanceState.getBoolean("CFIDataKey");
        switchThm = saveInstanceState.getBoolean("ThDataKey");

//        switchL.setChecked(switchLoc);
//        switchN.setChecked(switchNot);
//        switchCF.setChecked(switchCFI);
//        switchTh.setChecked(switchThm);


        Toast.makeText(getApplicationContext(), "Повторный запуск!! - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("STATE", "Повторный запуск!! - onRestoreInstanceState()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
        Log.d("STATE", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT).show();
        Log.d("STATE", "onPause()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle saveInstanceState) {




//        switchL.setChecked(switchLoc);
//        switchN.setChecked(switchNot);
//        switchCF.setChecked(switchCFI);
//        switchTh.setChecked(switchThm);
        
        saveInstanceState.putBoolean(LocDataKey, switchLoc);
        saveInstanceState.putBoolean(NotDataKey, switchNot);
        saveInstanceState.putBoolean(CFIDataKey, switchCFI);
        saveInstanceState.putBoolean(ThDataKey, switchThm);

        super.onSaveInstanceState(saveInstanceState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("STATE", "onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
        Log.d("STATE", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
        Log.d("STATE", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("STATE", "onDestroy()");
    }
}
