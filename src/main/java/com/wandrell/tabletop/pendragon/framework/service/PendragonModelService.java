package com.wandrell.tabletop.pendragon.framework.service;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.valuehandler.PendragonDirectedTrait;
import com.wandrell.tabletop.pendragon.valuehandler.PendragonPassion;
import com.wandrell.tabletop.pendragon.valuehandler.PendragonSkill;

public interface PendragonModelService {

    public Collection<String> getAttributeNames();

    public Collection<PendragonSkill> getCombatSkills();

    public Collection<PendragonSkill> getCommonNonCombatSkills();

    public Collection<PendragonDirectedTrait> getDirectedTraits();

    public Collection<PendragonPassion> getInitialPassions();

    public Collection<PendragonSkill> getRepeatableNonCombatSkills();

    public Collection<PendragonPassion> getRepeatablePassions();

    public Collection<String> getTraitNames();

}
