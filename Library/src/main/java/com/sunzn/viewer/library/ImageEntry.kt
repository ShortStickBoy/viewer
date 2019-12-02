package com.sunzn.viewer.library

import android.os.Parcelable
import java.io.Serializable

interface ImageEntry : Serializable, Parcelable {

    fun initImageUrl(): String?

    fun initImageTxt(): String?

}