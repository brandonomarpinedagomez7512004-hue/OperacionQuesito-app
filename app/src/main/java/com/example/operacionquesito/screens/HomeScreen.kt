package com.example.operacionquesito.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    onPersonajesClick: () -> Unit,
    onRankingClick: () -> Unit,
    onHistoriaClick: () -> Unit,
) {
    val fondo = Color(0xFFFFF8E7)
    val naranja = Color(0xFFFFA726)
    val cafe = Color(0xFF5D4037)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(fondo)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "🐭",
            fontSize = 80.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "OPERACIÓN QUESITO",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = cafe,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "¡Una aventura llena de queso!",
            fontSize = 18.sp,
            color = naranja,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Acompaña a Chetes en una divertida aventura. " +
                    "Recolecta quesitos, esquiva a Polvorón " +
                    "y llega al puesto de quesadillas de la señora Lulú.",
            fontSize = 16.sp,
            color = cafe,
            textAlign = TextAlign.Center,
            lineHeight = 24.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = onPersonajesClick,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = naranja
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "🐭 Conoce a los personajes",
                fontSize = 16.sp,
                color = Color.White
            )
        }


        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onHistoriaClick,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF66BB6A)
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "📖 Historia del videojuego",
                fontSize = 16.sp,
                color = Color.White
            )
        }


        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onRankingClick,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = cafe
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "🏆 Ranking de jugadores",
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
}
