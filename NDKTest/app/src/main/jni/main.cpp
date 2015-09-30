#include "org_nhnnext_ndktest_MainActivity.h"

JNIEXPORT jstring JNICALL Java_org_nhnnext_ndktest_MainActivity_getStringFromNative(JNIEnv *env, jobject obj) {
  return env->NewStringUTF("Hello from JNI!");
}
