package com.example.localizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IniciarMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_main)
    // Se crea la variable val btn_inicio para devolverse a la ventana principal
        val btnInicio = findViewById<Button>(R.id.btn_inicio)
        btnInicio.setOnClickListener {
            goToInicio()

        val txtClavereset = findViewById<TextView>(R.id.textView4)
        txtClavereset.setOnClickListener {
            goToClave()
        }
        }

    }
    private fun goToInicio(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun goToClave(){
        val i = Intent(this, Cambio_ClaveMainActivity::class.java )
        startActivity(i)
    }
}