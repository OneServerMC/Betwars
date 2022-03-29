package io.github.oneservermc.betwars.game

class GameManager
{
    companion object
    {
        private var instance: GameManager? = null

        fun getInstance(): GameManager
        {
            if (instance == null)
                instance = GameManager()

            return instance!!
        }
    }

    fun startGame()
    {
    }

    fun finishGame()
    {
    }

    fun resetGame()
    {
    }
}