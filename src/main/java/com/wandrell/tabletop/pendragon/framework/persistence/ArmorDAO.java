package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.inventory.ArmorEquipment;

public interface ArmorDAO {

    public Collection<ArmorEquipment> getArmors();

}
