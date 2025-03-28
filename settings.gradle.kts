pluginManagement {
  repositories {
    mavenLocal()
    maven {
      name = "qhrArtifactory"
      url = uri("https://qhrtech.jfrog.io/artifactory/qhr-maven-gradle-plugins-secure/")
      credentials(PasswordCredentials::class)
    }
  }
}

rootProject.name = "checkstyle-rules"
