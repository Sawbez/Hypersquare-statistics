package hypersquare.hypersquare.dev.code.player.event;

import hypersquare.hypersquare.item.action.player.PlayerEventItems;
import hypersquare.hypersquare.item.event.Event;
import hypersquare.hypersquare.item.event.EventItem;
import hypersquare.hypersquare.util.color.Colors;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class PlayerClickInvSlotEvent implements Event {
    @Override
    public ItemStack item() {
        return new EventItem()
            .setMaterial(Material.GRAY_SHULKER_BOX)
            .setName(Component.text("Player Click Inventory Event").color(Colors.SKY))
            .setDescription(
                Component.text("Executes code when a player"),
                Component.text("clicks a slot inside their inventory."))
            .setCancellable(true)
            .build()
            ;
    }

    @Override
    public String getId() {
        return "click_inv_slot";
    }

    @Override
    public String getCodeblockId() {
        return "player_event";
    }

    @Override
    public String getSignName() {
        return "ClickInv";
    }

    @Override
    public PlayerEventItems getCategory() {
        return PlayerEventItems.ITEM_EVENTS_CATEGORY;
    }
}