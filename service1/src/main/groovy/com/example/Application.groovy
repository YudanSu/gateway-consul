package com.example

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

//@EnableDiscoveryClient
//@EntityScan("com.example.entity")
//@EnableJpaRepositories("com.example.repository")
//@SpringBootApplication(scanBasePackages = "com.example")
@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application, args)
    }
}
