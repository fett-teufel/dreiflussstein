package dev.roteblume.dreifflusstein.schachbrett.data.pieces

import dev.roteblume.dreifflusstein.model.Player
import dev.roteblume.dreifflusstein.schachkbrett.data.pieces.Piece

class Pawn(override val owner: Player) : Piece {
    override val icon: GraphicalResource
        get() = PieceResource.Pawns.bySide(owner.side)
}
