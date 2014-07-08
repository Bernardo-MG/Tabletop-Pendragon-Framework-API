package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.dice.RollTable;
import com.wandrell.tabletop.pendragon.inventory.AdditionalBelongings;

public interface AdditionalBelongingsDAO {

    public Collection<RollTable<AdditionalBelongings>> getAdditionalBelongings();

}
