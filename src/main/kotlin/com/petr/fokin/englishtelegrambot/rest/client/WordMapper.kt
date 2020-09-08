package com.petr.fokin.englishtelegrambot.rest.client

import com.petr.fokin.englishtelegrambot.repository.WordEntity
import org.springframework.stereotype.Component

@Component
class WordMapper {
    fun mapToEntity(wordDto: WordDto) = WordEntity().apply {
        word = wordDto.word
        transcription = wordDto.pronunciation?.all
        definition = wordDto.results.joinToString(System.lineSeparator()) { itemDto -> itemDto.partOfSpeech + " : " + itemDto.definition }
        examples = wordDto.results.flatMap { it.examples }.joinToString(System.lineSeparator(), limit = 5) { it }
    }
}