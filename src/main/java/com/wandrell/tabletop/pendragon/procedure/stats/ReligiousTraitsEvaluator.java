package com.wandrell.tabletop.pendragon.procedure.stats;

import com.wandrell.tabletop.pendragon.model.character.PendragonHumanCharacter;
import com.wandrell.tabletop.pendragon.model.character.background.Religion;

public interface ReligiousTraitsEvaluator {

    public Boolean isFulfilling(final PendragonHumanCharacter character,
            final Religion religion);

}
