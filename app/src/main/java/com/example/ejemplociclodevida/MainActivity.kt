package com.example.ejemplociclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var nombre = "Marla"
    val NOMBRE = "nombre"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)

        //Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()

        boton.setOnClickListener{
            nombre = "Suzzet"
            Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        nombre = savedInstanceState?.getString(NOMBRE)!!
        Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putString(NOMBRE, nombre)
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "en transición", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "aplicativo oculto", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "aplicativo visible", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "App destruida", Toast.LENGTH_SHORT).show()
    }
}