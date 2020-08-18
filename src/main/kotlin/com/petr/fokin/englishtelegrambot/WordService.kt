package com.petr.fokin.englishtelegrambot

import com.petr.fokin.englishtelegrambot.repository.WordRepository
import com.petr.fokin.englishtelegrambot.rest.client.TranslatorClient
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

private val LOGGER = LoggerFactory.getLogger(WordService::class.java)

@Service
class WordService(val wordRepository: WordRepository,
                  val client: TranslatorClient) {

    fun saveWord(word: String) {
        val translatedWord = client.translateWord(word)
        wordRepository.save(translatedWord)
    }

}