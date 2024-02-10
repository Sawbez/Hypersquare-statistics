package hypersquare.hypersquare.dev.code.player.event;

import hypersquare.hypersquare.item.action.player.PlayerEventItems;
import hypersquare.hypersquare.item.event.Event;
import hypersquare.hypersquare.item.event.EventItem;
import hypersquare.hypersquare.util.color.Colors;
import net.kyori.adventure.text.Component;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class PlayerClickPlayerEvent implements Event {
    @Override
    public ItemStack item() {
        return new EventItem()
            .setName(Component.text("Player Click Player Event").color(Colors.SKY))
            .setDescription(
                Component.text("Executes code when a player"),
                Component.text("right clicks another player."))
            .setMaterial(Material.PLAYER_HEAD)
            .build();
    }

    @Override
    public String getId() {
        return "click_player";
    }

    @Override
    public String getCodeblockId() {
        return "player_event";
    }

    @Override
    public String getSignName() {
        return "ClickPlayer";
    }

    @Override
    public PlayerEventItems getCategory() {
        return PlayerEventItems.CLICK_EVENTS_CATEGORY;
    }
}
