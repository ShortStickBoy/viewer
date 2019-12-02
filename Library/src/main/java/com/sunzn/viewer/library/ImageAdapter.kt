package com.sunzn.viewer.library

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ImageAdapter<T : ImageEntry>(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    var data: MutableList<T>? = null

    fun getItem(position: Int): T? {
        return data?.get(position)
    }

    override fun getItemCount(): Int {
        return data?.size ?: 10
    }

    override fun createFragment(position: Int): Fragment {
        return ImageMonitor.instance(data?.get(position))
    }

}