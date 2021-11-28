//
// Created by ligh1 on 11/28/2021.
//
#include "chem.h"
#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_vaca_chemcalc_ChemCalc_chemBalan(JNIEnv *env, jobject thiz, jbyteArray chem) {
    signed char *arrayChem = env->GetByteArrayElements(chem, NULL);
    ChemEquation *chemEquation = new ChemEquation(reinterpret_cast<const char *>(arrayChem));
    string result=chemEquation->myResult();
    delete chemEquation;
    return env->NewStringUTF(result.c_str());
}