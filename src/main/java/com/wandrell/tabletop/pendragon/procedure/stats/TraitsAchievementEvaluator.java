package com.wandrell.tabletop.pendragon.procedure.stats;

import com.wandrell.tabletop.pendragon.model.character.PendragonCharacter;

public interface TraitsAchievementEvaluator {

    public Boolean isFulfilling(final PendragonCharacter character);

}
