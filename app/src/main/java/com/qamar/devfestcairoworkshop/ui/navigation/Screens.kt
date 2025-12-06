
package com.qamar.devfestcairoworkshop.ui.navigation

import kotlinx.serialization.Serializable

sealed interface Screens {
    @Serializable
    data object Splash : Screens

    @Serializable
    data object Login : Screens

    @Serializable
    data class Main(val userName: String = "DevFest") : Screens
}
