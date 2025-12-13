package com.qamar.devfestcairoworkshop.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack

class AppNavigator(
    val backStack: NavBackStack<NavKey>
) {
    fun navigate(route: NavKey) {
        backStack.add(route)
    }

    fun navigateWithReplace(
        route: NavKey
    ) {
        if (backStack.isNotEmpty())
            popUp()
        navigate(route)
    }

    fun popUp() {
        backStack.removeAt(backStack.lastIndex)
    }

    fun navigateWithClearBackstack(route: NavKey) {
        backStack.clear()
        navigate(route)
    }
}

@Composable
fun rememberAppNavigator(): AppNavigator {
    val backstack = rememberNavBackStack(SplashScreen)
    return remember {
        AppNavigator(backstack)
    }
}

