package dev.roteblume.dreifflusstein.schachkbrett

import dev.roteblume.dreifflusstein.schachbrett.components.board.board
import dev.roteblume.dreifflusstein.schachkbrett.data.BoardSide
import dev.roteblume.dreifflusstein.schachkbrett.data.Player
import dev.roteblume.dreifflusstein.schachkbrett.states.ApplicationState
import dev.roteblume.dreifflusstein.schachbrett.data.deployment.initialClassicChessBoard
import react.RBuilder
import react.RComponent
import react.RProps
import styled.styledDiv
import styled.styledP

class Application : RComponent<RProps, ApplicationState>() {
    override fun ApplicationState.init() {
        white = Player(" Anatoly", "Karpov", side = BoardSide.WHITE)
        black = Player("Garry", "Kasparov", side = BoardSide.BLACK)
        board = initialClassicChessBoard(white, black)
    }

    override fun RBuilder.render() {
        board {
            board = state.board
        }
    }
}