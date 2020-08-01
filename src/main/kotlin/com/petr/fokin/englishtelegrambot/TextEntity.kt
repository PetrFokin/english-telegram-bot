package com.petr.fokin.englishtelegrambot


import javax.persistence.*

@Table(name = "TEXT")
@Entity
data class TextEntity(
        @Column(name = "word", nullable = false)
        val word: String
) {
    @Id
    @SequenceGenerator(name = "text_seq", sequenceName = "text_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "text_seq")
    var id: Long? = null
    @Column(name = "transcription")
    var transcription: String? = null
}