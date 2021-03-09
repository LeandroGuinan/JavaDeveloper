package com.example.logyus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){
         EditText textU = findViewById(R.id.Usuario);
         EditText textP = findViewById(R.id.Pass);
        Log.i("Usuario: ", textU.getText().toString());
        Log.i("Password: ",textP.getText().toString());


    }
}