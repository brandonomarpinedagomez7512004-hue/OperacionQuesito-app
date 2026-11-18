package com.example.operacionquesito.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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

// Modelo de información de cada personaje
data class Personaje(
    val nombre: String,
    val descripcion: String,
    val emoji: String
)

@Composable
fun PersonajesScreen(
    onVolverClick: () -> Unit
) {
    val fondo = Color(0xFFFFF8E7)
    val cafe = Color(0xFF5D4037)

    // Lista de personajes
    val personajes = listOf(
        Personaje(
            nombre = "Chetes",
            descripcion = "Nuestro pequeño y valiente ratón protagonista. " +
                    "Su misión es recolectar todos los quesitos que pueda, " +
                    "superar obstáculos y llegar al puesto de quesadillas " +
                    "de la señora Lulú.",
            emoji = "🐭"
        ),
        Personaje(
            nombre = "Polvorón",
            descripcion = "Un gato travieso que intentará impedir que " +
                    "Chetes complete su aventura. ¡Ten cuidado cuando " +
                    "aparezca en el camino!",
            emoji = "🐱"
        ),
        Personaje(
            nombre = "Señora Lulú",
            descripcion = "La encargada del famoso puesto de quesadillas. " +
                    "Es el destino final de Chetes y lo espera al " +
                    "terminar su aventura.",
            emoji = "👩‍🍳"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(fondo)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "🐭 Nuestros personajes",
            fontSize = 27.sp,
            fontWeight = FontWeight.Bold,
            color = cafe,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "¡Conoce a los protagonistas de esta aventura!",
            fontSize = 15.sp,
            color = cafe,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(personajes) { personaje ->
                TarjetaPersonaje(personaje)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onVolverClick,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFA726)
            )
        ) {
            Text("← Volver al inicio")
        }
    }
}

@Composable
fun TarjetaPersonaje(personaje: Personaje) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Espacio reservado para la imagen
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(
                        Color(0xFFFFE0B2),
                        RoundedCornerShape(16.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = personaje.emoji,
                    fontSize = 75.sp
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = personaje.nombre,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF5D4037)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = personaje.descripcion,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                color = Color(0xFF5D4037),
                textAlign = TextAlign.Center
            )
        }
    }
}
