package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.character.HorseCharacter;

public interface HorseDAO {

    public Collection<HorseCharacter> getHorses();

}
