package com.example.localizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegistroMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_main)
// Se crea la variable val tvGoPrincipal para devolverse a la ventana principal
        val tvGoPrincipal = findViewById<TextView>(R.id.tv_to_go_principal)
        tvGoPrincipal.setOnClickListener {
            goToPrincipal()

        val button = findViewById<Button>(R.id.button4)
            button.setOnClickListener {
                goToPrincipal()
            }
        }
    }
    private fun goToPrincipal(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun goToButton(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}