package nors1056.MineBruh_plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class CamAll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender command_sender, Command command_command, String command_label, String[] command_args) {
        if (command_args.length != 0) {
            String cam_name = command_args[0];
            Iterator players = Bukkit.getOnlinePlayers().iterator();

            while(players.hasNext()) {
                Player player = (Player)players.next();
                String command = "cam startother " + player.getName() + " " + cam_name;
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
            }
        }

        return true;
    }
}
