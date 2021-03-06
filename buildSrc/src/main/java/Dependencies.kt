import org.gradle.api.JavaVersion

object Application {
    const val minSdk = 23
    const val targetSdk = 30
    const val compileSdk = 30
    const val jvmTarget = "1.8"
    const val versionCode = 1
    const val versionName = "코로나 종식되게 해주세요"

    val targetCompat = JavaVersion.VERSION_1_8
    val sourceCompat = JavaVersion.VERSION_1_8
}

object Versions {
    object Essential {
        const val AppCompat = "1.2.0"
        const val Kotlin = "1.4.30-RC"
        const val Gradle = "4.1.1"
    }

    object Ktx {
        const val Core = "1.3.2"
        const val Fragment = "2.3.2"
    }

    object Jetpack {
        const val Navigation = "2.3.2"
    }

    object Ui {
        const val Flexbox = "2.0.1"
        const val Browser = "1.3.0"
        const val SmoothBottomBar = "1.7.6"
        const val Lottie = "3.6.0"
        const val Material = "1.2.1"
        const val Glide = "4.11.0"
        const val CardView = "1.0.0"
        const val ConstraintLayout = "2.0.4"
    }

    object Util {
        const val AndroidUtils = "5.1.3"
        const val CarshReporter = "1.1.0"
    }
}

object Dependencies {
    object Essential {
        const val AppCompat = "androidx.appcompat:appcompat:${Versions.Essential.AppCompat}"
        const val Kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Essential.Kotlin}"
    }

    object Ktx {
        const val NavigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.Jetpack.Navigation}"
        const val NavigationUi =
            "androidx.navigation:navigation-ui-ktx:${Versions.Jetpack.Navigation}"
        const val Core = "androidx.core:core-ktx:${Versions.Ktx.Core}"
        const val Fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.Ktx.Fragment}"
    }

    object Ui {
        const val Flexbox = "com.google.android:flexbox:${Versions.Ui.Flexbox}"
        const val Browser = "androidx.browser:browser:${Versions.Ui.Browser}"
        const val SmoothBottomBar =
            "com.github.ibrahimsn98:SmoothBottomBar:${Versions.Ui.SmoothBottomBar}"
        const val Lottie = "com.airbnb.android:lottie:${Versions.Ui.Lottie}"
        const val Material = "com.google.android.material:material:${Versions.Ui.Material}"
        const val Glide = "com.github.bumptech.glide:glide:${Versions.Ui.Glide}"
        const val CardView = "androidx.cardview:cardview:${Versions.Ui.CardView}"
        const val ConstraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.Ui.ConstraintLayout}"
    }

    object Util {
        const val GlideCompiler = "com.github.bumptech.glide:compiler:${Versions.Ui.Glide}"
        const val AndroidUtils =
            "com.github.sungbin5304.SBT:androidutils:${Versions.Util.AndroidUtils}"
        const val AndroidUtilsCompiler =
            "com.github.sungbin5304.SBT:compiler:${Versions.Util.AndroidUtils}"
        const val CrashReporter =
            "com.balsikandar.android:crashreporter:${Versions.Util.CarshReporter}"
    }
}
