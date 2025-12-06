
package com.qamar.devfestcairoworkshop.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.PopUpToBuilder
import androidx.navigation.compose.navigation
import androidx.navigation.navOptions

fun NavController.navigateToLogin() {
    navigate(Screens.Login, navOptions {
        popUpTo(Screens.Splash::class) {
            inclusive = true
        }
    })
}

fun NavController.navigateToMain(userName: String = "DevFest") {
    navigate(Screens.Main(userName), navOptions {
        popUpTo(Screens.Login::class) {
            inclusive = true
        }
    })
}
