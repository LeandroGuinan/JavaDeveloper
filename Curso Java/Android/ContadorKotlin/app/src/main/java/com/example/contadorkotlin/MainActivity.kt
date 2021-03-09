package com.example.contadorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var contador = 0

    fun incrementar(view: View){
        this.contador++
        this.text.text = this.contador.toString()
    }

    fun reiniciar(view: View){
        contador = 0
        this.text.text = this.contador.toString()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.text)
       // textView.setText("Holiii")
        //textView.text = "Hola bb"
    }
}