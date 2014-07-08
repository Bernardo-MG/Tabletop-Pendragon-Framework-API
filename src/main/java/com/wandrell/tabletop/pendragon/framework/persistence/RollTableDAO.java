package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.dice.RollTable;

public interface RollTableDAO {

    public Collection<RollTable<String>> getRollTables();

}
