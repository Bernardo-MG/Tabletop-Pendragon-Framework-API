package com.wandrell.tabletop.data.dao.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.inventory.Shield;

public interface ShieldDAO {

    public Collection<Shield> getShields();

    public void saveShield(final Shield shield);

}
