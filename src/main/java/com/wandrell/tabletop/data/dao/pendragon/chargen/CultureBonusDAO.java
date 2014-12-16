package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.CultureBonus;

public interface CultureBonusDAO {

    public Collection<CultureBonus> getCultures();

    public void saveCulture(final CultureBonus culture);

}
