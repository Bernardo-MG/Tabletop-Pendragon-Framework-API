package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.inventory.Equipment;

public interface EquipmentDAO {

    public Collection<Equipment> getEquipment();

}
