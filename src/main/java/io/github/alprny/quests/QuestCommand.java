package io.github.alprny.quests;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class QuestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {

        MiniMessage mm = MiniMessage.miniMessage();

        if (commandSender instanceof Player) {
            return true;
        } else {
            commandSender.sendMessage(mm.deserialize("<red>" + LanguageManager.get("only-player")));
            return false;
        }
    }
}
