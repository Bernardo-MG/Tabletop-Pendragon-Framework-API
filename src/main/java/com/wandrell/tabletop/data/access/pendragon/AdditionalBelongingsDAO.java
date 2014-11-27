package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.dice.RollTable;
import com.wandrell.tabletop.business.model.pendragon.inventory.AdditionalBelongings;

public interface AdditionalBelongingsDAO {

    public Collection<RollTable<AdditionalBelongings>>
            getAdditionalBelongings();

}
