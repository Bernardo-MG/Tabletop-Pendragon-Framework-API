package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.dice.notation.DiceExpression;

public interface CharGenAttributesService {

    public DiceExpression getAppearanceRoll();

    public Integer getAttributesPoints();

    public DiceExpression getConstitutionRoll();

    public DiceExpression getDexterityRoll();

    public DiceExpression getSizeRoll();

    public DiceExpression getStrengthRoll();

}
