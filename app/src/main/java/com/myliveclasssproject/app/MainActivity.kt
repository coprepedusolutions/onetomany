package com.myliveclasssproject.app
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.myliveclasssproject.app.ui.theme.MyLiveClassProjectTheme
import com.mysdk.app.DataActivity

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyLiveClassProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center
                    ) {
                        Greeting("Click to open Library Activity") {
                            startActivity(Intent(this@MainActivity, DataActivity::class.java))
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Text(
        text = name,
        modifier = modifier
            .padding(16.dp)
            .clickable { onClick() },
        style = TextStyle(
            color = colorResource(id = R.color.purple_200),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyLiveClassProjectTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Greeting("I am from Library",onClick = {})
        }
    }
}
