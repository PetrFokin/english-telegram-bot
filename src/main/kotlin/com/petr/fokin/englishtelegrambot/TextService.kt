package com.petr.fokin.englishtelegrambot

import org.springframework.stereotype.Service

@Service
class TextService(val textRepository: TextRepository) {

    fun saveText(text: Text) {
        textRepository.save(TextEntity(text.word))
    }
}