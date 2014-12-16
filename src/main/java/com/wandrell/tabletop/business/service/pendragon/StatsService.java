package com.wandrell.tabletop.business.service.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.stats.DirectedTrait;
import com.wandrell.tabletop.business.model.pendragon.stats.Passion;
import com.wandrell.tabletop.business.model.pendragon.stats.Skill;

public interface StatsService {

    public Collection<Skill> getCombatSkills();

    public Collection<DirectedTrait> getDirectedTraits();

    public Collection<Passion> getPassions();

    public Collection<Passion> getRepeatablePassions();

    public Collection<Skill> getRepeatableSkills();

    public Collection<Skill> getSkills();

}
