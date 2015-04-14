package com.wandrell.tabletop.pendragon.procedure.stats;

import com.wandrell.tabletop.pendragon.model.character.PendragonCharacter;
import com.wandrell.tabletop.pendragon.model.character.background.Religion;

public interface ReligiousTraitsEvaluator {

    public Boolean isFulfilling(final PendragonCharacter character,
            final Religion religion);

}
