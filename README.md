# Superheroes-app
https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-superheroes#0

Practice makes a master.   
This main branch is the main directory.   

there are 2 additional branchs for 1 practice, Compose and SwiftUI.   
   
• [Compose branch](https://github.com/Jaehwa-Noh/Practice-Superheroes-app/tree/compose-superheros)   
• [SwiftUI branch](https://github.com/Jaehwa-Noh/Practice-Superheroes-app/tree/swiftui-superheroes)
 
---
연습이 장인을 만든다.   
이 메인 브랜치는 메인 폴더입니다.

1개의 연습에 해당하는 추가적인 Compose와 SwiftUI에 해당하는 2개의 브랜치가 있습니다.   
   
• [컴포우즈 브랜치](https://github.com/Jaehwa-Noh/Practice-Superheroes-app/tree/compose-superheros)   
• [스위프트유아이 브랜치](https://github.com/Jaehwa-Noh/Practice-Superheroes-app/tree/swiftui-superheroes)


## UI specifications (UI 명세서)
### Hero list item (영웅 목록 내용)
Follow this UI specification or be creative and design your own list item:(아래의 UI 명세서를 따르던지, 당신만의 디자인을 만들던지 하시오:)   

• Card elevation is ***```2dp```*** (카드 높이감은 ***```2dp```***)   

• Height of the list item is ***```72dp```*** with ***```16dp```*** padding (목록 내용의 높이는 ***```72dp```*** 패딩은 ***```16dp```***)   

• Clip radius of the list item is ***```16dp```*** (목록 내용의 클립 반지름은 ***```16dp```***)   

• ***```Box```*** layout with image with size ***```72dp```*** (이미지가 포함된 ***```박스```*** 레이아웃의 크기는 ***```72dp```***)   

• Clip radius of the image is 8dp (이미지의 클립 반지름은 ***```8dp```***)   

• Space between the image and the text is ***```16dp```*** (이미지와 글 간격은 ***```16dp```***)   

• Style for superhero's name is ***```DisplaySmall```*** (영웅의 이름 스타일은 ***```DisplaySmall```***)   

• Style for superhero's description is ***```BodyLarge```*** (영웅 설명 스타일은 ***```BodyLarge```***)   

Explore different padding and size options, as per the Material 3 guidelines, padding should be increments of ***```4dp```*** . (패딩과 크기는 마음대로 변경해도 좋습니다. 다만, Material 3 가이드라인에 따라 패딩은 ***```4dp```*** 의 배수로 증가해야 합니다.)

<img src="https://github.com/Jaehwa-Noh/Practice-Superheroes-app/assets/48680511/d5224a94-a304-4c75-9046-3f854e583846" width="700"/>
<img src="https://github.com/Jaehwa-Noh/Practice-Superheroes-app/assets/48680511/dc644e04-912d-4eec-95f9-ecb8b8a035af" width="700"/>
<img src="https://github.com/Jaehwa-Noh/Practice-Superheroes-app/assets/48680511/8745cf8f-02a8-45e6-ba85-6a1d9d966741" width="700"/>

### Hero list (영웅 목록)
<img src="https://github.com/Jaehwa-Noh/Practice-Superheroes-app/assets/48680511/f8379544-698b-493f-a57b-bc27eebc221b" width="400"/>

### Top app bar (상단 앱 바)
<img src="https://github.com/Jaehwa-Noh/Practice-Superheroes-app/assets/48680511/f36abb8d-9d5f-4482-b6ad-1d4e200d7d0a" width="700"/>

## Full Screen (전체 화면)
<img src="https://github.com/Jaehwa-Noh/Practice-Superheroes-app/assets/48680511/70a3cdab-2286-450b-8984-1b77dc4e63a2" width="300"/>
<img src="https://github.com/Jaehwa-Noh/Practice-Superheroes-app/assets/48680511/e195a36e-4121-4692-aa1e-570ed54d62eb" width="300"/>

## Resources (재료)
### Font (글꼴)
[Font (글꼴)](https://fonts.google.com) Cabin

### Image (이미지)
[Image (이미지)](https://github.com/google-developer-training/basic-android-kotlin-compose-training-superheroes/raw/main/Image%20assets.zip)

### String (글)
```xml
<resources>
    <string name="app_name">Superheroes</string>
    <string name="hero1">Nick the Night and Day</string>
    <string name="description1">The Jetpack Hero</string>
    <string name="hero2">Reality Protector</string>
    <string name="description2">Understands the absolute truth</string>
    <string name="hero3">Andre the Giant</string>
    <string name="description3">Mimics the light and night to blend in</string>
    <string name="hero4">Benjamin the Brave</string>
    <string name="description4">Harnesses the power of canary to develop bravely</string>
    <string name="hero5">Magnificent Maru</string>
    <string name="description5">Effortlessly glides in to save the day</string>
    <string name="hero6">Dynamic Yasmine</string>
    <string name="description6">Ability to shift to any form and energize</string>
</resources>
```
### Model (모델)
```kotlin
object HeroesRepository {
    val heroes = listOf(
        Hero(
            nameRes = R.string.hero1,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.android_superhero1
        ),
        Hero(
            nameRes = R.string.hero2,
            descriptionRes = R.string.description2,
            imageRes = R.drawable.android_superhero2
        ),
        Hero(
            nameRes = R.string.hero3,
            descriptionRes = R.string.description3,
            imageRes = R.drawable.android_superhero3
        ),
        Hero(
            nameRes = R.string.hero4,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.android_superhero4
        ),
        Hero(
            nameRes = R.string.hero5,
            descriptionRes = R.string.description5,
            imageRes = R.drawable.android_superhero5
        ),
        Hero(
            nameRes = R.string.hero6,
            descriptionRes = R.string.description6,
            imageRes = R.drawable.android_superhero6
        )
    )
}
```

### Color (색)
```Kotlin
import androidx.compose.ui.graphics.Color

val md_theme_light_primary = Color(0xFF466800)
val md_theme_light_onPrimary = Color(0xFFFFFFFF)
val md_theme_light_primaryContainer = Color(0xFFC6F181)
val md_theme_light_onPrimaryContainer = Color(0xFF121F00)
val md_theme_light_secondary = Color(0xFF596248)
val md_theme_light_onSecondary = Color(0xFFFFFFFF)
val md_theme_light_secondaryContainer = Color(0xFFDDE6C6)
val md_theme_light_onSecondaryContainer = Color(0xFF161E0A)
val md_theme_light_tertiary = Color(0xFF396661)
val md_theme_light_onTertiary = Color(0xFFFFFFFF)
val md_theme_light_tertiaryContainer = Color(0xFFBCECE6)
val md_theme_light_onTertiaryContainer = Color(0xFF00201D)
val md_theme_light_error = Color(0xFFBA1A1A)
val md_theme_light_errorContainer = Color(0xFFFFDAD6)
val md_theme_light_onError = Color(0xFFFFFFFF)
val md_theme_light_onErrorContainer = Color(0xFF410002)
val md_theme_light_background = Color(0xFFFEFCF5)
val md_theme_light_onBackground = Color(0xFF1B1C18)
val md_theme_light_surface = Color(0xFFFEFCF5)
val md_theme_light_onSurface = Color(0xFF1B1C18)
val md_theme_light_surfaceVariant = Color(0xFFE1E4D4)
val md_theme_light_onSurfaceVariant = Color(0xFF45483D)
val md_theme_light_outline = Color(0xFF75786C)
val md_theme_light_inverseOnSurface = Color(0xFFF2F1E9)
val md_theme_light_inverseSurface = Color(0xFF30312C)
val md_theme_light_inversePrimary = Color(0xFFABD468)
val md_theme_light_surfaceTint = Color(0xFF466800)
val md_theme_light_outlineVariant = Color(0xFFC5C8B9)
val md_theme_light_scrim = Color(0xFF000000)

val md_theme_dark_primary = Color(0xFFABD468)
val md_theme_dark_onPrimary = Color(0xFF223600)
val md_theme_dark_primaryContainer = Color(0xFF344E00)
val md_theme_dark_onPrimaryContainer = Color(0xFFC6F181)
val md_theme_dark_secondary = Color(0xFFC1CAAB)
val md_theme_dark_onSecondary = Color(0xFF2B331D)
val md_theme_dark_secondaryContainer = Color(0xFF414A32)
val md_theme_dark_onSecondaryContainer = Color(0xFFDDE6C6)
val md_theme_dark_tertiary = Color(0xFFA0D0CA)
val md_theme_dark_onTertiary = Color(0xFF013733)
val md_theme_dark_tertiaryContainer = Color(0xFF1F4E4A)
val md_theme_dark_onTertiaryContainer = Color(0xFFBCECE6)
val md_theme_dark_error = Color(0xFFFFB4AB)
val md_theme_dark_errorContainer = Color(0xFF93000A)
val md_theme_dark_onError = Color(0xFF690005)
val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
val md_theme_dark_background = Color(0xFF1B1C18)
val md_theme_dark_onBackground = Color(0xFFE4E3DB)
val md_theme_dark_surface = Color(0xFF1B1C18)
val md_theme_dark_onSurface = Color(0xFFE4E3DB)
val md_theme_dark_surfaceVariant = Color(0xFF45483D)
val md_theme_dark_onSurfaceVariant = Color(0xFFC5C8B9)
val md_theme_dark_outline = Color(0xFF8F9285)
val md_theme_dark_inverseOnSurface = Color(0xFF1B1C18)
val md_theme_dark_inverseSurface = Color(0xFFE4E3DB)
val md_theme_dark_inversePrimary = Color(0xFF466800)
val md_theme_dark_surfaceTint = Color(0xFFABD468)
val md_theme_dark_outlineVariant = Color(0xFF45483D)
val md_theme_dark_scrim = Color(0xFF000000)
```

### Shape (모양)
```kotlin
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(16.dp)
)
```

### Typography (타이포그래피)
```kotlin
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.superheroes.R


val Cabin = FontFamily(
    Font(R.font.cabin_regular, FontWeight.Normal),
    Font(R.font.cabin_bold, FontWeight.Bold)
)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayLarge = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    displaySmall = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
)
```

### Theme (테마)
```kotlin
import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColors = lightColorScheme(
   primary = md_theme_light_primary,
   onPrimary = md_theme_light_onPrimary,
   primaryContainer = md_theme_light_primaryContainer,
   onPrimaryContainer = md_theme_light_onPrimaryContainer,
   secondary = md_theme_light_secondary,
   onSecondary = md_theme_light_onSecondary,
   secondaryContainer = md_theme_light_secondaryContainer,
   onSecondaryContainer = md_theme_light_onSecondaryContainer,
   tertiary = md_theme_light_tertiary,
   onTertiary = md_theme_light_onTertiary,
   tertiaryContainer = md_theme_light_tertiaryContainer,
   onTertiaryContainer = md_theme_light_onTertiaryContainer,
   error = md_theme_light_error,
   errorContainer = md_theme_light_errorContainer,
   onError = md_theme_light_onError,
   onErrorContainer = md_theme_light_onErrorContainer,
   background = md_theme_light_background,
   onBackground = md_theme_light_onBackground,
   surface = md_theme_light_surface,
   onSurface = md_theme_light_onSurface,
   surfaceVariant = md_theme_light_surfaceVariant,
   onSurfaceVariant = md_theme_light_onSurfaceVariant,
   outline = md_theme_light_outline,
   inverseOnSurface = md_theme_light_inverseOnSurface,
   inverseSurface = md_theme_light_inverseSurface,
   inversePrimary = md_theme_light_inversePrimary,
   surfaceTint = md_theme_light_surfaceTint,
   outlineVariant = md_theme_light_outlineVariant,
   scrim = md_theme_light_scrim,
)

private val DarkColors = darkColorScheme(
   primary = md_theme_dark_primary,
   onPrimary = md_theme_dark_onPrimary,
   primaryContainer = md_theme_dark_primaryContainer,
   onPrimaryContainer = md_theme_dark_onPrimaryContainer,
   secondary = md_theme_dark_secondary,
   onSecondary = md_theme_dark_onSecondary,
   secondaryContainer = md_theme_dark_secondaryContainer,
   onSecondaryContainer = md_theme_dark_onSecondaryContainer,
   tertiary = md_theme_dark_tertiary,
   onTertiary = md_theme_dark_onTertiary,
   tertiaryContainer = md_theme_dark_tertiaryContainer,
   onTertiaryContainer = md_theme_dark_onTertiaryContainer,
   error = md_theme_dark_error,
   errorContainer = md_theme_dark_errorContainer,
   onError = md_theme_dark_onError,
   onErrorContainer = md_theme_dark_onErrorContainer,
   background = md_theme_dark_background,
   onBackground = md_theme_dark_onBackground,
   surface = md_theme_dark_surface,
   onSurface = md_theme_dark_onSurface,
   surfaceVariant = md_theme_dark_surfaceVariant,
   onSurfaceVariant = md_theme_dark_onSurfaceVariant,
   outline = md_theme_dark_outline,
   inverseOnSurface = md_theme_dark_inverseOnSurface,
   inverseSurface = md_theme_dark_inverseSurface,
   inversePrimary = md_theme_dark_inversePrimary,
   surfaceTint = md_theme_dark_surfaceTint,
   outlineVariant = md_theme_dark_outlineVariant,
   scrim = md_theme_dark_scrim,
)

@Composable
fun SuperheroesTheme(
   darkTheme: Boolean = isSystemInDarkTheme(),
   // Dynamic color is available on Android 12+
   // Dynamic color in this app is turned off for learning purposes
   dynamicColor: Boolean = false,
   content: @Composable () -> Unit
) {
   val colorScheme = when {
       dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
           val context = LocalContext.current
           if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
       }

       darkTheme -> DarkColors
       else -> LightColors
   }
   val view = LocalView.current
   if (!view.isInEditMode) {
       SideEffect {
           val window = (view.context as Activity).window
           window.statusBarColor = colorScheme.background.toArgb()
           WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
       }
   }

   MaterialTheme(
       colorScheme = colorScheme,
       typography = Typography,
       shapes = Shapes,
       content = content
   )
}
```


# My Result (내 결과물)
## Apps on device (프로젝트 실행 이미지)
| Compose(light) | Compose(dark) | SwiftUI(light) |  SwiftUI(dark) |
| :---------------: | :---------------: | :---------------: | :---------------: |
| <img src="https://github.com/Jaehwa-Noh/Practice-Superheroes-app/assets/48680511/cf103fe9-2ca6-4983-bf95-dfce006778dc" width="300" /> | <img src="https://github.com/Jaehwa-Noh/Practice-Superheroes-app/assets/48680511/4e91a5ea-8304-416f-bfad-df7a706e9e2a" width="300" /> |
