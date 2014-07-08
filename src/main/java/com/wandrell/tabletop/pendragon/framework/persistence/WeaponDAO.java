package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.inventory.WeaponEquipment;

public interface WeaponDAO {

    public Collection<WeaponEquipment> getWeapons();

}
