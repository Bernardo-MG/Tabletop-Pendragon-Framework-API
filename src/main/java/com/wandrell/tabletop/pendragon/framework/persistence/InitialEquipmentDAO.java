package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.inventory.AdditionalBelongings;

public interface InitialEquipmentDAO {

    public Collection<AdditionalBelongings> getInitialEquipment();

}
