package com.wandrell.tabletop.pendragon.service;

import com.wandrell.tabletop.character.Gender;

public interface CharGenRulesetService {

    public Boolean canAddIndividualDifference(final String skill,
            final String descriptor);

    public Boolean canBecomeExcellentSkill(final String skill,
            final String descriptor, final Gender gender);

    public Boolean canBecomeExtraSkill(final String skill,
            final String descriptor, final Gender gender);

}
