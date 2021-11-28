package com.vaca.chemdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.vaca.chemcalc.ChemCalc.chemBalan
import java.lang.Exception
import java.nio.charset.StandardCharsets

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count=0;

        Thread{
            val ga="H2+Ca(CN)2+NaAlF4+FeSO4+MgSiO3+KI+H3PO4+PbCrO4+BrCl+CF2Cl2+SO2=PbBr2+CrCl3+MgCO3+KAl(OH)4+Fe(SCN)3+PI3+Na2SiO3+CaF2+H2O"
            while(true){
                chemBalan(ga.toByteArray(StandardCharsets.US_ASCII))
                count++;
            }
        }.start()


        Thread{
            while(true){
                Thread.sleep(1000)
                Log.e("count",count.toString())
                count=0;
            }
        }.start()

    }
}