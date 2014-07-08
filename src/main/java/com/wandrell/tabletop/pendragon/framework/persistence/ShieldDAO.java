package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.inventory.ShieldEquipment;

public interface ShieldDAO {

    public Collection<ShieldEquipment> getShields();

}
