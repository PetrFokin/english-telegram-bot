package com.petr.fokin.englishtelegrambot

import com.petr.fokin.englishtelegrambot.repository.WordRepository
import com.petr.fokin.englishtelegrambot.rest.client.TranslatorClient
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.telegram.telegrambots.meta.api.objects.Message

private val log = LoggerFactory.getLogger(WordService::class.java)

@Service
class WordService(val wordRepository: WordRepository,
                  val client: TranslatorClient) {

    fun saveWord(message: Message) {
        val word = message.text
        val chatId = message.chatId
        log.info("New message: $word, from chatId: $chatId")
        val translatedWord = client.translateWord(word)
        log.info("Entity: $translatedWord")
        translatedWord.chatId = chatId
        wordRepository.save(translatedWord)
    }

}