package com.lakedev.labwork14.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lakedev.labwork14.R
import com.lakedev.labwork14.current
import com.lakedev.labwork14.ui.theme.LabWork14Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthorizationScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.img1),
            null
        )
        Text(text = "Экран авторизации")

        TextField(
            modifier = Modifier.padding(16.dp),
            value = "",
            onValueChange = {  },
            placeholder = {Text("Login")},
        )
        TextField(
            modifier = Modifier.padding(16.dp),
            value = "",
            onValueChange = {  },
            placeholder = { Text("Password") },
        )

        Button(
            modifier = Modifier.padding(16.dp),
            onClick = { current = "ProfileScreen" }
        ) {
            Text(text = "Войти")
        }
        Button(
            modifier = Modifier.padding(16.dp),
            onClick = { current = "RegistrationScreen" }
        ) {
            Text(text = "Зарегистрироваться")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AuthorizationScreenPreview() {
    AuthorizationScreen()
}