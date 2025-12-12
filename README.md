# DevFest Cairo Workshop - Jetpack Navigation 3

Welcome to the DevFest Cairo Workshop! 🎉

This workshop covers **Jetpack Navigation 3** (Nav3) with Jetpack Compose, exploring the new type-safe navigation APIs and best practices.

---

## 📦 Dependencies for Jetpack Navigation 3

To use Navigation 3 in your project, you'll need to add the following dependencies:

### 1. Version Catalog (`gradle/libs.versions.toml`)

Add these versions, libraries, and plugins to your version catalog:

```toml
[versions]
kotlin = "2.1.21"
composeBom = "2025.05.01"
nav3 = "1.0.0"

[libraries]
# Navigation 3 libraries
androidx-navigation3-runtime = { group = "androidx.navigation3", name = "navigation3-runtime", version.ref = "nav3" }
androidx-navigation3-ui = { group = "androidx.navigation3", name = "navigation3-ui", version.ref = "nav3" }

[plugins]
kotlin-serialization = { id = "org.jetbrains.kotlin.plugin.serialization", version.ref = "kotlin" }
```

### 2. App-level `build.gradle.kts`

Add the Kotlin Serialization plugin and Navigation 3 dependencies:

```kotlin
plugins {
    // ... other plugins
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    // Navigation 3
    implementation(libs.androidx.navigation3.runtime)
    implementation(libs.androidx.navigation3.ui)
}
```

---

## 🚀 Quick Setup Checklist

- [ ] Kotlin version **2.1.21**
- [ ] Compose BOM **2025.05.01**
- [ ] Navigation 3 **1.0.0**
- [ ] Kotlin Serialization plugin enabled

---

## 🔗 Useful Resources

- [Official Navigation 3 Documentation](https://developer.android.com/develop/ui/compose/navigation/nav3)
- [Navigation 3 API Reference](https://developer.android.com/reference/kotlin/androidx/navigation3/package-summary)
- [Kotlin Serialization Guide](https://kotlinlang.org/docs/serialization.html)

---

## 📱 Project Requirements

- **Android Studio**: Ladybug or newer
- **Min SDK**: 24
- **Target SDK**: 36
- **Kotlin**: 2.1.21+

---

Happy coding! 🚀

*DevFest Cairo Workshop Team*
