package com.example.learn_navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Desktopn(
    @StringRes val name: Int,
    @StringRes val Desc:Int,
)

val desktops = listOf(
    Desktopn(R.string.desk_name_1,R.string.desk_description_1),
    Desktopn(R.string.desk_name_2,R.string.desk_description_2),
    Desktopn(R.string.desk_name_3,R.string.desk_description_3),

    )