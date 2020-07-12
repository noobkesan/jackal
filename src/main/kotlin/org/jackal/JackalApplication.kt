package org.jackal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JackalApplication

fun main(args: Array<String>) {
    runApplication<JackalApplication>(*args)
}
