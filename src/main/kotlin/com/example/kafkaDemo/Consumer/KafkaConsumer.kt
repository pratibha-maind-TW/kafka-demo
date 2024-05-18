package com.example.kafkaDemo.Consumer
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {
    @KafkaListener(topics = ["pexa"])
    fun receiveMessage(message: String) {
        println("Received message: $message")
    }
}