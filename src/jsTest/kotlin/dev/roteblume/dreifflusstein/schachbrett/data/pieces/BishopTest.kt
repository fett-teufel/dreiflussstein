package dev.roteblume.dreifflusstein.schachbrett.data.pieces


import dev.roteblume.dreifflusstein.testify.impl.TestifyFactory
import kotlin.test.Test
import kotlin.test.assertEquals

class BishopTest {

    private val testify = TestifyFactory()

    @Test
    fun shouldBeAbleWhiteResourceUrlForWhitePlayer() {
        val bishop = Bishop(testify.player.nextWhite())
        assertEquals(bishop.icon, GraphicalResource.WhiteBishop  )
    }

    @Test
    fun shouldBeAbleBlackResourceUrlForBlackPlayer() {
        val bishop = Bishop(testify.player.nextBlack())
        assertEquals(bishop.icon, GraphicalResource.BlackBishop  )
    }

}