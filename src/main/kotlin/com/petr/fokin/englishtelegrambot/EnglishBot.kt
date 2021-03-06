package com.petr.fokin.englishtelegrambot

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.objects.Update

private val LOGGER = LoggerFactory.getLogger(EnglishBot::class.java)

@Component
class EnglishBot(val wordService: WordService,
                 val properties: EnglishTelegramBotProperties) : TelegramLongPollingBot() {

    override fun getBotUsername() = properties.userName

    override fun getBotToken() = properties.botToken

    override fun onUpdateReceived(update: Update?) {
        val message = update?.message
        wordService.saveWord(message!!)
    }
}