package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.character.HorseCharacter;

public interface HorseDAO {

    public Collection<HorseCharacter> getHorses();

}
