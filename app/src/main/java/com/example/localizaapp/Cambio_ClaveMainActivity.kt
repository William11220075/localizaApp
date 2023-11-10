package com.example.localizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cambio_ClaveMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambio_clave_main)

     val botonSix = findViewById<Button>(R.id.button6)
     botonSix.setOnClickListener {
         goTobotonSix()
     val iniciPri = findViewById<Button>(R.id.button7)
     iniciPri.setOnClickListener {
         goToInici()
     }
     }
    }
    private fun goTobotonSix(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun goToInici(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}