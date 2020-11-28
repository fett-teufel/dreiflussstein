package dev.roteblume.dreifflusstein.schachbrett.components.board

import dev.roteblume.dreifflusstein.schachbrett.props.SquareProps
import kotlinx.css.Image
import kotlinx.css.backgroundImage
import kotlinx.css.backgroundSize
import react.RBuilder
import react.RComponent
import react.RState
import react.ReactElement
import styled.css
import styled.styledButton

class Square : RComponent<SquareProps, RState>() {
    override fun RBuilder.render() {
        styledButton {
            css {
                classes.add("square")
                props.shade?.let { classes.add(it) }
                props.piece?.let {
                    backgroundImage = Image(it.style.backgroundImage)
                    backgroundSize = "100%"

                }
            }
        }
    }
}

fun RBuilder.square(handler: SquareProps.() -> Unit): ReactElement {
    return child(Square::class) {
        this.attrs(handler)
    }
}