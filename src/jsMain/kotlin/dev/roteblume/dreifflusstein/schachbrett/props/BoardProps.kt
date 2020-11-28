package dev.roteblume.dreifflusstein.schachbrett.props

import dev.roteblume.dreifflusstein.schachkbrett.data.pieces.Piece
import react.RProps

interface BoardProps : RProps {
    var board: List<Piece>
}