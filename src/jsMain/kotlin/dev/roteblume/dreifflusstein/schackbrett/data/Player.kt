package dev.roteblume.dreifflusstein.schackbrett.data

enum class BoardSide {
    WHITE,
    BLACK
}

data class Player(
    val firstName: String = "",
    val secondName: String = "",
    val displayName: String,
    val side: BoardSide,
)


