package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.pendragon.model.stats.Skill;

public interface IndividualDifferencesRulesetService {

    public Boolean canBecomeExcellentSkill(final Skill skill);

    public Boolean canBecomeExtraSkill(final Skill skill);

    public Boolean canGetSkillRaise(final Skill skill);

    public Integer getExcellentSkillValue();

    public Integer getExtraSkillMaxPicks();

    public Integer getExtraSkillValue();

    public Integer getNoCombatSkillsPoints();

    public Integer getSkillRaiseValue();

}
