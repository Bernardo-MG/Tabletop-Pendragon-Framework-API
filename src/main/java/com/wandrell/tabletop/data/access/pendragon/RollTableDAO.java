package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.dice.RollTable;

public interface RollTableDAO {

    public Collection<RollTable<String>> getRollTables();

}
