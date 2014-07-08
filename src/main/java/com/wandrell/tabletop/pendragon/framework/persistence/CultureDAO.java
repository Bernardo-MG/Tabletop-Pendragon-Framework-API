package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.character.background.culture.Culture;

public interface CultureDAO {

    public Collection<Culture> getCultures();

}
