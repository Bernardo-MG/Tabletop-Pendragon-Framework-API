package com.wandrell.tabletop.data.service.pendragon.model;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.valuehandler.DirectedTrait;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Passion;
import com.wandrell.tabletop.business.model.pendragon.valuehandler.Skill;

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
