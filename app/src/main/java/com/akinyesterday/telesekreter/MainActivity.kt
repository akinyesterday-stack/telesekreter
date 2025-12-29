package com.akinyesterday.telesekreter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.akinyesterday.telesekreter.ui.theme.TelesekreterTheme

/**
 * MainActivity - Main application entry point using Jetpack Compose
 * 
 * This activity serves as the primary entry point for the Telesekreter application.
 * It sets up the Compose UI hierarchy and applies the application theme.
 * 
 * Created: 2025-12-29 05:10:08 UTC
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelesekreterTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

/**
 * MainScreen - Root composable for the application UI
 * 
 * This composable defines the main user interface structure
 * and can be extended with navigation and other UI components.
 */
@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    // TODO: Add your main UI content here
    // This is where you'll integrate navigation, state management, and UI components
}

/**
 * Preview composable for MainScreen
 * Used for UI development and testing in Android Studio
 */
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    TelesekreterTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            MainScreen()
        }
    }
}
