package dev.roteblume.dreifflusstein.schachbrett.data.pieces

import dev.roteblume.dreifflusstein.schachkbrett.data.Player
import dev.roteblume.dreifflusstein.schachkbrett.data.pieces.Piece

class Empty(override val owner: Player) : Piece {
    override val icon: GraphicalResource
        get() = PieceResource.Square.bySide(owner.side)
}