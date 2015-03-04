package com.wandrell.tabletop.pendragon.service.model;

import java.util.Collection;

import com.wandrell.tabletop.skill.SkillName;

public interface StatsService {

    public Collection<SkillName> getDirectedTraits();

    public Collection<SkillName> getPassions();

    public Collection<SkillName> getSkills();

}
