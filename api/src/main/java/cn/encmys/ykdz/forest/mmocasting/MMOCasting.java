package cn.encmys.ykdz.forest.mmocasting;

import cn.encmys.ykdz.forest.mmocasting.profile.factory.ProfileFactory;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class MMOCasting extends JavaPlugin {
    public MMOCasting INSTANCE;
    public ProfileFactory PROFILE_FACTORY;

    public abstract void reload();

    public abstract void load();
}
