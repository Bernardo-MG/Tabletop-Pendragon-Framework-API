package com.wandrell.tabletop.pendragon.service.chargen;

import java.util.Collection;

import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface CharGenRulesetService {

    public Integer getAttributesPoints();

    public Dice getKnightStartingGlory();

    public Collection<SkillBox> getLandlordPassions();

}
