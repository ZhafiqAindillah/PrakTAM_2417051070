package com.example.praktam_2417051070

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.praktam_2417051070.ui.theme.PrakTAM_2417051070Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrakTAM_2417051070Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "M Zhafiq Aindillah Sani",
                        npm = "2417051070",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, npm: String) {
    Text(
        text = "Halo, saya $name dengan NPM $npm siap belajar Compose!",
        modifier = modifier
    )
}

@Composable
fun GreetingPreview() {
    PrakTAM_2417051070Theme {
        Greeting("M Zhafiq Aindillah Sani", npm = "2417051070")
    }
}