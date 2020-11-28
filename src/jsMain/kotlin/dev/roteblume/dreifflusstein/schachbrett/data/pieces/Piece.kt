package dev.roteblume.dreifflusstein.schachkbrett.data.pieces

import dev.roteblume.dreifflusstein.schachkbrett.data.Player
import dev.roteblume.dreifflusstein.schachbrett.data.pieces.GraphicalResource

data class PieceStyle(val backgroundImage: String)


interface Piece {
    val owner: Player
    val icon: GraphicalResource
    val style : PieceStyle
        get() = PieceStyle(backgroundImage = "url('${icon.url}')")
}
