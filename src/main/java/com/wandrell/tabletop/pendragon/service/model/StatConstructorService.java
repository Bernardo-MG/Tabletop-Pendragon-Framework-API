package com.wandrell.tabletop.pendragon.service.model;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.stats.PendragonSkillBox;
import com.wandrell.tabletop.pendragon.model.character.stats.SpecialtySkillBox;
import com.wandrell.tabletop.stats.valuebox.SkillBox;

public interface StatConstructorService {

    public SkillBox getDirectedTrait(final String name,
            final String descriptor, final Integer value);

    public SkillBox getPassion(final String name, final String descriptor,
            final Integer value);

    public PendragonSkillBox getSkill(final String name,
            final String descriptor, final Integer value,
            final Boolean combatSkill, final Boolean knightlySkill,
            final Boolean knowledgeSkill, final Boolean courtlySkill);

    public SpecialtySkillBox getSpecialtySkill(final String name,
            final Integer value, final Collection<String> skills);

}
