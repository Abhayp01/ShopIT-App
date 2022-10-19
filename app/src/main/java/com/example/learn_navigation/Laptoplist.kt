package com.example.learn_navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Laptopn(
    @StringRes val name: Int,
    @StringRes val Desc:Int,
)

val laptops = listOf(
    Laptopn(R.string.lap_name_1,R.string.lap_description_1),
    Laptopn(R.string.lap_name_2,R.string.lap_description_2),
    Laptopn(R.string.lap_name_3,R.string.lap_description_3),

)