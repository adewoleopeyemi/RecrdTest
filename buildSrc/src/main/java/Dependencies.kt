
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
    val compose by lazy { "androidx.compose.ui:ui:${Versions.compose_ui_version}"}
    val compose_ui_preview_tooling by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose_ui_version}" }
    val compose_material by lazy { "androidx.compose.material:material:1.2.0" }
    val ext_junit by lazy { "androidx.test.ext:junit:1.1.5" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:3.5.1" }
    val compose_ui_test by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose_ui_version}" }
    val compose_ui_tooling by lazy {"androidx.compose.ui:ui-tooling:${Versions.compose_ui_version}"}
    val compose_ui_test_manifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose_ui_version}" }
}