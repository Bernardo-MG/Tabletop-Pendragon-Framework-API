package com.wandrell.tabletop.pendragon.framework.service;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.valuehandler.DirectedTrait;
import com.wandrell.tabletop.pendragon.valuehandler.Passion;
import com.wandrell.tabletop.pendragon.valuehandler.Skill;

public interface PendragonModelService {

    public Collection<String> getAttributeNames();

    public Collection<Skill> getCombatSkills();

    public Collection<Skill> getCommonNonCombatSkills();

    public Collection<DirectedTrait> getDirectedTraits();

    public Collection<Passion> getInitialPassions();

    public Collection<Skill> getRepeatableNonCombatSkills();

    public Collection<Passion> getRepeatablePassions();

    public Collection<String> getTraitNames();

}
