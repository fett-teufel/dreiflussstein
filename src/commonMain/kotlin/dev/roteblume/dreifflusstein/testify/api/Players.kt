package dev.roteblume.dreifflusstein.testify.api

import dev.roteblume.dreifflusstein.model.BoardSide
import dev.roteblume.dreifflusstein.model.Player

interface Players {
    fun next(side: BoardSide): Player
    fun nextWhite(): Player = next(BoardSide.WHITE)
    fun nextBlack(): Player = next(BoardSide.BLACK)
}