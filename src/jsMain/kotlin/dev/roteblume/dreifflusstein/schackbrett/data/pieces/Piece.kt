package dev.roteblume.dreifflusstein.schackbrett.data.pieces

import dev.roteblume.dreifflusstein.schackbrett.data.Player

data class PieceStyle(val backgroundImage: String)


interface Piece {
    val spieler: Player
    val icon: GraphicalResource
    val style : PieceStyle
        get() = PieceStyle(backgroundImage = "url('${icon.url}')")

    fun isMovePossible(source: Int, destination: Int, isDestOccupied: Boolean): Boolean = true

    fun sourceToDestPath(src: Int, dest: Int): List<Int> = listOf()
}
