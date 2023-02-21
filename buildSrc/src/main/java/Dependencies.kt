
/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin_android by lazy { "org.jetbrains.kotlin.android" }
    const val androidApplication = "com.android.application"

}

/**
 * To define dependencies
 */
object Deps {
    val core_ktx by lazy { "androidx.core:core-ktx:1.7.0" }
    val lifecycle_runtime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1" }
    const val androidx_compose_compiler = "androidx.compose.compiler:compiler:1.2.0"
    const val androidx_compose_material_icons_core =
        "androidx.compose.material:material-icons-core:1.2.0"
    const val androidx_compose_material_icons_extended =
        "androidx.compose.material:material-icons-extended:1.2.0"
    const val androidx_compose_activity = "androidx.activity:activity-compose:1.5.1"

    const val androidx_compose_foundation =
        "androidx.compose.foundation:foundation:1.2.0"
    const val androidx_compose_layout =
        "androidx.compose.foundation:foundation-layout:1.2.0"
    const val androidx_compose_livedata =
        "androidx.compose.runtime:runtime-livedata:1.2.0"
    const val androidx_compose_theme_adapter =
        "com.google.android.material:compose-theme-adapter:1.1.7"
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val compose by lazy { "androidx.compose.presentation:presentation:${Versions.compose_ui_version}"}
    val compose_material by lazy { "androidx.compose.material:material:1.2.0" }
    val ext_junit by lazy { "androidx.test.ext:junit:1.1.5" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:3.5.1" }
    val compose_ui_test by lazy { "androidx.compose.presentation:presentation-test-junit4:${Versions.compose_ui_version}" }
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val gson_converter=  "com.squareup.retrofit2:converter-gson:$${Versions.retrofit_version}"
    const val moshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit_version}"
    const val moshi_kotlin = "com.squareup.moshi:moshi-kotlin:1.12.0"
    const val mockito = "org.mockito:mockito-core:3.9.0"
    const val mockk = "io.mockk:mockk:1.12.0"
    const val arch_testing =  "androidx.arch.core:core-testing:2.1.0"
    const val google_truth = "com.google.truth:truth:1.0.1"
    const val test_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"

    const val androidx_compose_navigation = "androidx.navigation:navigation-compose:2.4.2"
    const val androidx_compose_ui = "androidx.compose.ui:ui:1.2.0"
    const val androidx_compose_tooling = "androidx.compose.ui:ui-tooling:1.1.1"
    const val androidx_compose_constraintlayout =
        "androidx.constraintlayout:constraintlayout-compose:1.0.0"

    const val android_compose_coil = "io.coil-kt:coil-compose:${Versions.coil}"
    const val compose_coil_svg = "io.coil-kt:coil-svg:${Versions.coil}"

    val koin_core = "io.insert-koin:koin-core:${Versions.koin}"
    val koin_test = "io.insert-koin:koin-test:${Versions.koin}"
    val koin_junit4 = "io.insert-koin:koin-test-junit4:${Versions.koin}"
    val koin_android = "io.insert-koin:koin-android:${Versions.koin}"
    val koin_compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"

}