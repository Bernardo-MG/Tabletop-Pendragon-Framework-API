package com.wandrell.tabletop.pendragon.service.ruleset;

public interface DerivedAttributesService {

    public Integer getDamage(final Integer appearance,
            final Integer constitution, final Integer dexterity,
            final Integer size, final Integer strength);

    public Integer getDistinctiveFeatures(final Integer appearance,
            final Integer constitution, final Integer dexterity,
            final Integer size, final Integer strength);

    public Integer getHealingRate(final Integer appearance,
            final Integer constitution, final Integer dexterity,
            final Integer size, final Integer strength);

    public Integer getHitPoints(final Integer appearance,
            final Integer constitution, final Integer dexterity,
            final Integer size, final Integer strength);

    public Integer getKnockdown(final Integer appearance,
            final Integer constitution, final Integer dexterity,
            final Integer size, final Integer strength);

    public Integer getMajorWound(final Integer appearance,
            final Integer constitution, final Integer dexterity,
            final Integer size, final Integer strength);

    public Integer getMoveRate(final Integer appearance,
            final Integer constitution, final Integer dexterity,
            final Integer size, final Integer strength);

    public Integer getUnconcious(final Integer appearance,
            final Integer constitution, final Integer dexterity,
            final Integer size, final Integer strength);

    public Integer getWeight(final Integer appearance,
            final Integer constitution, final Integer dexterity,
            final Integer size, final Integer strength);

}
