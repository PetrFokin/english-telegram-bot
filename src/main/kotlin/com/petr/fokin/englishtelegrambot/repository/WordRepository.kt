package com.petr.fokin.englishtelegrambot.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WordRepository: JpaRepository<WordEntity, Long> {

}