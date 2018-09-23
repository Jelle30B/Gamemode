package me.Jelle30.CeA;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeSurvival implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        if(player.hasPermission("Gamemode.Survival")) {
            if (s.equalsIgnoreCase("gms")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.GRAY + "Set gamemode" + ChatColor.RED + " survival" + ChatColor.GRAY + " for " + ChatColor.WHITE + player.getDisplayName() + ChatColor.GRAY + "!");
            }
        } else  {
            player.sendMessage(ChatColor.RED + "You do not have permission to use that command!");
        }
        return false;
    }
}

