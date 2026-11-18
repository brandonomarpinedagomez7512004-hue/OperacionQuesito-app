package com.example.operacionquesito.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
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

// Modelo de datos de un jugador
data class Jugador(
    val nombre: String,
    val puntuacion: Int
)

@Composable
fun RankingScreen(
    onVolverClick: () -> Unit
) {
    val fondo = Color(0xFFFFF8E7)
    val cafe = Color(0xFF5D4037)
    val naranja = Color(0xFFFFA726)

    // Datos temporales para probar la interfaz
    val jugadores = listOf(
        Jugador("ChetesFan", 1500),
        Jugador("QuesitoMaster", 1200),
        Jugador("Polvoron123", 950),
        Jugador("LuluGamer", 800),
        Jugador("Ratoncito", 650),
        Jugador("SuperQueso", 500)
    ).sortedByDescending { it.puntuacion }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(fondo)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "🏆 Ranking de jugadores",
            fontSize = 27.sp,
            fontWeight = FontWeight.Bold,
            color = cafe,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "¡Los mejores recolectores de quesitos!",
            fontSize = 16.sp,
            color = cafe,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            itemsIndexed(jugadores) { index, jugador ->

                val posicion = index + 1

                val medalla = when (posicion) {
                    1 -> "🥇"
                    2 -> "🥈"
                    3 -> "🥉"
                    else -> "$posicion."
                }

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(3.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = medalla,
                            fontSize = 26.sp,
                            modifier = Modifier.width(52.dp)
                        )

                        Text(
                            text = jugador.nombre,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = cafe,
                            modifier = Modifier.weight(1f)
                        )

                        Text(
                            text = "${jugador.puntuacion} pts",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = naranja
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onVolverClick,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = naranja
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("← Volver al inicio")
        }
    }
}
