package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.character.background.Homeland;

public interface HomelandDAO {

    public Collection<Homeland> getHomelands();

}
