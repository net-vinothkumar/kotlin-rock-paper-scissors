package com.bitofcode.rockpapersscissors.game

class GameImpl : Game {
    override fun play(shapeType: ShapeType?): WinnerType {
        throw ShapeInvalidException("Invalid Shape")
    }

}