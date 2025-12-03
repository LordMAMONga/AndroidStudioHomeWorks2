package com.geeks.hw_1

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImg(img: String) {
    Glide.with(this).load(img).into(this)
}