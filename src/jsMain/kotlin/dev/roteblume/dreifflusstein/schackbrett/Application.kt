package dev.roteblume.dreifflusstein.schackbrett

import dev.roteblume.dreifflusstein.schackbrett.states.ApplicationState
import react.RBuilder
import react.RComponent
import react.RProps
import styled.styledDiv
import styled.styledP

class Application : RComponent<RProps, ApplicationState>() {
    override fun RBuilder.render() {
        styledDiv {
            styledP {
                + "Render there"
            }
        }
    }
}