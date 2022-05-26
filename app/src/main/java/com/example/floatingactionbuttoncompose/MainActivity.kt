package com.example.floatingactionbuttoncompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.floatingactionbuttoncompose.ui.theme.FloatingActionButtonComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FloatingActionButtonComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        SimpleFloatingAction()
                        SimpleIconAction()
                    }
                }
            }
        }
    }
}

@Composable
fun SimpleFloatingAction(){
    val context = LocalContext.current
    ExtendedFloatingActionButton(
        text = { Text(text = "Fluid Dab") },
        onClick = { Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show() },
        icon = { Icon(Icons.Filled.Favorite, contentDescription ="Favorite" )},
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun SimpleIconAction(){
    val context = LocalContext.current

    FloatingActionButton(
        onClick = {
            Toast.makeText(context,"Clicked",Toast.LENGTH_SHORT).show()},
        modifier = Modifier.padding(16.dp)
     ){
        Icon(Icons.Filled.Favorite, contentDescription = "Favorite")
    }
}