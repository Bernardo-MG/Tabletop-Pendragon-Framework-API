package com.wandrell.tabletop.pendragon.service.chargen;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.skill.SkillName;

public interface CharGenRulesetService {

    public Integer getAttributesPoints();

    public Collection<SkillName> getCommonPassions();

    public Dice getKnightStartingGlory();

    public Map<SkillName, Integer> getLandlordPassions();

}
