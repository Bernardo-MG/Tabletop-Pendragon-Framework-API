package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.dice.notation.DiceFormula;

public interface CharGenPersonalityTraitsService {

    public Integer getFamousTraitValue();

    public DiceFormula getFemaleValorousReduction();

    public Integer getIndividualDifferencesPoints();

    public Integer getRandomPoints();

    public DiceFormula getRandomRoll();

}
