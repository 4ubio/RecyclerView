package com.example.recyclerview.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun GameData() {
    Row () {
        Text(
            text = "Nintendo DS",
            color = Color(0xFF000000),
            fontSize = 15.sp,
            modifier = Modifier.padding(top = 5.dp)
        )

        Spacer(modifier = Modifier.width(15.dp))

        Text(
            text = "$1600",
            color = Color(0xFF009688),
            fontSize = 15.sp,
            modifier = Modifier.padding(top = 5.dp)
        )
    }
}