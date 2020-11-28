package dev.roteblume.dreifflusstein.schachbrett.data.deployment

import dev.roteblume.dreifflusstein.model.Player
import dev.roteblume.dreifflusstein.schachkbrett.data.pieces.Piece
import dev.roteblume.dreifflusstein.schachbrett.data.pieces.*

fun initialClassicChessBoard(white: Player, black: Player): List<Piece> {
    val squares = mutableListOf<Piece>()

    for (i in 0..63) {
        when (i) {
            in 8..15 -> squares.add(Pawn(black))
            in 48..55 -> squares.add(Pawn(white))
            0 -> squares.add(Rook(black))
            7 -> squares.add(Rook(black))
            56 -> squares.add(Rook(white))
            63 -> squares.add(Rook(white))
            1 -> squares.add(Knight(black))
            6 -> squares.add(Knight(black))
            57 -> squares.add(Knight(white))
            62 -> squares.add(Knight(white))
            2 -> squares.add(Bishop(black))
            5 -> squares.add(Bishop(black))
            58 -> squares.add(Bishop(white))
            61 -> squares.add(Bishop(white))
            3 -> squares.add(Queen(black))
            4 -> squares.add(King(black))
            59 -> squares.add(Queen(white))
            60 -> squares.add(King(white))
            else -> squares.add(Empty(white))
        }
    }

    return squares
}