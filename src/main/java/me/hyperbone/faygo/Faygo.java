package me.hyperbone.faygo;

import lombok.Getter;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class Faygo {

    @Getter
    private final DependencyBuilder dependencyBuilder = new DependencyBuilder();
    @Getter
    private static Plugin plugin;
    @Getter
    private static String path = null;

    public Faygo(Plugin plugin) {
        Faygo.plugin = plugin;
        path = plugin.getDataFolder().getParent() + "/" + plugin.getDescription().getName() + "/" + "libraries";
    }

    public Faygo(Plugin plugin, String path) {
        Faygo.plugin = plugin;
        Faygo.path = plugin.getDataFolder().getParent() + path;
    }

    public static void sendConsoleMessage(String message) {
        plugin.getServer().getConsoleSender().sendMessage(message);
    }
}
