package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.FatherClassTemplate;

public interface FatherClassBonusDAO {

    public Collection<FatherClassTemplate> getFatherClasses();

    public void saveFatherClass(final FatherClassTemplate fatherClass);

}
