package com.petr.fokin.englishtelegrambot.rest.client

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class WordDto {
    var word: String? = null
    var results: MutableList<ItemDto> = ArrayList()
    var pronunciation: PronunciationDto? = null
}