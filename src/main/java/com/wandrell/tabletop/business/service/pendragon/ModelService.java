package com.wandrell.tabletop.business.service.pendragon;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.business.model.pendragon.chargen.ReligionBonus;

public interface ModelService {

    public ReligionBonus getReligionBonus(final String name,
            final Collection<String> traits,
            final Map<String, Integer> bonusDerived, final Integer bonusArmor,
            final Integer bonusDamage, final Integer bonusDamageDice);

}
