package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){
        EditText editText = findViewById(R.id.TextA);
        Log.i("valor: ",editText.getText().toString());

        Toast.makeText(this, "Saludos " +editText.getText().toString(), Toast.LENGTH_LONG).show();
    }
}