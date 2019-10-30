package com.lazy.kotlin_app

import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingAdapter {
    @BindingAdapter("imageUrl" )
   @JvmStatic  fun loadImage(view :ImageView, url:String){
          Glide.with(view.context)
              .load(url)
              .error(R.mipmap.ic_launcher)
              .into(view)
    }
    @BindingAdapter("Click")
    @JvmStatic fun buttClick(button: Button, user: User){
        button.setOnClickListener {
            Toast.makeText(button.context,"点击事件${user.id}",Toast.LENGTH_LONG).show()
        }
    }
}