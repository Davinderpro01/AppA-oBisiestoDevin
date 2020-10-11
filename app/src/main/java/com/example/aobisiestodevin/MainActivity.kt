package com.example.aobisiestodevin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        var año = txtAño.text.toString().toInt()
        if (año.rem(4).equals(0))
        {
            var impresion="El año es bisiesto"
            textView3.text=impresion.toString()
        }
        else
        {
            var impresion="No es año bisiesto"
            textView3.text=impresion.toString()
        }



    }
}