package com.qamar.devfestcairoworkshop.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable


@Serializable
data object SplashScreen : NavKey
data object LoginScreen : NavKey
data class MainScreen(val name: String) : NavKey


//sealed interface Screens {
//    @Serializable
//    data object SplashScreen : Screens
//
//    @Serializable
//    data object LoginScreen : Screens
//
//    @Serializable
//    data class MainScreen(val userName: String = "DevFest") : Screens
//}
