package com.wandrell.tabletop.business.service.pendragon;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.business.model.interval.Interval;
import com.wandrell.tabletop.business.model.pendragon.chargen.FamilyCharacteristicTable;
import com.wandrell.tabletop.business.model.pendragon.chargen.FamilyCharacteristicTemplate;
import com.wandrell.tabletop.business.model.pendragon.chargen.HomelandTemplate;
import com.wandrell.tabletop.business.model.pendragon.chargen.ReligionTemplate;
import com.wandrell.tabletop.business.model.skill.NameAndDescriptor;

public interface ModelService {

    public FamilyCharacteristicTable getFamilyCharacteristicTable(
            final String name,
            final Map<Interval, FamilyCharacteristicTemplate> intervals);

    public FamilyCharacteristicTemplate getFamilyCharacteristicTemplate(
            final String name, final Map<String, Integer> attributes,
            final Map<NameAndDescriptor, Integer> skills);

    public HomelandTemplate getHomelandTemplate(final String name,
            final Map<NameAndDescriptor, Integer> skills,
            final Map<String, Integer> specialtySkills,
            final Map<String, Integer> traits,
            final Collection<NameAndDescriptor> directedTraits,
            final Collection<NameAndDescriptor> passions);

    public ReligionTemplate getReligionTemplate(final String name,
            final Collection<String> traits,
            final Map<String, Integer> bonusDerived, final Integer bonusArmor,
            final Integer bonusDamage, final Integer bonusDamageDice);

}
