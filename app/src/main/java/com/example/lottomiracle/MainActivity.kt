package com.example.lottomiracle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import com.example.lottomiracle.lotto as lotto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnCreate_Onclick(view: View) {
        val lotto = lotto();
        var strText = "";
        for(i in 0..5) {
            val arrData = lotto.makeNum();


            for (i in 0..arrData.size - 1)
                strText += "    " + arrData[i].toString();

            strText += "\n"
        }
        tv_Lotto.text =strText;

    }

}