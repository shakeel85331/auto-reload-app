//plugins {
//    java
//    id("org.springframework.boot") version "3.2.10"
//    id("io.spring.dependency-management") version "1.1.3"
//}
//
//group = "com.shaan"
//version = "0.0.1-SNAPSHOT"
//
//java {
//    toolchain {
//        languageVersion = JavaLanguageVersion.of(21)
//    }
//}
//
//configurations {
//    compileOnly {
//        extendsFrom(configurations.annotationProcessor.get())
//    }
//}
//
//repositories {
//    mavenCentral()
//}
//
//
//dependencies {
//    //implementation("org.springframework.boot:spring-boot-starter-parent:3.2.10")
//    implementation("org.springframework.boot:spring-boot-starter-actuator")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    //implementation("org.springframework.cloud:spring-cloud-starter-kubernetes-config:1.1.10.RELEASE")
//    implementation("org.springframework.cloud:spring-cloud-starter-kubernetes-client-config")
//    compileOnly("org.projectlombok:lombok")
//    annotationProcessor("org.projectlombok:lombok")
//    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
//}
//
//dependencyManagement {
//    imports {
//        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2022.0.6") // Kilburn release train
//    }
//}
//
//tasks.withType<Test> {
//    useJUnitPlatform()
//}

plugins {
    java
    id("org.springframework.boot") version "3.2.10"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "com.shaan"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

extra["springCloudVersion"] = "2023.0.3"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-parent:3.2.10")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-kubernetes-fabric8-config:3.1.3")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
    implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

