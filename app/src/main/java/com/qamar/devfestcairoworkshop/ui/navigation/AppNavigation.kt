
package com.qamar.devfestcairoworkshop.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.qamar.devfestcairoworkshop.ui.screens.login.LoginScreen
import com.qamar.devfestcairoworkshop.ui.screens.login.LoginScreenUiState
import com.qamar.devfestcairoworkshop.ui.screens.main.MainScreen
import com.qamar.devfestcairoworkshop.ui.screens.main.MainScreenUiState
import com.qamar.devfestcairoworkshop.ui.screens.splash.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.Splash::class
    ) {
        composable<Screens.Splash> {
            SplashScreen(
                onNavigateToLogin = {
                    navController.navigateToLogin()
                }
            )
        }
        composable<Screens.Login> {
            LoginScreen(
                onNavigateToMain = {
                    navController.navigateToMain()
                },
            )
        }
        composable<Screens.Main> { backStackEntry ->
            val mainScreenArgs = backStackEntry.toRoute<Screens.Main>()
            MainScreen(
                onNavigateToLogin = {
                    navController.navigateToLogin()
                },
            )
        }
    }
}
