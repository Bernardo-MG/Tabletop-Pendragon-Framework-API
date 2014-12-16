package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.FamilyCharacteristicBonus;

public interface FamilyCharacteristicBonusDAO {

    public Collection<FamilyCharacteristicBonus> getFamilyCharacteristics();

    public void saveFamilyCharacteristic(
            final FamilyCharacteristicBonus characteristic);

}
