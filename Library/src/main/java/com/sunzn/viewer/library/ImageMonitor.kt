package com.sunzn.viewer.library

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.github.chrisbanes.photoview.PhotoView

class ImageMonitor<T : ImageEntry> : Fragment(), View.OnClickListener {

    lateinit var item: T

    companion object {
        fun <T : ImageEntry> instance(item: T?): ImageMonitor<T> {
            val fragment = ImageMonitor<T>()
            val bundle = Bundle()
            bundle.putSerializable("item", item)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            item = arguments!!.getParcelable("item")!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.image_monitor, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val image: PhotoView = view.findViewById(R.id.image)
        image.maximumScale = 5F
        Glide.with(image)
            .load(item.initImageUrl())
            .into(image)
    }

    override fun onClick(v: View?) {
        // TODO
    }

}