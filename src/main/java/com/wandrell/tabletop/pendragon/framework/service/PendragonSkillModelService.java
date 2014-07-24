package com.wandrell.tabletop.pendragon.framework.service;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.valuehandler.PendragonSkill;

public interface PendragonSkillModelService {

    public Collection<PendragonSkill> getCombatSkills();

    public Collection<PendragonSkill> getCommonNonCombatSkills();

    public Collection<PendragonSkill> getRepeatableNonCombatSkills();

}
