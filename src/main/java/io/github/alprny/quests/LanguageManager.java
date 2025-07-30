package io.github.alprny.quests;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class LanguageManager {

    private static FileConfiguration lang;

    public static void load(JavaPlugin plugin) {
        String langCode = plugin.getConfig().getString("language", "en");
        String fileName = "lang/messages-" + langCode + ".yml";
        lang = YamlConfiguration.loadConfiguration(
                new InputStreamReader(Objects.requireNonNull(plugin.getResource(fileName)), StandardCharsets.UTF_8)
        );
    }

    public static String get(String key) {
        return lang.getString(key, "!" + key + "!");
    }
}