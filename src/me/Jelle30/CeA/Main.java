package me.Jelle30.CeA;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable()  {
        getCommand("gmc").setExecutor(new GamemodeCreative()); // Calls class of command "gms"
        getCommand("gms").setExecutor(new GamemodeSurvival()); // Calls class of command "gms"
        getCommand("gma").setExecutor(new GamemodeAdventure()); // Calls class of command "gma"
    }

    public void onDisable() {

    }
}
