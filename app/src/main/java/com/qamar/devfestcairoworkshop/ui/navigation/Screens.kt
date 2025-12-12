
package com.qamar.devfestcairoworkshop.ui.navigation

import kotlinx.serialization.Serializable

sealed interface Screens {
    @Serializable
    data object SplashScreen : Screens

    @Serializable
    data object LoginScreen : Screens

    @Serializable
    data class MainScreen(val userName: String = "DevFest") : Screens
}
