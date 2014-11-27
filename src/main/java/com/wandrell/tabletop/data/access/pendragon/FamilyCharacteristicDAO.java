package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.character.background.FamilyCharacteristic;

public interface FamilyCharacteristicDAO {

    public Collection<FamilyCharacteristic> getFamilyCharacteristics();

}
