
/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

/**
 * To define dependencies
 */
object Deps {
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val compose by lazy { "androidx.compose.ui:ui:${Versions.compose_ui_version}"}
    val compose_ui_preview_tooling by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose_ui_version}" }
    val compose_material by lazy { "androidx.compose.material:material:1.1.1" }
    val ext_junit by lazy { "androidx.test.ext:junit:1.1.5" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:3.5.1" }
    val compose_ui_test by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose_ui_version}" }
    val compose_ui_tooling by lazy {"androidx.compose.ui:ui-tooling:${Versions.compose_ui_version}"}
    val compose_ui_test_manifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose_ui_version}" }
}