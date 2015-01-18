package com.wandrell.tabletop.business.service.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.stats.Skill;
import com.wandrell.tabletop.business.model.valuebox.SkillBox;

public interface StatsService {

    public Collection<Skill> getCombatSkills();

    public Collection<SkillBox> getDirectedTraits();

    public Collection<SkillBox> getPassions();

    public Collection<SkillBox> getRepeatablePassions();

    public Collection<Skill> getRepeatableSkills();

    public Collection<Skill> getSkills();

}
