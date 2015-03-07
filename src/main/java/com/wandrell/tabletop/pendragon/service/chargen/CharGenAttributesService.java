package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.dice.Dice;

public interface CharGenAttributesService {

    public Dice getAttributeRoll(final String attribute, final Gender gender);

    public Integer getAttributesPoints();

}
