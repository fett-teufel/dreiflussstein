package dev.roteblume.dreifflusstein.schachbrett.components.board

import dev.roteblume.dreifflusstein.schachbrett.props.BoardProps
import react.RBuilder
import react.RComponent
import react.RState
import react.ReactElement
import styled.css
import styled.styledDiv

fun Int.isEven() = this and 1 == 0

class Board : RComponent<BoardProps, RState>() {
    override fun RBuilder.render() {
        for (i in 0..7) {
            val j = i * 8

            styledDiv {
                css {
                    classes.add("board-row")
                }
                props.board.subList(j, j + 8).forEachIndexed { index, pieceAtSquare ->
                    val squareShade = if ((i.isEven() && index.isEven()) || (!i.isEven() && !index.isEven()))
                        "light-square" else "dark-square"
                    square {
                        piece = pieceAtSquare
                        shade = squareShade

                    }
                }
            }
        }
    }
}

fun RBuilder.board(handler: BoardProps.() -> Unit): ReactElement {
    return child(Board::class) {
        this.attrs(handler)
    }
}