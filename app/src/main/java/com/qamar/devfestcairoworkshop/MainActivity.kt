
package com.qamar.devfestcairoworkshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.qamar.devfestcairoworkshop.ui.navigation.AppNavigation
import com.qamar.devfestcairoworkshop.ui.theme.DevFestCairoWorkShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevFestCairoWorkShopTheme {
                AppNavigation()
            }
        }
    }
}
