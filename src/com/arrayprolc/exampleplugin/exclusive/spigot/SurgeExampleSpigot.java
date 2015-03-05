package com.arrayprolc.exampleplugin.exclusive.spigot;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.arrayprolc.exampleplugin.global.main.SurgeExample;
import com.arrayprolc.surge.exclusive.command.SpigotCommandHandler;

public class SurgeExampleSpigot extends JavaPlugin {

    SurgeExample plugin;

    /**
     * We need to hook the events in the main class from Spigot. Feel free to
     * copy this class into your own plugin, you should never need to use it.
     */

    public void onEnable() {
        plugin = new SurgeExample();
        plugin.onEnable();
    }

    public void onDisable() {
        plugin.onDisable();
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return SpigotCommandHandler.onCommand(sender, command, label, args);
    }

}
