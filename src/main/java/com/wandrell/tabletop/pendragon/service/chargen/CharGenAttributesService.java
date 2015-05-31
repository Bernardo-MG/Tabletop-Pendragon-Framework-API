package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.dice.notation.DiceFormula;

public interface CharGenAttributesService {

    public DiceFormula getAppearanceRoll();

    public Integer getAttributesPoints();

    public DiceFormula getConstitutionRoll();

    public DiceFormula getDexterityRoll();

    public DiceFormula getSizeRoll();

    public DiceFormula getStrengthRoll();

}
