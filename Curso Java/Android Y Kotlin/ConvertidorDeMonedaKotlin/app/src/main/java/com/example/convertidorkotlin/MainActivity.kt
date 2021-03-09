package com.example.convertidorkotlin

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    /*fun convertir(view: View){
        var editText:EditText = findViewById(R.id.cantidadPesos)


        var pesosString:String = editText.text.toString()
        var pesosDouble:Double = pesosString.toDouble()

        var dolaresDouble:Double = pesosDouble*0.045
        var dolares = dolaresDouble.toString()
        var dolaresString = String.format("%.2f",dolares)
        Toast.makeText(this, dolaresString, Toast.LENGTH_LONG).show()



    }*/

    fun convertir(view: View?) {
        val editText = findViewById<EditText>(R.id.cantidadPesos)
        val persosString = editText.text.toString()
        val pesos = persosString.toDouble()
        val dolares = pesos * 19.4
        val dolaresString = String.format("%.2f", dolares)
        val mensaje = "MNX $persosString son en USD: $dolaresString"
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }


}