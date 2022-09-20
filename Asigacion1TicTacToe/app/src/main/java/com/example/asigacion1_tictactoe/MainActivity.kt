package com.example.asigacion1_tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //Declarar jugadores y name para indicar a que jugador le toca
    lateinit var noseleccion: IntArray
    val jugador1 = 1
    val jugador2 = 0
    var actual = jugador1
    lateinit var name: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noseleccion = intArrayOf(
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1
        ) //Es un array q contiene los 9 valores, para evitar q pueda repetirse
        name = findViewById<TextView>(R.id.textView2)

        val b1 = findViewById<Button>(R.id.b01)
        val b2 = findViewById<Button>(R.id.b02)
        val b3 = findViewById<Button>(R.id.b03)
        val b4 = findViewById<Button>(R.id.b04)
        val b5 = findViewById<Button>(R.id.b05)
        val b6 = findViewById<Button>(R.id.b06)
        val b7 = findViewById<Button>(R.id.b07)
        val b8 = findViewById<Button>(R.id.b08)
        val b9 = findViewById<Button>(R.id.b09)

        //Para que agarre la funcion de abajo
        b1.setOnClickListener(this)
        b2.setOnClickListener(this)
        b3.setOnClickListener(this)
        b4.setOnClickListener(this)
        b5.setOnClickListener(this)
        b6.setOnClickListener(this)
        b7.setOnClickListener(this)
        b8.setOnClickListener(this)
        b9.setOnClickListener(this)


    }

    @SuppressLint("SetTextI18n")
    override fun onClick(p0: View?) {
        val btnClick = findViewById<Button>(p0!!.id) //Capturamos el id
        val presionaClick =
            Integer.parseInt(btnClick.tag.toString()) //Cuando se presiona cualquier boton se almacena aca


        if (noseleccion[presionaClick] != -1)
            return

        noseleccion[presionaClick] = actual

        if (actual == jugador1) {
            btnClick.text = "O"
            actual = jugador2
            name.text = "Le toca al jugador 2"
        } else {
            btnClick.text = "X"
            actual = jugador1
            name.text = "Le toca al jugador 1"
        }
        win()

    }

    private fun win() {
        var positionWin = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
            intArrayOf(1, 4, 7),
            intArrayOf(2, 5, 8),
            intArrayOf(3, 6, 9),
            intArrayOf(1, 5, 9),
            intArrayOf(7, 5, 3),
            intArrayOf(3, 5, 7)
        )
        for (i in 0 until positionWin.size){
            var primer = positionWin[i][0]
            var segundo = positionWin[i][1]
            var tercero = positionWin[i][2]

            if(noseleccion[primer]==noseleccion[segundo] && noseleccion[segundo]==noseleccion[tercero]){
                if(noseleccion[primer]==jugador1){
                    name.text = "El jugador 1 es el ganador"
                }else{
                    name.text="El jugador 2 es el ganador"
                }
            }
        }
    }
}

