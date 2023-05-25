package me.rockyers.splib;

import org.bukkit.plugin.PluginLoadOrder;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.LoadOn;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.Website;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

/**
 * The main plugin class, where the plugin starts. Take a look at the <a href="https://github.com/Rockyers/SPlib">Github</a>
 * <p>
 * Using <a href="https://www.spigotmc.org/wiki/spigot-plugin-yml-annotations/?noRedirect=1">Spigot Plugin.yml Annotations</a> to generate the plugin.yml.
 */
@Plugin(name = "SPlib", version = "1.0.0")
@Description(desc = "A general use library for Minecraft plugins")
@LoadOn(loadOn = PluginLoadOrder.STARTUP)
@Author(name = "rockyers")
@Website(url = "https://github.com/Rockyers/SPlib")
public class SPlib extends JavaPlugin {

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
