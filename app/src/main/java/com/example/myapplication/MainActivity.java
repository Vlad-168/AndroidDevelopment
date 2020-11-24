package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText surname, name, thirdName, userClass;
    Button btnAddNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //take information about user
        //check info isEmpty()
        //put to next intent
        surname = findViewById(R.id.editTextSurname);
        name = findViewById(R.id.editTextName);
        thirdName = findViewById(R.id.editTextThirdName);
        userClass = findViewById(R.id.editTextClass);

        btnAddNewUser = findViewById(R.id.buttonAddNewUser);

        btnAddNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surnameStr = surname.getText().toString();
                String nameStr = name.getText().toString();
                String thirdNameStr = thirdName.getText().toString();
                String classStr = userClass.getText().toString();


                if (surnameStr.isEmpty() || nameStr.isEmpty() || thirdNameStr.isEmpty() || classStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Введите верно информацию о пользователе.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("surname", surnameStr);
                    intent.putExtra("name", nameStr);
                    intent.putExtra("thirdName", thirdNameStr);
                    intent.putExtra("class", classStr);

                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference reference = database.getReference("users");

                    UserClassHelper classHelper = new UserClassHelper(surnameStr, nameStr, thirdNameStr, classStr);
                    String key = nameStr + ":" + surnameStr;

                    reference.child(key).setValue(classHelper);

                    startActivity(intent);
                }
            }
        });
    }
    
}