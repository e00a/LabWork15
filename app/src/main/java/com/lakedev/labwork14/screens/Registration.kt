package com.lakedev.labwork14.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lakedev.labwork14.R
import com.lakedev.labwork14.current

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.img2),
            null
        )
        Text(text = "Экран регистрации")

        TextField(
            modifier = Modifier.padding(9.dp),
            value = "",
            onValueChange = {  },
            placeholder = { Text("Login") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        TextField(
            modifier = Modifier.padding(9.dp),
            value = "",
            onValueChange = {},
            placeholder = { Text("Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        TextField(
            modifier = Modifier.padding(9.dp),
            value = "",
            onValueChange = {  },
            placeholder = { Text("Confirm Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        TextField(
            modifier = Modifier.padding(9.dp),
            value = "",
            onValueChange = {  },
            placeholder = { Text("Phone number") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextField(
            modifier = Modifier.padding(9.dp),
            value = "",
            onValueChange = { },
            placeholder = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        TextField(
            modifier = Modifier.padding(9.dp),
            value = "",
            onValueChange = {  },
            placeholder = { Text("Age") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Button(
            modifier = Modifier.padding(9.dp),
            onClick = { current = "AuthorizationScreen" }
        ) {
            Text(text = "ОК")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen()
}