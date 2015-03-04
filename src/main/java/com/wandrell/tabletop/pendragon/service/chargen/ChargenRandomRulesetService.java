package com.wandrell.tabletop.pendragon.service.chargen;

import java.util.Map;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.skill.NameAndDescriptor;

public interface ChargenRandomRulesetService {

    public Dice getAttributeRoll(final String attribute, final Gender gender);

    public Dice getCommonPassionRoll();

    public Dice getHomelandPassionRoll();

    public Map<NameAndDescriptor, Dice> getLandlordPassions();

}
