package com.wandrell.tabletop.pendragon.service.chargen;

import java.util.Collection;

import com.wandrell.tabletop.dice.notation.DiceExpression;
import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface CharGenPassionService {

    public DiceExpression getCommonPassionValue();

    public DiceExpression getHomelandValue();

    public Integer getIndividualDifferencesPoints();

    public DiceExpression getLandlordPassionRoll(final String passion,
            final String descriptor);

    public Collection<SkillBox> getLandlordPassions();

}
