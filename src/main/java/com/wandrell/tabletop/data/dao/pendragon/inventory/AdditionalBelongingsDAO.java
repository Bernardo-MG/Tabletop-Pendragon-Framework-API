package com.wandrell.tabletop.data.dao.pendragon.inventory;

import java.util.Collection;

import com.wandrell.tabletop.business.model.interval.IntervalTable;
import com.wandrell.tabletop.business.model.pendragon.chargen.AdditionalBelongings;

public interface AdditionalBelongingsDAO {

    public Collection<IntervalTable<AdditionalBelongings>>
            getAdditionalBelongings();

}
