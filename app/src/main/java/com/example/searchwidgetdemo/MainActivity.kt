package com.example.searchwidgetdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.searchwidgetdemo.ui.theme.SearchWidgetDemoTheme

class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SearchWidgetDemoTheme {
                MainScreen(mainViewModel = mainViewModel)
            }
        }
    }
}