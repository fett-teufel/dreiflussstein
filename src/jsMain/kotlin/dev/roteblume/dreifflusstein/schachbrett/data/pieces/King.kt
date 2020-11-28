package dev.roteblume.dreifflusstein.schachbrett.data.pieces

import dev.roteblume.dreifflusstein.schachkbrett.data.Player
import dev.roteblume.dreifflusstein.schachkbrett.data.pieces.Piece

class King(override val owner: Player): Piece {
    override val icon: GraphicalResource
        get() = PieceResource.Kings.bySide(owner.side)
}