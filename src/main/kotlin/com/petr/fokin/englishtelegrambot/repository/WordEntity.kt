package com.petr.fokin.englishtelegrambot.repository


import javax.persistence.*

@Table(name = "WORD")
@Entity
class WordEntity {
    @Id
    @SequenceGenerator(name = "word_seq", sequenceName = "word_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "word_seq")
    var id: Long? = null

    @Column(name = "word")
    var word: String? = null

    @Column(name = "transcription")
    var transcription: String? = null

    @Column(name = "definition")
    var definition: String? = null

    @Column(name = "part_of_speech")
    var partOfSpeech: String? = null

    @Column(name = "examples")
    var examples: String? = null

    @Column(name = "chat_id")
    var chatId: Long? = null
}