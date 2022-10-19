package com.example.learn_navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Softn(
    @StringRes val name: Int,
    @StringRes val Desc:Int,
)

val software = listOf(
    Softn(R.string.soft_name_1,R.string.soft_description_1),
    Softn(R.string.soft_name_2,R.string.soft_description_2),
    Softn(R.string.soft_name_3,R.string.soft_description_3),

    )