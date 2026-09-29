package com.examplecc.proyecto_accede

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Creamos variables asociandolas a las vistas
        val nombre  : EditText = findViewById(R.id.Nombre)
        val Miboton : Button = findViewById(R.id.Miboton)
        val limpiar : Button = findViewById(R.id.Miboton2)
        val mensaje : TextView =findViewById(R.id.Mensaje)


        //Boton saludar
        Miboton.setOnClickListener {
            val textoIntroducido = nombre.text.toString()


            if (textoIntroducido.isEmpty()){


                Toast.makeText(this,"Tioooo que ESCRIBASSSSSSSSSS",Toast.LENGTH_LONG).show()

            }
            else {
                Toast.makeText(this, "bravo has pulsado $textoIntroducido", Toast.LENGTH_LONG).show()
                mensaje.text="Holaaaaa eso es , $textoIntroducido"
            }

        }
        limpiar.setOnClickListener {
            nombre.text.clear()
            mensaje.text= ""
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}