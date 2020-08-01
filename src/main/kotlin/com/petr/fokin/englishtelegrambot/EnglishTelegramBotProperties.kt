package com.petr.fokin.englishtelegrambot

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "english.telegram.bot")
class EnglishTelegramBotProperties {
    lateinit var userName: String
    lateinit var botToken: String
}