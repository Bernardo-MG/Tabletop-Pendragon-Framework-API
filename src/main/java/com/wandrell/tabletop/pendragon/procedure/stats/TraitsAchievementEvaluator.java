package com.wandrell.tabletop.pendragon.procedure.stats;

import com.wandrell.tabletop.pendragon.model.character.PendragonHumanCharacter;

public interface TraitsAchievementEvaluator {

    public Boolean isFulfilling(final PendragonHumanCharacter character);

}
