package io.github.oneservermc.betwars

class Betwars : AbstractBetwars()
{
    companion object
    {
        lateinit var plugin: Betwars
    }

    override fun onEnable()
    {
        plugin = this
    }
}