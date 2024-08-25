package cn.encmys.ykdz.forest.mmocasting.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.jetbrains.annotations.NotNull;

public class ComboListener implements Listener {
    @EventHandler
    public void onPlayerDropItem(@NotNull PlayerDropItemEvent event) {
        Player player = event.getPlayer();
    }
}
