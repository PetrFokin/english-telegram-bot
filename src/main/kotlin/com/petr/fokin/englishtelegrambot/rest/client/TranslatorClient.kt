package com.petr.fokin.englishtelegrambot.rest.client

import com.fasterxml.jackson.databind.ObjectMapper
import com.petr.fokin.englishtelegrambot.EnglishTelegramBotProperties
import com.petr.fokin.englishtelegrambot.repository.WordEntity
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

private val LOGGER = LoggerFactory.getLogger(TranslatorClient::class.java)

@Component
class TranslatorClient(val okHttpClient: OkHttpClient,
                       val objectMapper: ObjectMapper,
                       val properties: EnglishTelegramBotProperties) {

    //Do I need separate model?
    fun translateWord(word: String): WordEntity {
        val response = okHttpClient.newCall(getRequest(word)).execute().body().string()
        LOGGER.info(response)
        val wordDto = objectMapper.readValue(response, WordDto::class.java)
        return WordEntity() //TODO: fix by mapper
    }

    private fun getRequest(word: String) = Request.Builder()
            .url("https://wordsapiv1.p.rapidapi.com/words/$word")
            .get()
            .addHeader("x-rapidapi-host", properties.translatorHost)
            .addHeader("x-rapidapi-key", properties.authKey)
            .build()
}