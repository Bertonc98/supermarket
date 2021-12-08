package com.supermarket.supermarket

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SupermarketApplication

fun main(args: Array<String>) {
	runApplication<SupermarketApplication>(*args)
}
