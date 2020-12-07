#include <stdio.h>
#include "Test.h"

JNIEXPORT void JNICALL Java_Test_nativeMethod(JNIEnv *env, jobject obj){
    jclass testClass = env->FindClass("Ljava/lang/Object;");
    jmethodID mid = env->GetMethodID(testClass,"toString","()Ljava/lang/String;");
    if(mid == NULL){
        printf("Object.toString() メソッドが見つかりませんでした");
        return;
    }
    jstring jstr = (jstring)env->CallObjectMethod(obj,mid);

    const char *nstr = env->GetStringUTFChars(jstr,0);
    printf("ネイティブコードとして実行しています¥njobject:%s¥n",nstr);
    env->ReleaseStringUTFChars(jstr,nstr);
}