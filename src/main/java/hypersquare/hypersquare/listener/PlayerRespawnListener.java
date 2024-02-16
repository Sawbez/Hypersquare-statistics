package hypersquare.hypersquare.listener;

import hypersquare.hypersquare.Hypersquare;
import hypersquare.hypersquare.plot.PlotDatabase;
import hypersquare.hypersquare.plot.PlotManager;
import hypersquare.hypersquare.util.PlotUtilities;
import hypersquare.hypersquare.util.Utilities;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerRespawnListener implements Listener {
    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        Player player = event.getPlayer();
        if (Hypersquare.mode.get(player).equals("playing")) {
            event.setRespawnLocation(PlotDatabase.getPlotSpawnLocation(PlotUtilities.getPlotId(player)));
            return;
        }
        event.setRespawnLocation(Hypersquare.lastDeathLoc.get(player).getSpawnLocation());
        Hypersquare.lastDeathLoc.remove(player);
    }
}
