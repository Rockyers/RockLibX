package me.rockyers.rocklibx;

import org.bukkit.plugin.PluginLoadOrder;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.LoadOn;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.Website;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@Plugin(name = "RockLibX", version = "1.0.0")
@Description(desc = "A general use library for Minecraft plugins")
@LoadOn(loadOn = PluginLoadOrder.STARTUP)
@Author(name = "rockyers")
@Website(url = "https://github.com/Rockyers/RockLibX")
public class RockLibX extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onLoad() {

    }

    @Override
    public void onDisable() {

    }
}
