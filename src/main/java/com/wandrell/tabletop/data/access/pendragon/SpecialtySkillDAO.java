package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.valuehandler.SpecialtySkill;

public interface SpecialtySkillDAO {

    public Collection<SpecialtySkill> getSpecialtySkills();

}
