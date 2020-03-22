package ru.geekbrains.lesson3weather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lesson1weather.R;

public class Weather extends AppCompatActivity implements Constants {
    private Button openUrlBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Const const1 = (Const) getIntent().getExtras().getSerializable(TEXT);
        String text = getIntent().getExtras().getString(TEXT); // получить данные из Intent
        TextView textView = findViewById(R.id.curentCity);
        textView.setText(const1.activeCity); // Сохранить их в TextView


        openUrlBtn = findViewById(R.id.openUrl);
        setOnOpenUrlBtnOnClick();


        Button toConfiguration = findViewById(R.id.buttonConfiguration);
        Button toBack = findViewById(R.id.buttonBack);
        toBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView textView3 = Weather.this.findViewById(R.id.curentCity);
                Intent intentResult = new Intent();
                intentResult.putExtra("activeCity", textView3.getText().toString());
                setResult(RESULT_OK, intentResult);
                finish();


            }
        });
        toConfiguration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Weather.this, Configuration.class);
                startActivity(intent);
            }
        });
    }

    private void setOnOpenUrlBtnOnClick() {
        openUrlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                url2Text = findViewById(R.id.curentCity);
//                getText(
                TextView textView4 = Weather.this.findViewById(R.id.curentCity);
                String  cC = textView4.getText().toString();
                String urlText = ("https://en.wikipedia.org/wiki/"+cC);

                Uri uri = Uri.parse(urlText);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(browserIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.d("STATE", "onStart()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);



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
