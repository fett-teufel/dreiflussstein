package dev.roteblume.dreifflusstein.schachkbrett.states

import dev.roteblume.dreifflusstein.schachkbrett.data.Player
import dev.roteblume.dreifflusstein.schachkbrett.data.pieces.Piece
import react.RState

interface ApplicationState : RState {
    var white: Player
    var black: Player
    var board: List<Piece>
}
