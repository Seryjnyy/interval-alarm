package com.wojcik.intervalalarm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wojcik.intervalalarm.ui.theme.IntervalAlarmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntervalAlarmTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WeatherPage()
                }
            }
        }
    }
}

@Composable
fun WeatherPage(){
    HeaderImage()
}

@Composable
fun HeaderImage(){
    Image(
        painter = painterResource(id = R.drawable.img),
        contentDescription = "image",
        modifier = Modifier.width(200.dp)
    )
}

@Preview(showBackground = true, widthDp = 900, heightDp = 1600)
@Composable
fun DefaultPreview(){
    IntervalAlarmTheme {
        WeatherPage()
    }
}