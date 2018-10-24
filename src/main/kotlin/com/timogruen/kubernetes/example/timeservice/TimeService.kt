package com.timogruen.kubernetes.example.timeservice

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import java.net.InetSocketAddress
import java.time.LocalDateTime

@SpringBootApplication
@RequestMapping(value = ["/api/v1"])
class TimeService {
    val log = LoggerFactory.getLogger(TimeService::class.java)

    @RequestMapping(value = ["/time"], method = [RequestMethod.GET])
    fun getTime(): ResponseEntity<String> {
        log.info("Request received")
        return ResponseEntity.ok(LocalDateTime.now().toString())
    }

    @RequestMapping(value = ["/shutdown"], method = [RequestMethod.POST])
    fun shutdown() {
        log.info("Shutdown Service")
        System.exit(0)
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(TimeService::class.java, *args)
}
