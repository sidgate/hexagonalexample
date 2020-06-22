import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins{
    id("kotlin")
}
dependencies {
    implementation(kotlin("stdlib")) 
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}

tasks {
    test {
        useJUnitPlatform()
    }
}