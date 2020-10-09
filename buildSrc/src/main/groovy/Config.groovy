class Config {
    static compileSdkVersion = 29
    static buildToolsVersion = "29.0.3"

    static applicationId = "com.example.baseapplication"
    static minSdkVersion = 16
    static targetSdkVersion = 29
    static versionCode = 1
    static versionName = "1.0"


    static depConfig = [
            //glide 'com.github.bumptech.glide:glide:3.7.0'
            //图片加载(带有特效)
            glide                  : "jp.wasabeef:glide-transformations:3.0.1",
            utilcode               : "com.blankj:utilcode:1.29.0",
            BaseRecyclerViewAdapter: 'com.github.CymChad:BaseRecyclerViewAdapterHelper:3.0.4',
            //阿里路由框架
            arouter                : [
                    "arouter_api"     : 'com.alibaba:arouter-api:1.4.1',
                    "arouter_compiler": "com.alibaba:arouter-compiler:1.2.2"
            ],
            androidx               : [
                    appcompat       : 'androidx.appcompat:appcompat:1.2.0',
                    core_ktx        : 'androidx.core:core-ktx:1.3.2',
                    constraintlayout: 'androidx.constraintlayout:constraintlayout:2.0.2',
                    junit           : 'androidx.test.ext:junit:1.1.2',
                    espresso        : 'androidx.test.espresso:espresso-core:3.3.0'

            ],

    ]


}