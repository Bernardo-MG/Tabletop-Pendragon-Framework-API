package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.ReligionTemplate;

public interface ReligionBonusDAO {

    public Collection<ReligionTemplate> getReligion();

    public void saveReligion(final ReligionTemplate religion);

}
