package me.toto7735.healthHungryChanger;

import me.toto7735.healthHungryChanger.listener.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class HealthHungryChanger extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Listener(), this);
    }

}
