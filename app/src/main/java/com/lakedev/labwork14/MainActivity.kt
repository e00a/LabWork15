package com.lakedev.labwork14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lakedev.labwork14.screens.*
import com.lakedev.labwork14.ui.theme.LabWork14Theme

var current by mutableStateOf("AuthorizationScreen")

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val message = remember { mutableStateOf("") }
            LabWork14Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Menu()
                        when (current) {
                            "AuthorizationScreen" -> AuthorizationScreen()
                            "RegistrationScreen" -> RegistrationScreen()
                            "ProfileScreen" -> ProfileScreen()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Menu(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    ) {
        Button(
            onClick = { current = "AuthorizationScreen" },
            modifier = Modifier
                .width(130.dp)
                .height(80.dp)
                .background(
                    Color(0xFFBFFF7F)
                )
        ) {
            Text(
                text = "Авторизация",
                fontSize = 18.sp,
                color = Color(0xFFBFFF7F)
            )
        }
        Button(
            onClick = { current = "RegistrationScreen" },
            modifier = Modifier
                .width(130.dp)
                .height(80.dp)
                .background(Color.Yellow)
        )
        {
            Text(
                text = "Регистрация",
                fontSize = 18.sp,
                color = Color.Yellow
            )
        }
        Button(
            onClick = { current = "ProfileScreen" },
            modifier = Modifier
                .width(130.dp)
                .height(80.dp)
                .background(Color(62, 180, 137))
        )
        {
            Text(
                text = "Профиль",
                fontSize = 18.sp,
                color = Color(62, 180, 137)
            )
        }
    }
}