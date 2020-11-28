package com.example.lottomiracle

import java.util.*
import kotlin.collections.RandomAccess

class lotto {
    fun lotto(){}

    fun makeNum() : Array<Int> {

        var arrData= arrayOf(0,0,0,0,0,0);
        var isSame =false;
        for (i in 0..5)
        {
            var number = random();
            for(i in 0..arrData.size-1)
            {
                if(arrData[i]==number)
                    isSame=true;
            }
            if(!isSame)
                arrData[i]=number;
            else
                arrData[i]= random();
        }

        return arrData;
    }

    private fun random() : Int {
        val random = Random();
        var iNumber = random.nextInt(45) + 1;

        return iNumber;
    }
}