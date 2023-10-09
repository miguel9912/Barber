package com.example.variosactivitiescondatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.variosactivitiescondatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding//Declaramos nuestro binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)//Asignamos el binding
        setContentView(binding.root)//¿?
        binding.boton.setOnClickListener {
            irAVentana2()
        }


    }

    private fun irAVentana2() {
        var miIntent: Intent = Intent(this, Ventana2::class.java)//Comunicamos con Ventana2
        miIntent.putExtra("nombre", binding.cajaNombre.text.toString())
        miIntent.putExtra("edad", binding.cajaEdad.text.toString())
        startActivity(miIntent)
    }
}