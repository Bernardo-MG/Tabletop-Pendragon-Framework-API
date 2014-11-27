package com.wandrell.tabletop.business.service.pendragon;

import com.wandrell.tabletop.business.model.character.Gender;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Skill;

public interface CharGenRulesService {

    public Boolean checkIfCanAddIndividualDifference(final Skill skill);

    public Boolean checkIfCanBecomeExcellentSkill(final Skill skill,
            final Gender gender);

    public Boolean checkIfCanBecomeExtraSkill(final Skill skill,
            final Gender gender);

}
