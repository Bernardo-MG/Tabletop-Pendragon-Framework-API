package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.valuehandler.PendragonSpecialtySkill;

public interface SpecialtySkillDAO {

    public Collection<PendragonSpecialtySkill> getSpecialtySkills();

}
