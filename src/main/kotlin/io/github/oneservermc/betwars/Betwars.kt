package io.github.oneservermc.betwars

import io.github.oneservermc.betwars.commands.BetwarsCommand

class Betwars : AbstractBetwars()
{
    companion object
    {
        lateinit var plugin: Betwars
    }

    override fun onEnable()
    {
        plugin = this

        registerCommands(
            "betwars" to BetwarsCommand()
        )
    }
}