package com.wandrell.tabletop.pendragon.service;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.stats.Skill;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface StatsService {

    public Collection<Skill> getCombatSkills();

    public Collection<SkillBox> getDirectedTraits();

    public Collection<SkillBox> getPassions();

    public Collection<SkillBox> getRepeatablePassions();

    public Collection<Skill> getRepeatableSkills();

    public Collection<Skill> getSkills();

}
