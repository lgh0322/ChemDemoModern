package com.vaca.chemcalc

object ChemCalc {
    init {
        System.loadLibrary("chem-lib")
    }
    external fun chemBalan(chem: ByteArray): String
}