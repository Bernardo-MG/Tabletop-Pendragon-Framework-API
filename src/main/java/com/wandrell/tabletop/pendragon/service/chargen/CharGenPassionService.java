package com.wandrell.tabletop.pendragon.service.chargen;

import java.util.Collection;

import com.wandrell.tabletop.dice.notation.DiceFormula;
import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface CharGenPassionService {

    public DiceFormula getCommonPassionValue();

    public DiceFormula getHomelandValue();

    public Integer getIndividualDifferencesPoints();

    public DiceFormula getLandlordPassionRoll(final String passion,
            final String descriptor);

    public Collection<SkillBox> getLandlordPassions();

}
