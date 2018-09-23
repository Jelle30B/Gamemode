package me.Jelle30.CeA;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeAdventure implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (s.equalsIgnoreCase("gma")) {
            Player player = (Player) commandSender;
            if(player.hasPermission("Gamemode.Adventure"))  {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(ChatColor.GRAY + "Set gamemode" + ChatColor.RED + " adventure" + ChatColor.GRAY + " for " + ChatColor.WHITE + player.getDisplayName() + ChatColor.GRAY + "!");
            } else  {   // If player does not have permission
                player.sendMessage(ChatColor.RED + "You do not have permission to execute that command!");
            }
        }
        return false;
    }
}
