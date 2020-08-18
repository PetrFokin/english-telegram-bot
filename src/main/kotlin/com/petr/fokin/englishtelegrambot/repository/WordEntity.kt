package com.petr.fokin.englishtelegrambot.repository


import javax.persistence.*

//TODO: finish
@Table(name = "TEXT")
@Entity
class WordEntity {
    @Id
    @SequenceGenerator(name = "text_seq", sequenceName = "text_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "text_seq")
    var id: Long? = null

    @Column(name = "word", nullable = false)
    var word: String? = null

    @Column(name = "transcription")
    var transcription: String? = null

    @Column(name = "definition")
    var definition: String? = null

    @Column(name = "??????????")
    var partOfSpeech: String? = null

    @Column(name = "??????????")
    var examples: String? = null

}