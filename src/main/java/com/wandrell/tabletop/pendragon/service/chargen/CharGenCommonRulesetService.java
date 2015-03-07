package com.wandrell.tabletop.pendragon.service.chargen;

import java.util.Collection;

import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface CharGenCommonRulesetService {

    public Dice getDirectedTraitInitialValue();

    public Dice getFemaleValorousReduction();

    public Dice getHomelandPassionRoll();

    public Dice getKnightStartingGlory();

    public Collection<SkillBox> getLandlordPassions();

    public Integer getPassionMax();

    public Integer getPassionPoints();

    public Integer getReligiousTraitBonus();

    public Integer getTraitMax();

    public Integer getTraitPoints();

}
