package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.character.background.culture.Culture;

public interface CultureDAO {

    public Collection<Culture> getCultures();

}
