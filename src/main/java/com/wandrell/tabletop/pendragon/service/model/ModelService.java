package com.wandrell.tabletop.pendragon.service.model;

import java.util.Collection;
import java.util.Map;

import com.wandrell.tabletop.dice.Dice;
import com.wandrell.tabletop.interval.Interval;
import com.wandrell.tabletop.interval.IntervalTable;
import com.wandrell.tabletop.pendragon.model.character.Horse;
import com.wandrell.tabletop.pendragon.model.chargen.AdditionalBelongings;
import com.wandrell.tabletop.pendragon.model.chargen.AdditionalBelongingsTable;
import com.wandrell.tabletop.pendragon.model.chargen.CultureCharacterTemplate;
import com.wandrell.tabletop.pendragon.model.chargen.CultureTemplate;
import com.wandrell.tabletop.pendragon.model.chargen.FamilyCharacteristicTable;
import com.wandrell.tabletop.pendragon.model.chargen.FamilyCharacteristicTemplate;
import com.wandrell.tabletop.pendragon.model.chargen.FatherClassTemplate;
import com.wandrell.tabletop.pendragon.model.chargen.HomelandTemplate;
import com.wandrell.tabletop.pendragon.model.chargen.ReligionTemplate;
import com.wandrell.tabletop.pendragon.model.glory.FatherClassGlory;
import com.wandrell.tabletop.pendragon.model.inventory.Armor;
import com.wandrell.tabletop.pendragon.model.inventory.ArmorType;
import com.wandrell.tabletop.pendragon.model.inventory.Item;
import com.wandrell.tabletop.pendragon.model.inventory.Money;
import com.wandrell.tabletop.pendragon.model.inventory.Shield;
import com.wandrell.tabletop.pendragon.model.inventory.Weapon;
import com.wandrell.tabletop.pendragon.model.manor.AnimalYearResult;
import com.wandrell.tabletop.pendragon.model.manor.Pet;
import com.wandrell.tabletop.pendragon.model.stats.Skill;
import com.wandrell.tabletop.pendragon.model.stats.SpecialtySkill;
import com.wandrell.tabletop.pendragon.model.util.TextList;
import com.wandrell.tabletop.skill.NameAndDescriptor;

public interface ModelService {

    public AdditionalBelongings getAdditionaBelongings(final Boolean choose,
            final String moneyName, final Money money,
            final String rerollTable, final Collection<Dice> rerolls,
            final Collection<Horse> horses, final Collection<Item> items,
            final Collection<Pet> pets, final Collection<Shield> shields,
            final Collection<Weapon> weapons);

    public AdditionalBelongingsTable getAdditionalBelongingsTable(
            final String name,
            final Map<Interval, AdditionalBelongings> intervalsMap);

    public AnimalYearResult getAnimalYearResult(final String description,
            final String puppy, final Boolean dies, final Money money);

    public Armor getArmor(final String name, final String description,
            final Money money, final ArmorType type, final Integer armorValue,
            final Integer dexModifier, final Boolean heavyLoad);

    public CultureCharacterTemplate getCultureCharacterTemplate(
            final Map<String, Integer> attributesBonus,
            final Map<String, Dice> attributesRandom,
            final Map<NameAndDescriptor, Integer> skillsBonus,
            final Map<String, Integer> specialtySkills,
            final Map<NameAndDescriptor, Integer> passionsBonus,
            final Map<NameAndDescriptor, Dice> passionsRandom,
            final Map<NameAndDescriptor, Integer> directedBonus,
            final Map<String, Integer> traitsBonus);

    public CultureTemplate getCultureTemplate(final String name,
            final FamilyCharacteristicTemplate charMale,
            final FamilyCharacteristicTemplate charFemale,
            final AdditionalBelongingsTable belonginsMale,
            final AdditionalBelongingsTable belonginsFemale,
            final CultureCharacterTemplate templateMale,
            final CultureCharacterTemplate templateFemale);

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

    public Horse getHorse(final String type, final Integer constitution,
            final Integer dexterity, final Integer size,
            final Integer strength, final Integer damage,
            final Integer movement, final Integer armor, final Boolean armored,
            final Boolean combat, final Boolean hunting);

    public Item getItem(final String name, final String description);

    public Money getMoney(final Integer denarii, final Integer libra);

    public Pet getPet(final String name,
            final IntervalTable<AnimalYearResult> yearResults);

    public ReligionTemplate getReligionTemplate(final String name,
            final Collection<String> traits,
            final Map<String, Integer> bonusDerived, final Integer bonusArmor,
            final Integer bonusDamage, final Integer bonusDamageDice);

    public Shield getShield(final String name, final String description,
            final Integer armorValue);

    public Skill getSkill(final String name, final String descriptor,
            final Boolean combat, final Boolean court, final Boolean knight,
            final Boolean knowledge);

    public SpecialtySkill getSpecialtySkill(final String name,
            final Collection<String> skills);

    public TextList getTextList(final String name,
            final Collection<String> values);

    public Weapon getWeapon(final String name, final String description,
            final String skill, final Boolean twoHanded,
            final Integer damageBonus, final Integer diceBonus,
            final Integer damageOverride, final Integer maxRange,
            final Integer reload, final Map<ArmorType, Integer> armorBonus,
            final Boolean breaksEnemyOnDraw, final Boolean breaksOnFumble,
            final Boolean hitsBack, final Boolean ignoresShield,
            final Boolean reducesShieldToRoll);

}
