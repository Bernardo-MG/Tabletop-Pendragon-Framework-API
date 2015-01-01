package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.FamilyCharacteristicTemplate;

public interface FamilyCharacteristicBonusDAO {

    public Collection<FamilyCharacteristicTemplate> getFamilyCharacteristics();

    public void saveFamilyCharacteristic(
            final FamilyCharacteristicTemplate characteristic);

}
