package com.wandrell.tabletop.pendragon.framework.service;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.pendragon.valuehandler.Skill;

public interface CharGenRulesService {

    public Boolean checkIfCanAddIndividualDifference(final Skill skill);

    public Boolean checkIfCanBecomeExcellentSkill(final Skill skill,
	    final Gender gender);

    public Boolean checkIfCanBecomeExtraSkill(final Skill skill,
	    final Gender gender);

}
