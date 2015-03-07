package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.dice.Dice;

public interface ChargenRandomRulesetService {

    public Dice getAttributeRoll(final String attribute, final Gender gender);

    public Dice getCommonPassionRoll();

    public Dice getHomelandPassionRoll();

    public Dice getLandlordPassionRoll(final String passion,
            final String descriptor);

}
