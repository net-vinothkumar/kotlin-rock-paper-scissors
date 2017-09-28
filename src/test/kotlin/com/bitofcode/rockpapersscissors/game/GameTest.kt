package com.bitofcode.rockpapersscissors.game

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

class GameTest {
    private var game: Game? = null
    private var gameToTestDidIWin: Game? = null

    @Before
    fun canCreateGame() {
        game = GameImpl()
        gameToTestDidIWin = object : Game {
            override fun play(shapeType: ShapeType?): WinnerType {
                return WinnerType.I_WIN
            }
        }
    }

    @Test(expected = ShapeInvalidException::class)
    @Throws(Exception::class)
    fun given_null_then_throw_ArgumentInvalidException() {
        game?.play(null)
    }

    @Test
    @Throws(Exception::class)
    fun given_shape_against_random_should_win() {
        val didIWin = gameToTestDidIWin?.play(ShapeType.SCISSOR)
        assertThat(
                didIWin,
                `is`(WinnerType.I_WIN)
        )
    }
}

