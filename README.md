# FunBox

学习Android的一些记录

## 如何使用


## TopFuncUtil.kt 扩展了一些函数

| 函数名  | 说明 |
|:-:| :-: |
| String.toast | 显示吐司 |
| Any.log | DEBUG下打印日志 |
| Date.format | 日期格式化 |
| String.md5 | MD5加密 |
| String.sha1| sha1加密 |
| String.sha256| sha256加密 |

## 使用注意事项

### 1. App 的 build.gradle添加 

```groovy
// 添加kotlin注解插件
apply plugin: 'kotlin-kapt'

android{
    // 配置JDK1.8
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}

dependencies{
    // 依赖我们的库
    implementation project(path: ':funlib')
    //注解处理器，生成RxHttp类
    annotationProcessor 'com.rxjava.rxhttp:rxhttp-compiler:1.2.1'
    kapt 'com.rxjava.rxhttp:rxhttp-compiler:1.2.1'
}
```

### 2. Project build.gradle添加
```groovy
allprojects{
    maven { url 'https://jitpack.io' }
}
```

### 3. Application 初始化网络请求 [MyApp](https://github.com/wlDayDayUp/FunBox/blob/master/app/src/main/java/com/wl1217/funbox/MyApp.java)

### 4. [混淆文件](https://github.com/wlDayDayUp/FunBox/blob/master/app/proguard-rules.pro)

### 5. 创建Url类，用于rebuild，RxHttp类，[Url](https://github.com/wlDayDayUp/FunBox/blob/master/app/src/main/java/com/wl1217/funbox/Url.kt) 

### 6. AndroidMainfest.xml

res/xml下：[file_paths](https://github.com/wlDayDayUp/FunBox/tree/master/app/src/main/res/xml)
  
1. 添加相应权限

2. application节点下
    - android:networkSecurityConfig="@xml/network_config"
    - android:name=".MyApp"
3. 兼容 Android 7.0 
    ```xml
      <provider
            android:name="androidx.core.content.FileProvider"
            android:authorities="包名.fileprovider"
            android:exported="false"
            android:grantUriPermissions="true">
            <meta-data
                android:name="android.support.FILE_PROVIDER_PATHS"
                android:resource="@xml/file_paths" />
        </provider>
    ```
    

### 内部使用了三方库
 
- [Rxhttp](https://github.com/liujingxing/RxHttp)

