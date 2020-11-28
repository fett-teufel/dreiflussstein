package dev.roteblume.dreifflusstein.schachbrett.data.pieces

import dev.roteblume.dreifflusstein.testify.impl.TestifyFactory
import kotlin.test.Test
import kotlin.test.assertEquals

class KnightTest {
    private val testify = TestifyFactory()

    @Test
    fun shouldBeAbleWhiteResourceUrlForWhitePlayer() {
        val knight = Knight(testify.player.nextWhite())
        assertEquals(knight.icon, GraphicalResource.WhiteKnight)
    }

    @Test
    fun shouldBeAbleBlackResourceUrlForBlackPlayer() {
        val knight = Knight(testify.player.nextBlack())
        assertEquals(knight.icon, GraphicalResource.BlackKnight)
    }
}