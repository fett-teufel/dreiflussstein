package dev.roteblume.dreifflusstein.schachbrett.data.pieces

import dev.roteblume.dreifflusstein.testify.impl.TestifyFactory
import kotlin.test.Test
import kotlin.test.assertEquals


class RookTest {
    private val testify = TestifyFactory()

    @Test
    fun shouldBeAbleWhiteResourceUrlForWhitePlayer() {
        val rook = Rook(testify.player.nextWhite())
        assertEquals(rook.icon, GraphicalResource.WhiteRook  )
    }

    @Test
    fun shouldBeAbleBlackResourceUrlForBlackPlayer() {
        val rook = Rook(testify.player.nextBlack())
        assertEquals(rook.icon, GraphicalResource.BlackRook  )
    }
}