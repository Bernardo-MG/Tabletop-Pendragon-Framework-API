package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.HomelandTemplate;

public interface HomelandBonusDAO {

    public Collection<HomelandTemplate> getHomelands();

    public void saveHomeland(final HomelandTemplate homeland);

}
