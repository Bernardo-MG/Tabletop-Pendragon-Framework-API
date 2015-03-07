package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.dice.Dice;

public interface CharGenAttributesService {

    public Dice getAppearanceRoll();

    public Integer getAttributesPoints();

    public Dice getConstitutionRoll();

    public Dice getDexterityRoll();

    public Dice getSizeRoll();

    public Dice getStrengthRoll();

}
