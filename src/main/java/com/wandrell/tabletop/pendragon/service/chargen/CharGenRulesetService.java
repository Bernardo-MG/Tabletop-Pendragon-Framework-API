package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.pendragon.model.stats.Skill;

public interface CharGenRulesetService {

    public Boolean canAddIndividualDifferenceSkill(final Skill skill,
            final Gender gender);

    public Boolean canBecomeExcellentSkill(final Skill skill,
            final Gender gender);

    public Boolean canBecomeExtraSkill(final Skill skill, final Gender gender);

}
