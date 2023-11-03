package nors1056.MineBruh_plugin.ivents;

import org.bukkit.Material;
import org.bukkit.entity.Bat;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class bat_spawn implements Listener {

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (!(event.getEntity() instanceof Bat)) {
            return;
        }

        Bat bat = (Bat) event.getEntity();
        bat.setRemoveWhenFarAway(false);
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        if (!(event.getEntity() instanceof Bat)) {
            return;
        }

        Random rand = new Random();
        int chance = rand.nextInt(3);
        if (chance == 0) { // 33.(3)% chance
            event.getDrops().add(new ItemStack(Material.DIAMOND_ORE));
        }
    }
}

