package com.example.convertidormonedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertir(View view){
        EditText editText = findViewById(R.id.editTex);
        String persosString = editText.getText().toString();
        double pesos = Double.parseDouble(persosString);
        double dolares = pesos *19.4;
        String dolaresString = String.format("%.2f",dolares);

        String mensaje = "MNX "+persosString +" son en USD: " + dolaresString;

        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}