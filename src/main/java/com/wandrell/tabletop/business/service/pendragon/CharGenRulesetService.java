package com.wandrell.tabletop.business.service.pendragon;

import com.wandrell.tabletop.business.model.character.Gender;

public interface CharGenRulesetService {

    public Boolean canAddIndividualDifference(final String skill,
            final String descriptor);

    public Boolean canBecomeExcellentSkill(final String skill,
            final String descriptor, final Gender gender);

    public Boolean canBecomeExtraSkill(final String skill,
            final String descriptor, final Gender gender);

}
