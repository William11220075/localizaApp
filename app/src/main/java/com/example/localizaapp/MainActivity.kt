package com.example.localizaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGoRegistro =findViewById<TextView>(R.id.tv_go_to_registro)
        tvGoRegistro.setOnClickListener {
            goToRegistro()

        val button = findViewById<Button>(R.id.button)
            button.setOnClickListener {
            goTobutton()

        val botonTwo = findViewById<Button>(R.id.button2)
            botonTwo.setOnClickListener {
            goToBotRes()
            }
            }
        }
    }
    private fun goToRegistro(){
        val i = Intent(this, RegistroMainActivity:: class.java)
        startActivity(i)
    }
    private fun goTobutton(){
        val i = Intent(this,IniciarMainActivity::class.java)
        startActivity(i)
    }
    private fun goToBotRes(){
        val i = Intent(this, RegistroMainActivity::class.java)
        startActivity(i)
    }
}