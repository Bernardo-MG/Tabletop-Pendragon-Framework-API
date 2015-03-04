package com.wandrell.tabletop.pendragon.service.chargen;

import com.wandrell.tabletop.pendragon.model.stats.Skill;

public interface IndividualDifferencesRulesetService {

    public Integer getExcellentSkillValue();

    public Integer getExtraSkillMaxPicks();

    public Integer getExtraSkillValue();

    public Integer getNoCombatSkillsPoints();

    public Integer getSkillRaiseValue();

    public Boolean isAbleToBecomeExcellentSkill(final Skill skill);

    public Boolean isAbleToBecomeExtraSkill(final Skill skill);

    public Boolean isAbleToGetSkillRaise(final Skill skill);

}
