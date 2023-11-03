package nors1056.MineBruh_plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class CreateParticles implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender command_sender, Command command_command, String command_label, String[] command_args) {
        if (command_args.length == 7) {
            Player player = Bukkit.getPlayer("nors1056");

            int y = Integer.parseInt(command_args[0]);
            int x1 = Integer.parseInt(command_args[1]);
            int x2 = Integer.parseInt(command_args[2]);
            int z1 = Integer.parseInt(command_args[3]);
            int z2 = Integer.parseInt(command_args[4]);
            int particle_amount = Integer.parseInt(command_args[5]);
            String particle_name = command_args[6];

            int x_int = (x2 - x1)/particle_amount;
            int z_int = (z2 - z1)/particle_amount;

            int x = x1;
            int z = z1;

            while(x != x2 && z != z2) {
                x += x_int;
                z += z_int;
                // x, y, z - координаты спавна партиклов

                String command = String.format("particle %s %s %s %s", particle_name, x, y, z);
                player.performCommand(command);
            }
        }

        return true;
    }
}
