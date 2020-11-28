package dev.roteblume.dreifflusstein.schachbrett.data.pieces

import dev.roteblume.dreifflusstein.testify.impl.TestifyFactory
import kotlin.test.Test
import kotlin.test.assertEquals

class EmptyTest {
    private val testify = TestifyFactory()

    @Test
    fun shouldBeAbleWhiteResourceUrlForWhitePlayer() {
        val rook = Empty(testify.player.nextWhite())
        assertEquals(rook.icon, GraphicalResource.LightSquare)
    }

    @Test
    fun shouldBeAbleBlackResourceUrlForBlackPlayer() {
        val rook = Empty(testify.player.nextBlack())
        assertEquals(rook.icon, GraphicalResource.DarkSquare)
    }
}