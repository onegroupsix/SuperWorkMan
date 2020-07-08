package com.example.lee.superworkman.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Created by Administrator on 2017/12/20 0020.
 */

public class Common {
    //获取当前app版号本
    public static int getVerCode(Context context){
        int vercode= -1;
        try {
            vercode = context.getPackageManager().getPackageInfo(context.getPackageName(),0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("msg",e.getMessage());
        }
        return vercode;
    }
    //获取版本名称
    public static String getVerName(Context context){
        String verName="";
        try {
            verName =context.getPackageManager().getPackageInfo(context.getPackageName(),0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("msg",e.getMessage());
        }
        return verName;
    }
}
