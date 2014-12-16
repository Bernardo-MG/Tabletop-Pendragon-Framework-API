package com.wandrell.tabletop.data.dao.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.inventory.Weapon;

public interface WeaponDAO {

    public Collection<Weapon> getWeapons();

    public void saveWeapon(final Weapon weapon);

}
