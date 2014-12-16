package com.wandrell.tabletop.data.dao.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.inventory.Equipment;

public interface EquipmentDAO {

    public Collection<Equipment> getEquipment();

    public void saveEquipment(final Equipment equipment);

}
