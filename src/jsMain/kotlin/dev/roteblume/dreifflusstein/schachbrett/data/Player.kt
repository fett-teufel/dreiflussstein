package dev.roteblume.dreifflusstein.schachkbrett.data

enum class BoardSide {
    WHITE,
    BLACK
}

data class Player(
    val firstName: String = "",
    val secondName: String = "",
    val displayName: String = "",
    val side: BoardSide,
)


