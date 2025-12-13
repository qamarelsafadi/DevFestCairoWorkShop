package com.qamar.devfestcairoworkshop.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.qamar.devfestcairoworkshop.ui.screens.login.LoginScreen
import com.qamar.devfestcairoworkshop.ui.screens.main.MainScreen
import com.qamar.devfestcairoworkshop.ui.screens.splash.SplashScreen

@Composable
fun AppNavigation() {
    val appNavigator = rememberAppNavigator()
    val entries = entryProvider<Any> {
        entry<SplashScreen> {
            SplashScreen {
                appNavigator.navigateWithReplace(LoginScreen)
            }
        }
        entry<LoginScreen> {
            LoginScreen {
                appNavigator.navigateWithReplace(MainScreen("DevFestCairo"))
            }
        }
        entry<MainScreen> {
            MainScreen(it.name) {
                appNavigator.navigateWithClearBackstack(LoginScreen)
            }
        }
    }

    NavDisplay(
        backStack = appNavigator.backStack,
        entryProvider = entries,
        onBack = appNavigator::popUp

    )
}
