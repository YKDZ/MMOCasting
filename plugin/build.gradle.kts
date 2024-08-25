dependencies {
    compileOnly("org.spigotmc:spigot-api:1.14.4-R0.1-SNAPSHOT")

    compileOnly("io.lumine:MythicLib-dist:1.5.2-SNAPSHOT")
    compileOnly("net.Indyuce:MMOItems-API:6.9.4-SNAPSHOT")

    implementation(project(":api"))
}

tasks {
    shadowJar {
        archiveFileName.set("MMOCasting-" + project.version + ".jar")
    }
}