# Viewer

[![](https://jitpack.io/v/com.sunzn/viewer.svg)](https://jitpack.io/#com.sunzn/viewer)
[![](https://img.shields.io/badge/License-Apache%202.0-orange.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

### Gradle

#### 1. Add the JitPack repository to your build file.

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
 }
```

#### 2. Add the dependency.

```groovy
dependencies {
    implementation 'com.sunzn:viewer:1.0.3'
}
```

### How to use

#### 1. Create a java bean class implements ImageEntry.

```kotlin
data class Image(var name: String?, var url: String?) : ImageEntry {

    override fun initImageUrl(): String? {
        return url
    }

    override fun initImageTxt(): String? {
        return name
    }

}
```

#### 2. Fill data and browse pictures.

```kotlin
val data: ArrayList<Image> = ArrayList()
for (i in 0..10) {
    data.add(
        Image(
            i.toString(),
            "http://pic1.win4000.com/mobile/2019-11-22/5dd73dfccb5a7.jpg"
        )
    )
}
ImageViewer<Image>().setImages(data).setPosition(0).view(this)
```

#### 3. Custom theme, improve UI display.

```xml
<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

    <style name="ImageActivity" parent="AppTheme">
        <item name="android:windowTranslucentStatus">true</item>
    </style>

</resources>
```

### License
```
    Copyright [2019-2020] sunzn

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
```