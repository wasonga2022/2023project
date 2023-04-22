package com.example.bondotti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bondotti.ui.theme.BondoTTITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (){
                Text("Hello Bondo 0")
                Text("Hello Bondo 1")
                Text("Hello Bondo 2")
                Text("Hello Bondo 3")
                Text("Hello Bondo 4")
                Text("Hello Bondo 5")

            }
        }
    }
}


