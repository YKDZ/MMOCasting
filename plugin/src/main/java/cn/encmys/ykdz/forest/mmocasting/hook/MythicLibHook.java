package cn.encmys.ykdz.forest.mmocasting.hook;

import cn.encmys.ykdz.forest.mmocasting.stat.KeyCombo;
import net.Indyuce.mmoitems.MMOItems;

public class MythicLibHook {
    public static void load() {
        MMOItems.plugin.getStats().register(new KeyCombo());
    }
}
