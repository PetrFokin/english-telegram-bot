package com.petr.fokin.englishtelegrambot

import com.fasterxml.jackson.databind.ObjectMapper
import com.squareup.okhttp.OkHttpClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.telegram.telegrambots.ApiContextInitializer

@SpringBootApplication
class EnglishTelegramBotApplication {

	@Bean
	fun okHttpClient() = OkHttpClient()

	@Bean
	fun objectMapper() = ObjectMapper()
}


fun main(args: Array<String>) {
	ApiContextInitializer.init();
	runApplication<EnglishTelegramBotApplication>(*args)
}


