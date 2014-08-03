package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.inventory.Weapon;

public interface WeaponDAO {

    public Collection<Weapon> getWeapons();

}
