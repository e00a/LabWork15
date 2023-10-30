package com.lakedev.labwork14.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.unit.sp
import com.lakedev.labwork14.R
import com.lakedev.labwork14.current

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Image(
                bitmap = ImageBitmap.imageResource(R.drawable.img3),
                null
            )
        }
        Text(
            modifier = Modifier.padding(9.dp), fontSize = 24.sp, text = "Информация о себе"
        )

        Text(modifier = Modifier.padding(9.dp), fontSize = 24.sp, text = "Логин: ")
        Text(modifier = Modifier.padding(9.dp), fontSize = 24.sp, text = "Имя: ")
        Text(modifier = Modifier.padding(9.dp), fontSize = 24.sp, text = "Возраст: ")
        Text(modifier = Modifier.padding(9.dp), fontSize = 24.sp, text = "Страна: ")
        Text(
            modifier = Modifier.padding(9.dp), fontSize = 24.sp,
            text = "О себе:" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999" + "\n999",
        )

        Button(
            modifier = Modifier.padding(16.dp),
            onClick = { current = "AuthorizationScreen" },
        ) {
            Text(fontSize = 18.sp, text = "Назад")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}