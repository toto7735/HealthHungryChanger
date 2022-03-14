package me.toto7735.healthHungryChanger.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onHealthChange(EntityDamageEvent event) {
        if (!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if (player.getHealth() - event.getDamage() <= 0) {
            event.setCancelled(true);
            player.setHealth(0.000000000000000000001);
        }
    }

    @EventHandler
    public void onFoodLevelChange(FoodLevelChangeEvent event) {
        Player player = (Player) event.getEntity();
        if (player.getFoodLevel() <= 0) player.setHealth(0);
    }


}
