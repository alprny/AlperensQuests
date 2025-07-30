package io.github.alprny.quests;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Quests extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();

        LanguageManager.load(this);

        String lang = getConfig().getString("language", "en");

        if (lang.equals("tr")) {
            Objects.requireNonNull(getCommand("gorev")).setExecutor(new QuestCommand());
        } else if (lang.equals("en")) {
            Objects.requireNonNull(getCommand("quest")).setExecutor(new QuestCommand());
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
