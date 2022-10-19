package com.example.learn_navigation

sealed class Screen(val rout:String){
    object Home:Screen("main_screen")
    object LaptopScreen:Screen("laptop_screen")
    object DesktopScreen:Screen("desktop_screen")
    object SoftwareScreen:Screen("software_screen")
    object About:Screen("about_screen")
}
