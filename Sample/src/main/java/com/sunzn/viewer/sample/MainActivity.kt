package com.sunzn.viewer.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sunzn.viewer.library.ImageViewer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data: ArrayList<Image> = ArrayList()
        for (i in 0..10) {
            when (i) {
                0 -> {
                    data.add(
                        Image(
                            i.toString(),
                            "http://pic1.win4000.com/mobile/2019-11-22/5dd73dfccb5a7.jpg"
                        )
                    )
                }
                1 -> {
                    data.add(
                        Image(
                            i.toString() + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111",
                            "http://pic1.win4000.com/mobile/2019-11-22/5dd73dfd7d486.jpg"
                        )
                    )
                }
                2 -> {
                    data.add(
                        Image(
                            i.toString(),
                            "http://pic1.win4000.com/mobile/2019-11-22/5dd73dfe2cacc.jpg"
                        )
                    )
                }
                3 -> {
                    data.add(
                        Image(
                            i.toString(),
                            "http://pic1.win4000.com/mobile/2019-11-22/5dd73dfed74f5.jpg"
                        )
                    )
                }
                4 -> {
                    data.add(
                        Image(
                            i.toString(),
                            "http://pic1.win4000.com/mobile/2019-11-22/5dd73dff877bd.jpg"
                        )
                    )
                }
                5 -> {
                    data.add(
                        Image(
                            i.toString(),
                            "http://pic1.win4000.com/mobile/2019-11-22/5dd73e00441d5.jpg"
                        )
                    )
                }
                6 -> {
                    data.add(
                        Image(
                            i.toString(),
                            "http://pic1.win4000.com/mobile/2019-11-22/5dd73e00e8d9e.jpg"
                        )
                    )
                }
                7 -> {
                    data.add(
                        Image(
                            i.toString(),
                            "http://pic1.win4000.com/mobile/2019-11-22/5dd73e01c2762.jpg"
                        )
                    )
                }
                8 -> {
                    data.add(
                        Image(
                            i.toString(),
                            "http://pic1.win4000.com/mobile/2019-11-28/5ddf2e66111ae.jpg"
                        )
                    )
                }
                9 -> {
                    data.add(
                        Image(
                            i.toString(),
                            "http://pic1.win4000.com/mobile/2019-11-28/5ddf2e69d9b29.jpg"
                        )
                    )
                }
            }
        }

        ImageViewer<Image>().setImages(data).setPosition(0).view(this)
    }
}
