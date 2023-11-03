package nors1056.MineBruh_plugin;

import nors1056.MineBruh_plugin.commands.CamAll;
import nors1056.MineBruh_plugin.commands.CreateParticles;
import nors1056.MineBruh_plugin.ivents.bat_spawn;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("MBcamall").setExecutor(new CamAll());
        this.getCommand("MBcreateparticle").setExecutor(new CreateParticles());
        getServer().getPluginManager().registerEvents(new bat_spawn(), this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "MineBruh plugin start successful");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
