package cn.encmys.ykdz.forest.mmocasting.profile;

import cn.encmys.ykdz.forest.mmocasting.profile.enums.CastingMode;

public class ProfileImpl implements Profile {
    private CastingMode castingMode = CastingMode.NONE;

    @Override
    public CastingMode getCastingMode() {
        return castingMode;
    }

    @Override
    public void setCastingMode(CastingMode castingMode) {
        this.castingMode = castingMode;
    }
}
