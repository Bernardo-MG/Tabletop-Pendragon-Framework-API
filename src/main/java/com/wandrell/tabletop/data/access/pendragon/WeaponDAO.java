package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.inventory.Weapon;

public interface WeaponDAO {

    public Collection<Weapon> getWeapons();

}
