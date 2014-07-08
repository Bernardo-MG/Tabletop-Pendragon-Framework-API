package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.inventory.PendragonEquipment;

public interface EquipmentDAO {

    public Collection<PendragonEquipment> getEquipment();

}
