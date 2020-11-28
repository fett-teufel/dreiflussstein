package dev.roteblume.dreifflusstein.schackbrett.states

import dev.roteblume.dreifflusstein.schackbrett.data.Player
import dev.roteblume.dreifflusstein.schackbrett.data.pieces.Piece
import react.RState

interface ApplicationState : RState {
    var white: Player
    var black: Player
    var board: List<Piece>
}
