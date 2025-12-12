
package com.qamar.devfestcairoworkshop.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.qamar.devfestcairoworkshop.ui.screens.login.LoginScreen
import com.qamar.devfestcairoworkshop.ui.screens.main.MainScreen
import com.qamar.devfestcairoworkshop.ui.screens.splash.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen::class
    ) {
        composable<Screens.SplashScreen> {
            SplashScreen(
                onNavigateToLogin = {
                    navController.navigateToLogin()
                }
            )
        }
        composable<Screens.LoginScreen> {
            LoginScreen(
                onNavigateToMain = {
                    navController.navigateToMain()
                },
            )
        }
        composable<Screens.MainScreen> { backStackEntry ->
            val mainScreenScreenArgs = backStackEntry.toRoute<Screens.MainScreen>()
            MainScreen(
                name = mainScreenScreenArgs.userName,
                onNavigateToLogin = {
                    navController.navigateToLogin()
                },
            )
        }
    }
}
