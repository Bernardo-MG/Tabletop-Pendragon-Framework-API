package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.ReligionBonus;

public interface ReligionBonusDAO {

    public Collection<ReligionBonus> getReligion();

    public void saveReligion(final ReligionBonus religion);

}
