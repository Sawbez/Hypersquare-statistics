package hypersquare.hypersquare.dev.code.player.event;

import hypersquare.hypersquare.item.action.player.PlayerEventItems;
import hypersquare.hypersquare.item.event.Event;
import hypersquare.hypersquare.item.event.EventItem;
import hypersquare.hypersquare.util.color.Colors;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class PlayerDismountEvent implements Event {
    @Override
    public ItemStack item() {
        return new EventItem()
            .setMaterial(Material.SADDLE)
            .setName(Component.text("Player Dismount Event").color(Colors.BLUE))
            .setDescription(
                Component.text("Executes code when a player"),
                Component.text("dismounts an entity."))
            .setCancellable(true)
            .build()
            ;
    }

    @Override
    public String getId() {
        return "dismount";
    }

    @Override
    public String getCodeblockId() {
        return "player_event";
    }

    @Override
    public String getSignName() {
        return "Dismount";
    }

    @Override
    public PlayerEventItems getCategory() {
        return PlayerEventItems.MOVEMENT_EVENTS_CATEGORY;
    }
}