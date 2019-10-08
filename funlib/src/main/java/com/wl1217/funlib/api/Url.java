package com.wl1217.funlib.api;

import com.wl1217.funlib.FunBox;

import java.util.HashMap;

import rxhttp.wrapper.annotation.DefaultDomain;

/**
 * 1. 通过注解生成Rxhttp类，类名不能随便改，只能叫Url
 * 2. 配置所有接口的地址
 * 3. DefaultDomain注解，需要ReBuild project，自动生成RxHttp类
 */
public final class Url {

    @DefaultDomain()
    public final static String baseUrl = FunBox.INSTANCE.getBaseUrl();   /* 修改需要ReBuild project 默认接口地址前部*/

    /*--------------------------------------接口定义*************开始----------------------------------------------------*/

    public final static String login = "/users/login";                  /* POST 测试*/

    public final static String getCs = "/test/getCs";                   /* GET 测试*/

    public final static String oneUploadFile = "/test/uploadfile";      /* 单个文件上传 测试*/

    public final static String moreUploadFile = "/test/uploadfiles";    /* 多个文件上传 测试*/

    public final static String updateVserion = "/update/version.txt";   /* 检查更新*/

    public final static String downApk = "/update/test.apk";            /* 下载更新APK文件*/

    // >>>
    public final static String testSign = "https://app1.sqsmk.net:443/sqsmk/ykapp/user/dologin";

//    public static HashMap<String, String> dologin(String username, String userpwd, String logintype, String token) {
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("username", username);
//        hashMap.put("userpwd", userpwd);
//        hashMap.put("logintype", logintype);
//        return RequestConvert.INSTANCE.getRequestData(hashMap, token);
//    }

    /*--------------------------------------接口定义*************结束----------------------------------------------------*/
}
