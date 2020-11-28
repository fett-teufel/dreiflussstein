package dev.roteblume.dreiflussstein.testify.impl

import dev.roteblume.dreifflusstein.model.BoardSide
import dev.roteblume.dreifflusstein.testify.impl.PlayersCollection
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class PlayersCollectionTest {
    lateinit var sut: PlayersCollection
    @BeforeTest
    fun tearUp() {
        sut = PlayersCollection()
    }
    @Test
    fun shouldBeAbleGenerateRandomWhitePlayer() {
        val player =  sut.next(BoardSide.WHITE)
        assertTrue { player.displayName.isNotBlank() }
        assertTrue { player.firstName.isNotBlank() }
        assertTrue { player.secondName.isNotBlank() }
        assertTrue { player.side == BoardSide.WHITE }
    }

    @Test
    fun shouldBeAbleGenerateRandomBlackPlayer() {
        val player =  sut.next(BoardSide.BLACK)
        assertTrue { player.displayName.isNotBlank() }
        assertTrue { player.firstName.isNotBlank() }
        assertTrue { player.secondName.isNotBlank() }
        assertTrue { player.side == BoardSide.BLACK }
    }
}