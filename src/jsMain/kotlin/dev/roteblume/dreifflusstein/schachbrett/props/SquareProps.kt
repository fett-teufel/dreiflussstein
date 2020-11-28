package dev.roteblume.dreifflusstein.schachbrett.props

import dev.roteblume.dreifflusstein.schachkbrett.data.pieces.Piece
import react.RProps

interface SquareProps : RProps {
    var piece: Piece?
    var shade: String?
    var onClick: () -> Unit
}