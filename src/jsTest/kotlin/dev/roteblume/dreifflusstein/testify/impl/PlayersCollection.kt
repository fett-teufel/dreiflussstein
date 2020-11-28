package dev.roteblume.dreifflusstein.testify.impl

import dev.roteblume.dreifflusstein.schachkbrett.data.BoardSide
import dev.roteblume.dreifflusstein.schachkbrett.data.Player
import dev.roteblume.dreifflusstein.testify.api.Players
import kotlin.random.Random

val defaultFirstNames = listOf(
    "Paul", "Wilhelm", "Emmanuel", "Hose", "Alexander", "Michael", "Vasiliy", "Tigran", "Boris", "James", "Anatoly",
    "Garry", "Vladimir", "Vishy", "Magnus"
)

val defaultLastNames = listOf(
    "Morphy", "Steinitz", "Lasker", "Capablanka", "Alekhine", "Botwinnik", "Smyslov", "Tal", "Petrosyan", "Spassky",
    "Karpov", "Kasparov", "Krammnik", "Annand", "Karlsen"
)

class PlayersCollection(
    private val firstNames: List<String> = defaultFirstNames,
    private val lastNames: List<String> = defaultLastNames
) : Players {

    override fun next(side: BoardSide): Player {
        val firstName = firstNames[Random.nextInt(0, firstNames.size)]
        val secondName = lastNames[Random.nextInt(0, lastNames.size)]
        return Player(
            firstName = firstName,
            secondName = secondName,
            displayName = "$firstName $secondName",
            side = side
        )
    }
}
