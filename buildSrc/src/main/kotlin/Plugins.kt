import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec

data class PluginSpec(val id: String, val version: String)

fun PluginDependenciesSpec.plugin(pluginSpec: PluginSpec) {
    id(pluginSpec.id) version (pluginSpec.version)
}

object Plugins {
    object Android {
        private const val Version = "7.1.2"
        val Application = PluginSpec("com.android.application", Version)
        val Library = PluginSpec("com.android.library", Version)
    }

    object Kotlin {
        private const val Version = "1.6.10"
        val Android = PluginSpec("org.jetbrains.kotlin.android", Version)
        val Kapt = PluginSpec("org.jetbrains.kotlin.kapt", Version)
        val Parcelize = PluginSpec("org.jetbrains.kotlin.plugin.parcelize", Version)
    }

    val Anvil = PluginSpec("com.squareup.anvil", "2.4.0-M2")
    val BenManesVersions = PluginSpec("com.github.ben-manes.versions", "0.42.0")
    val Hilt = PluginSpec("com.google.dagger.hilt.android", Libs.Google.Dagger.Version)
    val NexusPublishing = PluginSpec("io.github.gradle-nexus.publish-plugin", "1.1.0")

}