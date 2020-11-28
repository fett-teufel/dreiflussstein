package dev.roteblume.dreifflusstein.testify.impl

import dev.roteblume.dreifflusstein.testify.api.Players
import dev.roteblume.dreifflusstein.testify.api.TestFactory

class TestifyFactory(
    override val player: Players = PlayersCollection()
) : TestFactory