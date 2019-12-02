package com.sunzn.viewer.library

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.viewpager2.widget.ViewPager2

class ImageActivity<T : ImageEntry> : AppCompatActivity() {

    private var imageSite: Int = 0
    private var imageData: ArrayList<T>? = null
    private lateinit var imageHolder: ViewPager2
    private lateinit var imageMemo: AppCompatTextView
    private lateinit var imageAdapter: ImageAdapter<T>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_activity)
        init()
    }

    private fun init() {
        initPara()
        initView()
        initData()
        bindView()
    }

    private fun initPara() {
        imageData = intent.getParcelableArrayListExtra<T>("data")
        imageSite = intent.getIntExtra("position", 0)
    }

    private fun initView() {
        imageMemo = findViewById(R.id.image_memo)
        imageHolder = findViewById(R.id.image_holder)
    }

    private fun initData() {
        imageAdapter = ImageAdapter(this)
        imageAdapter.data = imageData
    }

    private fun bindView() {
        imageHolder.adapter = imageAdapter
        imageHolder.setCurrentItem(imageSite, false)
        imageHolder.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                // TODO
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                // TODO
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                val item: T? = imageAdapter.getItem(position)
                if (item != null) {
                    imageMemo.text = item.initImageTxt() ?: ImageValue.EMPTY
                    imageMemo.visibility = if (imageMemo.text.isNullOrEmpty()) GONE else VISIBLE
                }
            }
        })
    }

}