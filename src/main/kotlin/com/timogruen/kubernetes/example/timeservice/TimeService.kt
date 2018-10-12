package com.timogruen.kubernetes.example.timeservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import java.time.LocalDateTime

@SpringBootApplication
@RequestMapping(value = ["/api/v1"])
class TimeService {
    @RequestMapping(value = ["/time"], method = [RequestMethod.GET])
    fun getTime(): ResponseEntity<String> {
        return ResponseEntity.ok(LocalDateTime.now().toString())
    }

    @RequestMapping(value = ["/shutdown"], method = [RequestMethod.POST])
    fun shutdown() = System.exit(0)
}

fun main(args: Array<String>) {
    SpringApplication.run(TimeService::class.java, *args)
}
