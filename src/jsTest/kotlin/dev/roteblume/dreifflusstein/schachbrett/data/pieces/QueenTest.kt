package dev.roteblume.dreifflusstein.schachbrett.data.pieces

import dev.roteblume.dreifflusstein.testify.impl.TestifyFactory
import kotlin.test.Test
import kotlin.test.assertEquals

class QueenTest {
    private val testify = TestifyFactory()

    @Test
    fun shouldBeAbleWhiteResourceUrlForWhitePlayer() {
        val queen = Queen(testify.player.nextWhite())
        assertEquals(queen.icon, GraphicalResource.WhiteQueen  )
    }

    @Test
    fun shouldBeAbleBlackResourceUrlForBlackPlayer() {
        val queen = Queen(testify.player.nextBlack())
        assertEquals(queen.icon, GraphicalResource.BlackQueen  )
    }
}