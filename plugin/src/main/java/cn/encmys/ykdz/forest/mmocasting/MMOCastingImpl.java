package cn.encmys.ykdz.forest.mmocasting;

import org.bukkit.plugin.java.JavaPlugin;

public final class MMOCastingImpl extends MMOCasting {

    @Override
    public void onLoad() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
