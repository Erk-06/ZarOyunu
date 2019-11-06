package com.erdi.karabulut.zaroyunu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val random= Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun playGame(view: View)
    {
        var value1:Int=rastgeleZarDegerleriAl()
        var value2:Int=rastgeleZarDegerleriAl()

        // resim de�erlerini alma.
        var picture1:Int=resources.getIdentifier("dice_"+value1,"drawable",packageName)
        var picture2:Int=resources.getIdentifier("dice_"+value2,"drawable",packageName)

        // resimleri y�kleme
        imgView1.setImageResource(picture1)
        imgView2.setImageResource(picture2)

        // sonuclar� g�sterme
        textView2.setText(value1.toString())
        textView3.text=value2.toString()
    }

    // Random de�er �reten fonksiyon
    fun rastgeleZarDegerleriAl():Int
    {
        return random.nextInt(6)+1//1 ile 6 aras�
    }
}
