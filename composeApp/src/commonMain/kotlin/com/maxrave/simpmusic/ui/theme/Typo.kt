import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.material3.Typography
import com.maxrave.simpmusic.Res
import com.maxrave.simpmusic.sfprodisplaybold
import com.maxrave.simpmusic.sfprotextsemibold
import com.maxrave.simpmusic.sfproroundedmedium

// 1. Definición de las Familias Tipográficas según el Kit de Apple
val SFProDisplay = FontFamily(
    Font(Res.font.sfprodisplaybold, FontWeight.Bold)
)

val SFProText = FontFamily(
    Font(Res.font.sfprotextsemibold, FontWeight.SemiBold)
)

val SFProRounded = FontFamily(
    Font(Res.font.sfproroundedmedium, FontWeight.Medium)
)

// 2. Asignación de estilos a la Tipografía de la App
val Typography = Typography(
    // Títulos de pestañas, álbumes y cabeceras -> SF Pro Display Bold
    titleLarge = TextStyle(
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Bold
    ),
    titleMedium = TextStyle(
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Bold
    ),
    titleSmall = TextStyle(
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Bold
    ),

    // Listas de canciones, menús y cuerpo principal -> SF Pro Text Semibold
    bodyLarge = TextStyle(
        fontFamily = SFProText,
        fontWeight = FontWeight.SemiBold
    ),
    bodyMedium = TextStyle(
        fontFamily = SFProText,
        fontWeight = FontWeight.SemiBold
    ),
    bodySmall = TextStyle(
        fontFamily = SFProText,
        fontWeight = FontWeight.SemiBold
    ),

    // Tiempo del reproductor, detalles y etiquetas -> SF Pro Rounded Medium
    labelLarge = TextStyle(
        fontFamily = SFProRounded,
        fontWeight = FontWeight.Medium
    ),
    labelMedium = TextStyle(
        fontFamily = SFProRounded,
        fontWeight = FontWeight.Medium
    ),
    labelSmall = TextStyle(
        fontFamily = SFProRounded,
        fontWeight = FontWeight.Medium
    )
)
