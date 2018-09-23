package me.Jelle30.CeA;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable()  {
        getCommand("gmc").setExecutor(new GamemodeCreative());
        getCommand("gms").setExecutor(new GamemodeSurvival());
    }

    public void onDisable() {

    }
}
