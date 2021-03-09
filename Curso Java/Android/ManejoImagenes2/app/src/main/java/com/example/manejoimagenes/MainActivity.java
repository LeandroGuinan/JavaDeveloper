package com.example.manejoimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private boolean band = true;
    public void cambiarImagen(View view){
        Log.i("Boton","Boton presionado");

        ImageView imagen = findViewById(R.id.imageView);



        if(band){
            imagen.setImageResource(R.drawable.css3);
            band = false;
        }else{
            imagen.setImageResource(R.drawable.html);
            band = true;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}