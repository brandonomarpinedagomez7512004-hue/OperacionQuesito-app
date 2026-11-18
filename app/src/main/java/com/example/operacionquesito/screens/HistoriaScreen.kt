package com.example.operacionquesito.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
fun HistoriaScreen(
    onVolverClick: () -> Unit
) {
    val fondo = Color(0xFFFFF8E7)
    val cafe = Color(0xFF5D4037)
    val naranja = Color(0xFFFFA726)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(fondo)
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "📖 Nuestra historia",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = cafe,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "🐭 Operación Quesito",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = naranja
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Chetes es un pequeño ratón que emprende " +
                            "una aventura para recolectar deliciosos " +
                            "quesitos y llegar al puesto de quesadillas " +
                            "de la señora Lulú.\n\n" +
                            "Pero su camino no será sencillo: " +
                            "Polvorón, un travieso gato, intentará " +
                            "detenerlo.\n\n" +
                            "Para cumplir su misión, Chetes deberá " +
                            "saltar obstáculos, evitar enemigos " +
                            "y reunir tantos quesitos como pueda.",
                    fontSize = 16.sp,
                    lineHeight = 25.sp,
                    color = cafe
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "🎮 ¿Cómo se juega?",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = cafe
        )

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(20.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "🧀 Recolecta quesitos para sumar puntos.\n\n" +
                            "🐱 Evita a Polvorón y los obstáculos.\n\n" +
                            "🐭 Supera los desafíos del escenario.\n\n" +
                            "🏁 Llega a tu destino y consigue " +
                            "la mejor puntuación.",
                    fontSize = 16.sp,
                    lineHeight = 25.sp,
                    color = cafe
                )
            }
        }

        // Imagen de la historia (pendiente de agregar)
        Spacer(modifier = Modifier.height(24.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFE0B2)
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "🖼️ Ilustración de la aventura\n(Próximamente)",
                    fontSize = 18.sp,
                    color = cafe,
                    textAlign = TextAlign.Center
                )
            }
        }


        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = onVolverClick,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = naranja
            )
        ) {
            Text("← Volver al inicio")
        }
    }
}
