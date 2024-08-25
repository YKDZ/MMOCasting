package cn.encmys.ykdz.forest.mmocasting.profile;

import cn.encmys.ykdz.forest.mmocasting.profile.enums.CastingMode;

public interface Profile {
    CastingMode getCastingMode();

    void setCastingMode(CastingMode castingMode);
}
