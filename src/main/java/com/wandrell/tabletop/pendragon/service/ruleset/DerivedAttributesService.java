package com.wandrell.tabletop.pendragon.service.ruleset;

import com.wandrell.tabletop.pendragon.model.character.PendragonBaseCharacter;
import com.wandrell.tabletop.pendragon.model.character.PendragonHumanCharacter;

public interface DerivedAttributesService {

    public Integer getDamage(final PendragonBaseCharacter character);

    public Integer getDistinctiveFeatures(
            final PendragonHumanCharacter character);

    public Integer getHealingRate(final PendragonBaseCharacter character);

    public Integer getHitPoints(final PendragonBaseCharacter character);

    public Integer getKnockdown(final PendragonBaseCharacter character);

    public Integer getMajorWound(final PendragonBaseCharacter character);

    public Integer getMoveRate(final PendragonBaseCharacter character);

    public Integer getUnconcious(final PendragonBaseCharacter character);

    public Integer getWeight(final PendragonBaseCharacter character);

}
