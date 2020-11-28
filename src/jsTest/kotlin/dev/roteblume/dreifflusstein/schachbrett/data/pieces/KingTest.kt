package dev.roteblume.dreifflusstein.schachbrett.data.pieces

import dev.roteblume.dreifflusstein.testify.impl.TestifyFactory
import kotlin.test.Test
import kotlin.test.assertEquals

class KingTest {
    private val testify = TestifyFactory()

    @Test
    fun shouldBeAbleWhiteResourceUrlForWhitePlayer() {
        val king = King(testify.player.nextWhite())
        assertEquals(king.icon, GraphicalResource.WhiteQueen)
    }

    @Test
    fun shouldBeAbleBlackResourceUrlForBlackPlayer() {
        val king = King(testify.player.nextBlack())
        assertEquals(king.icon, GraphicalResource.BlackQueen)
    }
}