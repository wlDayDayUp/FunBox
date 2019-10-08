# FunBox

学习Android的一些记录

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

### 1. 添加Java 8 支持

app 的 build.gradle添加
```groovy
android{
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}
```

### 2. API兼容问题

内部使用了三方库 [Rxhttp](https://github.com/liujingxing/RxHttp) 做网络请求,API兼容问题
