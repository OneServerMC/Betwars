package io.github.oneservermc.betwars.commands

import hazae41.minecraft.kutils.bukkit.msg
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class BetwarsCommand : CommandExecutor
{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean
    {
        if (args.isEmpty())
        {
            sender.msg("Arguments are empty.")
            return true
        }

        when (args[0])
        {
            "help" -> {
            }

            "start" -> {
            }

            "finish" -> {
            }
        }

        return true
    }
}