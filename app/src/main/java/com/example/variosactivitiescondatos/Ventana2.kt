package com.example.variosactivitiescondatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variosactivitiescondatos.databinding.ActivityMainBinding
import com.example.variosactivitiescondatos.databinding.ActivityVentana2Binding

class Ventana2 : AppCompatActivity() {

    lateinit var binding : ActivityVentana2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)

        binding = ActivityVentana2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var nombre = intent.getStringExtra("nombre")
        var edad = intent.getStringExtra("edad")

        binding.cajaNombre.setText(nombre)
        binding.cajaEdad.setText(edad)

        binding.boton.setOnClickListener {
            finish()
        }

    }
}