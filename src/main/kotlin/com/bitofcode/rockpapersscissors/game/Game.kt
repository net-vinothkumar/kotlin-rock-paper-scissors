package com.bitofcode.rockpapersscissors.game

interface Game {
    fun play(shapeType: ShapeType?) : WinnerType
}