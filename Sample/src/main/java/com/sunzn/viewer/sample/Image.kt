package com.sunzn.viewer.sample

import android.os.Parcel
import android.os.Parcelable
import com.sunzn.viewer.library.ImageEntry

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