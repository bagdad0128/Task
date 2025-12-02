package com.ho.mytask

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyTaskApplication

fun main(args: Array<String>) {
    runApplication<MyTaskApplication>(*args)
}
