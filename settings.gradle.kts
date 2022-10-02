pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        maven ( "https://jitpack.io" )
        mavenCentral()
    }
}
rootProject.name = "mDisk Downloader"
include(":app")
