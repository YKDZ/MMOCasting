package cn.encmys.ykdz.forest.mmocasting.profile.factory;

import cn.encmys.ykdz.forest.mmocasting.profile.Profile;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProfileFactoryImpl implements ProfileFactory {
    private final Map<UUID, Profile> profiles = new HashMap<>();

    public Map<UUID, Profile> getProfiles() {
        return profiles;
    }
}
