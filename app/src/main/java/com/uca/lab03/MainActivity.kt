package com.uca.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var dinero: TextView
    private lateinit var diez: ImageView
    private lateinit var cinco: ImageView
    private lateinit var cora : ImageView
    private lateinit var dolar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diez  = findViewById(R.id.diezctvs)
        cinco = findViewById(R.id.cincoctvs)
        cora = findViewById(R.id.coractvs)
        dolar = findViewById(R.id.dolarctvs)
        dinero = findViewById(R.id.dineroview)
        dinero.setText("0.00")
        diez.setOnClickListener {
            calcularDinero(0.10)
        }
        cinco.setOnClickListener {
            calcularDinero(0.05)
        }
        cora.setOnClickListener {
            calcularDinero(0.25)
        }
        dolar.setOnClickListener {
            calcularDinero(1.00)
        }
    }

    private fun calcularDinero(d: Double) {
        var actual:String
        var actualD:Double
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.DOWN
        actual = dinero.text.toString()
        actualD = actual.toDouble()
        dinero.setText((df.format(d+actualD).toString()))
    }
}