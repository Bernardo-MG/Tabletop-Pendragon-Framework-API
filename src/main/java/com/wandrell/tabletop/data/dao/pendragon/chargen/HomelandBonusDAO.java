package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.HomelandBonus;

public interface HomelandBonusDAO {

    public Collection<HomelandBonus> getHomelands();

    public void saveHomeland(final HomelandBonus homeland);

}
