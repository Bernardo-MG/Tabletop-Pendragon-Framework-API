package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.inventory.ArmorData;

public interface ArmorDAO {

    public Collection<ArmorData> getArmors();

}
