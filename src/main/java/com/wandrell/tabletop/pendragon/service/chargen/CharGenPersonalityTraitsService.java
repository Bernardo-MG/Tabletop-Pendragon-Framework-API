package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.dice.notation.DiceExpression;

public interface CharGenPersonalityTraitsService {

    public Integer getFamousTraitValue();

    public DiceExpression getFemaleValorousReduction();

    public Integer getIndividualDifferencesPoints();

    public Integer getRandomPoints();

    public DiceExpression getRandomRoll();

}
