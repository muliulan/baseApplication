class Config {
    static compileSdkVersion = 29
    static buildToolsVersion = "29.0.3"

    static applicationId = "com.example.baseapplication"
    static minSdkVersion = 16
    static targetSdkVersion = 29
    static versionCode = 1
    static versionName = "1.0"
    static kotlin_version = '1.4.0'

    static isBuildModule = false

    static depConfig = [

            //阿里路由框架
            arouter     : [
                    "arouter_api"     : 'com.alibaba:arouter-api:1.4.1',
                    "arouter_compiler": "com.alibaba:arouter-compiler:1.2.2"
            ],

            library_base: [
                    //图片加载(带有特效)
                    glide                  : 'com.github.bumptech.glide:glide:3.7.0',
//                    glide_transformations  : "jp.wasabeef:glide-transformations:4.3.0",
                    utilcode               : "com.blankj:utilcode:1.29.0",
                    BaseRecyclerViewAdapter: 'com.github.CymChad:BaseRecyclerViewAdapterHelper:3.0.4',
                    androidx               : [
                            appcompat       : 'androidx.appcompat:appcompat:1.2.0',
                            core_ktx        : 'androidx.core:core-ktx:1.3.2',
                            constraintlayout: 'androidx.constraintlayout:constraintlayout:2.0.2',
                            junit           : 'androidx.test.ext:junit:1.1.2',
                            espresso        : 'androidx.test.espresso:espresso-core:3.3.0',

                    ],
                    material               : "com.google.android.material:material:1.2.0-alpha06",
                    junit                  : 'junit:junit:4.12',
                    kotlin_stdlib_jdk7     : 'org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version',
                    kotlinx_coroutines     : "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.1.1",

                    netWork                : [
                            retrofit2     : 'com.squareup.retrofit2:retrofit:2.5.0',
                            converter_gson: 'com.squareup.retrofit2:converter-gson:2.0.2',
                            gson          : 'com.google.code.gson:gson:2.8.4',
                            rxjava        : 'io.reactivex.rxjava2:rxjava:2.0.1',
                            rxandroid     : 'io.reactivex.rxjava2:rxandroid:2.0.1',
                    ],
                    lifecycle              : [
                            viewmodel : "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0",
                            extensions: 'androidx.lifecycle:lifecycle-extensions:2.0.0',
                    ],
                    navigation             : [
                            navigation_ui      : 'androidx.navigation:navigation-ui-ktx:2.3.0-alpha05',
                            navigation_fragment: 'androidx.navigation:navigation-fragment-ktx:2.3.0-alpha05',
                            navigation_dynamic : 'androidx.navigation:navigation-dynamic-features-fragment:2.3.0-alpha05',
                    ],
                    kodein_di              : 'org.kodein.di:kodein-di-generic-jvm:6.5.5',
                    kodein_di_framework    : 'org.kodein.di:kodein-di-framework-android-x:6.5.5',
                    multidex               : 'com.android.support:multidex:1.0.1',
                    pager_bottom           : 'me.majiajie:pager-bottom-tab-strip:2.3.0X',
                    viewpager2             : 'androidx.viewpager2:viewpager2:1.0.0',
                    mmkv                   : 'com.tencent:mmkv:1.0.23',

            ],


    ]


}