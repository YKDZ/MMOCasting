package cn.encmys.ykdz.forest.mmocasting;

import cn.encmys.ykdz.forest.mmocasting.hook.MythicLibHook;
import cn.encmys.ykdz.forest.mmocasting.profile.factory.ProfileFactory;
import cn.encmys.ykdz.forest.mmocasting.profile.factory.ProfileFactoryImpl;

public class MMOCastingImpl extends MMOCasting {

    @Override
    public void onLoad() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        load();
    }

    @Override
    public void onDisable() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void load() {
        MythicLibHook.load();

        PROFILE_FACTORY = new ProfileFactoryImpl();
    }
}
