package com.wandrell.tabletop.pendragon.framework.service;

import com.wandrell.tabletop.character.Gender;
import com.wandrell.tabletop.pendragon.valuehandler.PendragonSkill;

public interface CharGenRulesService {

    public Boolean checkIfCanAddIndividualDifference(final PendragonSkill skill);

    public Boolean checkIfCanBecomeExcellentSkill(final PendragonSkill skill,
	    final Gender gender);

    public Boolean checkIfCanBecomeExtraSkill(final PendragonSkill skill,
	    final Gender gender);

}
