package com.wandrell.tabletop.pendragon.service.ruleset;

import com.wandrell.tabletop.pendragon.model.character.stats.AttributesHolder;
import com.wandrell.tabletop.pendragon.model.character.stats.DerivedAttributesHolder;

public interface DerivedAttributesService {

    public Integer getDamage(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public Integer getDexterityRoll(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public Integer getDistinctiveFeatures(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public Integer getHealingRate(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public Integer getHitPoints(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public Integer getKnockdown(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public Integer getMajorWound(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public Integer getMoveRate(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public Integer getUnconcious(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

    public Integer getWeight(final AttributesHolder attributes,
            final DerivedAttributesHolder derived);

}
