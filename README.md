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
            return null
        }
    
        constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()
        )
    
        override fun writeToParcel(parcel: Parcel, flags: Int) {
            parcel.writeString(name)
            parcel.writeString(url)
        }
    
        override fun describeContents(): Int {
            return 0
        }
    
        companion object CREATOR : Parcelable.Creator<Image> {
            override fun createFromParcel(parcel: Parcel): Image {
                return Image(parcel)
            }
    
            override fun newArray(size: Int): Array<Image?> {
                return arrayOfNulls(size)
            }
        }
    
    }
```

#### 2. Create a java bean class implements ImageEntry.

#### 3. Set Banner data and set OnItemClickListener, OnItemBindListener.

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