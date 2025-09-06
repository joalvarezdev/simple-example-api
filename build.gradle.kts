
import org.gradle.kotlin.dsl.*
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
  id("java-library")
  id("org.springframework.boot") version "3.5.2"
  id("io.spring.dependency-management") version "1.1.6"
  id("co.uzzu.dotenv.gradle") version "4.0.0"
  id("pmd")

}

group = "com.joalvarez"
version = "1.0.0"
description = "simple-example-api"

repositories {
  mavenCentral()
  mavenLocal()

  maven {
    url = uri("https://repo.spring.io/milestone")
  }
}

pmd {
  toolVersion = "7.14.0"
  ruleSets = listOf()
  ruleSetFiles = files("linters/pmd-ruleset.xml")
  isConsoleOutput = true
  isIgnoreFailures = false
}



dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-starter-validation")
  implementation("org.springframework.boot:spring-boot-starter-actuator")

  //implementation("org.springframework.cloud:spring-cloud-starter-openfeign:4.1.4")
  
  

  runtimeOnly("org.postgresql:postgresql")
//  implementation("com.h2database:h2")
  implementation("org.liquibase:liquibase-core")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")

  implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.6")

  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.instancio:instancio-junit:5.4.1")
}


java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
  }
}

tasks.withType<JavaCompile> {
	options.encoding = "UTF-8"
}

tasks.withType<Javadoc> {
	options.encoding = "UTF-8"
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.named<BootJar>("bootJar") {
	archiveFileName.set("simple-example-api.jar")
}

tasks.withType<ProcessResources> {
	filesMatching("application.yml") {
		expand(project.properties)
	}
}

tasks.register("printProjectName") {
    doLast {
        println(rootProject.name)
    }
}