package me.Jelle30.CeA;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCreative implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        if (player.hasPermission("Gamemode.Creative")) {
            if (s.equalsIgnoreCase("gmc")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.GRAY + "Set gamemode" + ChatColor.RED + " creative" + ChatColor.GRAY + " for " + ChatColor.WHITE + player.getDisplayName() + ChatColor.GRAY + "!");
            }

        } else  {
            player.sendMessage(ChatColor.RED + "You do not have permission to use that command!");
        }
        return false;
    }

}


