package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.FatherClassBonus;

public interface FatherClassBonusDAO {

    public Collection<FatherClassBonus> getFatherClasses();

    public void saveFatherClass(final FatherClassBonus fatherClass);

}
