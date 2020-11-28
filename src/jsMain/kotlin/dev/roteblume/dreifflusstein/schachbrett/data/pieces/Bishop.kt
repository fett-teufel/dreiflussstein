package dev.roteblume.dreifflusstein.schachbrett.data.pieces


import dev.roteblume.dreifflusstein.model.Player
import dev.roteblume.dreifflusstein.schachkbrett.data.pieces.Piece

class Bishop(override val owner: Player) : Piece {
    override val icon: GraphicalResource
        get() = PieceResource.Bishops.bySide(owner.side)
}

