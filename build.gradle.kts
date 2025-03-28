
plugins {
  alias(libs.plugins.qhr.base)
  alias(libs.plugins.qhr.library)
  alias(libs.plugins.qhr.semanticRelease)
}

dependencies { api(libs.checkstyle) }

group = "com.qhrtech.medeo"

version = "2.0.6-SNAPSHOT"

description = "Medeo Checkstyle Rules"

semanticRelease {
  tagFormat.set("checkstyle-rules-\${version}")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<JavaCompile>() { options.encoding = "UTF-8" }

tasks.withType<Javadoc>() { options.encoding = "UTF-8" }

val generateResourcesTask =
  tasks.register("generateResources", Sync::class) {
    destinationDir = file("$projectDir/build/resources/generated")

    from(
      fileTree(project.projectDir) {
        include("checkstyle-*.xml")
        include("eclipse-*.xml")
        include("intellij_*.xml")
      }
    )
  }

sourceSets { main { output.dir(generateResourcesTask) } }
