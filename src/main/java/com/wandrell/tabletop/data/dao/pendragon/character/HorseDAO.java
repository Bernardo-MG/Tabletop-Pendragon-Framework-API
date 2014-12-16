package com.wandrell.tabletop.data.dao.pendragon.character;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.character.HorseCharacter;

public interface HorseDAO {

    public Collection<HorseCharacter> getHorses();

    public void saveHorseCharacter(final HorseCharacter character);

}
