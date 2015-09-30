#include "org_nhnnext_ndktest_MainActivity.h"
#include <stdio.h>
#include <string.h>

char* PrintEJ() {
	return "EJ";
}

char* PrintNDK() {
	return "NDK!";
}

char* AddString() {
	char* new_str[7];
	new_str[0] = '\0';
	strcat(new_str, PrintEJ());
	strcat(new_str, PrintNDK());

	return new_str;
}

JNIEXPORT jstring Java_org_nhnnext_ndktest_MainActivity_getStringFromNativeEJ( JNIEnv* env, jobject obj) {

	return (*env)->NewStringUTF(env, "EJ");
}

JNIEXPORT jstring Java_org_nhnnext_ndktest_MainActivity_getStringFromNativeNDK( JNIEnv* env, jobject obj) {

	return (*env)->NewStringUTF(env, "NDK!");
}

JNIEXPORT jstring Java_org_nhnnext_ndktest_MainActivity_getAddedStringFromNative( JNIEnv* env, jobject obj) {

	return (*env)->NewStringUTF(env, AddString());
}