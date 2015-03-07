package com.wandrell.tabletop.pendragon.service.chargen;

import java.util.Collection;

import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface CharGenPassionRulesetService {

    public Dice getCommonPassionRoll();

    public Dice getHomelandValue();

    public Integer getIndividualDifferencesPoints();

    public Dice getLandlordPassionRoll(final String passion,
            final String descriptor);

    public Collection<SkillBox> getLandlordPassions();

}
