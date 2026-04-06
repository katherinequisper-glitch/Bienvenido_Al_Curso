package com.example.bienvenidoalcurso 

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Surface(
                color = Color(0xFF073042),
                modifier = Modifier.size(100.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.android),
                    contentDescription = "Android Logo",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.padding(16.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Katherine Quispe", fontSize = 36.sp, fontWeight = FontWeight.Light)
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 14.sp,
                color = Color(0xFF006D3B),
                fontWeight = FontWeight.Bold
            )
        }
        Column(
            modifier = Modifier.width(240.dp),
            horizontalAlignment = Alignment.Start
        ) {
            ContactItem(iconId = android.R.drawable.ic_menu_call, info = "+51 969869165")
            ContactItem(iconId = android.R.drawable.ic_menu_share, info = "@AndroidDev")
            ContactItem(iconId = android.R.drawable.ic_dialog_email, info = "kath.quis.rome@android.com")
        }
    }
}

@Composable
fun ContactItem(iconId: Int, info: String) {
    Row(
        modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            tint = Color(0xFF006D3B),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = info, fontSize = 14.sp)
    }
}