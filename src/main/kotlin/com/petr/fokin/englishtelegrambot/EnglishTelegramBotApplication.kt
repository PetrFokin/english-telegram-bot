package com.petr.fokin.englishtelegrambot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.telegram.telegrambots.ApiContextInitializer

@SpringBootApplication
class EnglishTelegramBotApplication

fun main(args: Array<String>) {
	ApiContextInitializer.init();
	runApplication<EnglishTelegramBotApplication>(*args)
}
