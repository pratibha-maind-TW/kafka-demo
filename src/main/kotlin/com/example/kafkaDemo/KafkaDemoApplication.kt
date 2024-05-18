package com.example.kafkaDemo

import com.example.kafkaDemo.Consumer.KafkaConsumer
import com.example.kafkaDemo.Producer.KafkaProducer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext


@SpringBootApplication
class KafkaDemoApplication


fun main(args: Array<String>) {
	val context : ConfigurableApplicationContext = runApplication<KafkaDemoApplication>(*args)

	val kafkaProducer: KafkaProducer = context.getBean(KafkaProducer::class.java)
	val kafkaConsumer: KafkaConsumer = context.getBean(KafkaConsumer::class.java)

	kafkaProducer.sendMessage("pexa", "This is the first message to pexa")

}
