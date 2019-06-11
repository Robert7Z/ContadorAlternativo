package com.example.contadoralternativo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private var boton:Button?=null
    private var texto:TextView?=null

    var contadorNuevo = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var entradaUsuario: EditText?= null
        boton = findViewById<Button>(R.id.botoncito)
        entradaUsuario = findViewById<EditText>(R.id.editText)
        texto = findViewById<TextView>(R.id.textView)




        boton?.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View?) {


                val entrada:String = entradaUsuario.text.toString()
                contadorNuevo +=1
              if(contadorNuevo==1)
                texto?.append("usuario!!${entradaUsuario.text.toString()}  ha clickeado $contadorNuevo vez\n")
                else
                  texto?.append("usuario!! $entrada  ha clickeado $contadorNuevo veces\n")
                if(contadorNuevo==10)
                    Toast.makeText(this@MainActivity,"el boton se ha clikeado 10 veces",Toast.LENGTH_SHORT).show()

               // Toast.makeText(this@MainActivity,"se clickeo el boton",Toast.LENGTH_SHORT).show()


            }

        })

    }


}
