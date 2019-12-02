package com.sunzn.viewer.library

import android.content.Context
import android.content.Intent

class ImageViewer<T : ImageEntry> {

    private lateinit var images: ArrayList<T>

    private var position = 0

    fun setImages(data: ArrayList<T>): ImageViewer<T> {
        images = data
        return this
    }

    fun setPosition(pos: Int): ImageViewer<T> {
        position = pos
        return this
    }

    fun view(context: Context) {
        view(context, ImageActivity<T>().javaClass)
    }

    private fun view(context: Context, clazz: Class<ImageActivity<T>>) {
        val intent = Intent(context, clazz)
        intent.putParcelableArrayListExtra("data", images)
        intent.putExtra("position", position)
        context.startActivity(intent)
    }

}