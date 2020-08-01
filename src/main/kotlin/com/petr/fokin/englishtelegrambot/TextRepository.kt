package com.petr.fokin.englishtelegrambot

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TextRepository: JpaRepository<TextEntity, Long> {

}