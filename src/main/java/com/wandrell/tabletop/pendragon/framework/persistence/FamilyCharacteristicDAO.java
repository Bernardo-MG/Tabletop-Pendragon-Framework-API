package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.character.background.FamilyCharacteristic;

public interface FamilyCharacteristicDAO {

    public Collection<FamilyCharacteristic> getFamilyCharacteristics();

}
