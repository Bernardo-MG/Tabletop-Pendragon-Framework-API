package com.wandrell.tabletop.data.dao.pendragon.chargen;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.chargen.CultureTemplate;

public interface CultureBonusDAO {

    public Collection<CultureTemplate> getCultures();

    public void saveCulture(final CultureTemplate culture);

}
