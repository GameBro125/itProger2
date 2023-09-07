package com.example.itproger2

import androidx.annotation.DrawableRes

class Item(val id:Int, val image:String, val title:String, val desc:String, val text:String, val price:Int, @DrawableRes val imageRes: Int) {
}