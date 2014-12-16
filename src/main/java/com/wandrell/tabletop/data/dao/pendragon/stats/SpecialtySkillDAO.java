package com.wandrell.tabletop.data.dao.pendragon.stats;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.stats.SpecialtySkill;

public interface SpecialtySkillDAO {

    public Collection<SpecialtySkill> getSpecialtySkills();

    public void saveSpecialtySkill(final SpecialtySkill skill);

}
