package com.wandrell.tabletop.business.service.pendragon;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.business.model.dice.Dice;
import com.wandrell.tabletop.business.model.interval.Interval;
import com.wandrell.tabletop.business.model.pendragon.chargen.FamilyCharacteristicTable;
import com.wandrell.tabletop.business.model.pendragon.chargen.FamilyCharacteristicTemplate;
import com.wandrell.tabletop.business.model.pendragon.chargen.FatherClassTemplate;
import com.wandrell.tabletop.business.model.pendragon.chargen.HomelandTemplate;
import com.wandrell.tabletop.business.model.pendragon.chargen.ReligionTemplate;
import com.wandrell.tabletop.business.model.pendragon.glory.FatherClassGlory;
import com.wandrell.tabletop.business.model.pendragon.stats.DirectedTrait;
import com.wandrell.tabletop.business.model.pendragon.stats.Passion;
import com.wandrell.tabletop.business.model.pendragon.stats.Skill;
import com.wandrell.tabletop.business.model.pendragon.stats.SpecialtySkill;
import com.wandrell.tabletop.business.model.pendragon.util.TextList;
import com.wandrell.tabletop.business.model.skill.NameAndDescriptor;

public interface ModelService {

    public DirectedTrait getDirectedTrait(final String name);

    public FamilyCharacteristicTable getFamilyCharacteristicTable(
            final String name,
            final Map<Interval, FamilyCharacteristicTemplate> intervals);

    public FamilyCharacteristicTemplate getFamilyCharacteristicTemplate(
            final String name, final Map<String, Integer> attributes,
            final Map<NameAndDescriptor, Integer> skills);

    public FatherClassGlory getFatherClassGlory(final String name,
            final Integer glory, final Integer yearlyGlory);

    public FatherClassTemplate getFatherClassTemplate(final String name,
            final Integer skillsGroupPoints,
            final Integer skillsGroupPointsDivide, final Integer skillsPoints,
            final Integer skillsNonCombatPoints, final Dice money,
            final Collection<NameAndDescriptor> skillsGroup,
            final Map<String, Integer> specialtySkills,
            final Map<NameAndDescriptor, Integer> directedTraits,
            final Map<NameAndDescriptor, Integer> directedTraitsBase);

    public HomelandTemplate getHomelandTemplate(final String name,
            final Map<NameAndDescriptor, Integer> skills,
            final Map<String, Integer> specialtySkills,
            final Map<String, Integer> traits,
            final Collection<NameAndDescriptor> directedTraits,
            final Collection<NameAndDescriptor> passions);

    public Passion getPassion(final String name, final String descriptor,
            final Boolean repeatable);

    public ReligionTemplate getReligionTemplate(final String name,
            final Collection<String> traits,
            final Map<String, Integer> bonusDerived, final Integer bonusArmor,
            final Integer bonusDamage, final Integer bonusDamageDice);

    public Skill getSkill(final String name, final String descriptor,
            final Boolean combat, final Boolean court, final Boolean knight,
            final Boolean knowledge, final Boolean repeat);

    public SpecialtySkill getSpecialtySkill(final String name,
            final Collection<String> skills);

    public TextList getTextList(final String name,
            final Collection<String> values);

}
