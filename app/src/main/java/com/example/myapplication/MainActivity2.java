package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textSurname, textName, textThirdName, textClass;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textSurname = findViewById(R.id.textSurname);
        textName = findViewById(R.id.textName);
        textThirdName = findViewById(R.id.textThirdName);
        textClass = findViewById(R.id.textClass);

        Bundle extras = getIntent().getExtras();
        textSurname.setText("Фамилия: " + extras.getString("surname"));
        textName.setText("Имя: " + extras.getString("name"));
        textThirdName.setText("Отчество: " + extras.getString("thirdName"));
        textClass.setText("Класс: " + extras.getString("class"));
    }
}