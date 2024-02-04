package me.elfrod0;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;

public class UnixPlaceholderExtension extends PlaceholderExpansion {

    @Override
    public String getIdentifier() {
        return "mUnix";
    }

    @Override
    public String getAuthor() {
        return "El_Frod0";
    }

    @Override
    public String getVersion() {
        return "1.1";
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {
        long currTimeMillis = System.currentTimeMillis();
        switch (identifier) {
            case "minutes":
                long currTimeMinutes = currTimeMillis / 60000L;
                return String.valueOf(currTimeMinutes);
            case "seconds":
                long currTimeSeconds = currTimeMillis / 1000L;
                return String.valueOf(currTimeSeconds);
            case "millis":
                return String.valueOf(currTimeMillis);
            default:
                return "Invalid identifier, use: millis, seconds, minutes";
        }
    }
}