package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.inventory.Armor;

public interface ArmorDAO {

    public Collection<Armor> getArmors();

}
