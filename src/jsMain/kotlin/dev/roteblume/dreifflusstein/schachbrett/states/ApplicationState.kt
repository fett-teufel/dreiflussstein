package dev.roteblume.dreifflusstein.schachbrett.states

import dev.roteblume.dreifflusstein.model.Player
import dev.roteblume.dreifflusstein.schachkbrett.data.pieces.Piece
import react.RState

interface ApplicationState : RState {
    var white: Player
    var black: Player
    var board: List<Piece>
}
