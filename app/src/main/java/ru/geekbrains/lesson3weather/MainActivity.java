
package ru.geekbrains.lesson3weather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lesson1weather.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements Constants {
    private String textCity;
    private final static int REQUEST_CODE=1;
    private boolean windBox; //wind_velocity
    private boolean airBox; //air_pressure
    String windDataKey = "windDataKey";
    String airDataKey = "airDataKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_choice);
        String instanceState;

        if (savedInstanceState == null) {
            instanceState = "Первый запуск!";
        } else {
            instanceState = "Повторный запуск!";
        }
        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();
        Log.d("STATE", " - onCreate()");

        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    EditText city = findViewById(R.id.city1);

                    Const const1 = new Const();
                    const1.activeCity = city.getText().toString();
                    Intent intent = new Intent(MainActivity.this, Weather.class);
                    // Получить значение из EditText и сохранить его в интент
                    intent.putExtra(TEXT, const1);
                    startActivityForResult(intent, REQUEST_CODE);
                }
            });
        Button mybutton_city1 = findViewById(R.id.button_city1);
        mybutton_city1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText city = findViewById(R.id.city1);
                city.setText(getString(R.string.button_city1));
            }
        });
        Button mybutton_city2 = findViewById(R.id.button_city2);
        mybutton_city2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText city = findViewById(R.id.city1);
                city.setText(getString(R.string.button_city2));
            }
        });
        Button mybutton_city3 = findViewById(R.id.button_city3);
        mybutton_city3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText city = findViewById(R.id.city1);
                city.setText(getString(R.string.button_city3));
            }
        });
        Button mybutton_city4 = findViewById(R.id.button_city4);
        mybutton_city4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText city = findViewById(R.id.city1);
                city.setText(getString(R.string.button_city4));
            }
        });
        Button mybutton_city5 = findViewById(R.id.button_city5);
        mybutton_city5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText city = findViewById(R.id.city1);
                city.setText(getString(R.string.button_city5));
            }
        });
        Button mybutton_city6 = findViewById(R.id.button_city6);
        mybutton_city6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText city = findViewById(R.id.city1);
                city.setText(getString(R.string.button_city6));
            }
        });
        Button mybutton_city7 = findViewById(R.id.button_city7);
        mybutton_city7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText city = findViewById(R.id.city1);
                city.setText(getString(R.string.button_city7));
            }
        });
        Button mybutton_city8 = findViewById(R.id.button_city8);
        mybutton_city8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText city = findViewById(R.id.city1);
                city.setText(getString(R.string.button_city8));
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != REQUEST_CODE) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == RESULT_OK){
            EditText ac = findViewById(R.id.city1);
            ac.setText(data.getStringExtra("activeCity"));
        }
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
        airBox = saveInstanceState.getBoolean("airDataKey");
        windBox = saveInstanceState.getBoolean("windDataKey");
        textCity = saveInstanceState.getString("cityDataKey");
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
        String cityDataKey = "cityDataKey";
        saveInstanceState.putBoolean(windDataKey, windBox);
        saveInstanceState.putBoolean(airDataKey, airBox);
        saveInstanceState.putString(cityDataKey, textCity);
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

