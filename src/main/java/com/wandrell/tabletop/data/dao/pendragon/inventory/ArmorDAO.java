package com.wandrell.tabletop.data.dao.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.inventory.Armor;

public interface ArmorDAO {

    public Collection<Armor> getArmors();

    public void saveArmor(final Armor armor);

}
