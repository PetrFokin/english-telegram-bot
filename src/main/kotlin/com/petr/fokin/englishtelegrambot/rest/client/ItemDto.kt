package com.petr.fokin.englishtelegrambot.rest.client

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class ItemDto {
    var definition: String? = null
    var partOfSpeech: String? = null
    val examples: MutableList<String> = ArrayList()
}