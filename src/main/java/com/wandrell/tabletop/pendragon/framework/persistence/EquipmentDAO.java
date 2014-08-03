package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.inventory.Equipment;

public interface EquipmentDAO {

    public Collection<Equipment> getEquipment();

}
