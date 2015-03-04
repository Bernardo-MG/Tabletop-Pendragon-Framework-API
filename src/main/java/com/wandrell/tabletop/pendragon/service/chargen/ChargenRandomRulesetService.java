package com.wandrell.tabletop.pendragon.service.chargen;

import java.util.Map;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.skill.SkillName;

public interface ChargenRandomRulesetService {

    public Dice getAttributeRoll(final String attribute, final Gender gender);

    public Dice getCommonPassionRoll();

    public Dice getHomelandPassionRoll();

    public Map<SkillName, Dice> getLandlordPassions();

}
