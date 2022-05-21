package com.example.jetpackcomposetestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.QrCode
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetestapp.ui.theme.JetpackComposeTestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTestAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainApp()
                }
            }
        }
    }
}

@Composable
fun MainApp() {
    Scaffold(
        topBar = {
            Row(
                Modifier
                    .padding(start = 28.dp, end = 28.dp, top = 45.dp)
                    .fillMaxWidth()
                    //最小のものにSizeを合わせる
                    .height(IntrinsicSize.Min), horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "20", fontSize = 38.sp)
                //weightを複数設定することでサイズの比を表すみたい。よく分かってない。
                Column(Modifier.weight(1f)) {
                    Text(text = "Thu", fontSize = 14.sp, color = Color.Gray)
                    Text(text = "Des 2021", fontSize = 14.sp, color = Color.Gray)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.QrCode, contentDescription = "QR Code")
                }
                Image(
                    painter = painterResource(id = R.drawable.e8926ae7b2d4641da19aae39ccbf460d),
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .fillMaxHeight()
                        .clip(
                            RoundedCornerShape(4.dp)
                        )
                )
            }
        }
    ) {

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTestAppTheme {
        MainApp()
    }
}