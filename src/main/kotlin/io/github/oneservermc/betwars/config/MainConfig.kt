package io.github.oneservermc.betwars.config

import hazae41.minecraft.kutils.bukkit.PluginConfigFile

class MainConfig : PluginConfigFile("config")
{
    var prefix by string("prefix")
    var time by int("time")
}