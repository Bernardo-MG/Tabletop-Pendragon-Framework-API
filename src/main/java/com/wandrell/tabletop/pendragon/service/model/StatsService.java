package com.wandrell.tabletop.pendragon.service.model;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.model.character.stats.PendragonSkillBox;
import com.wandrell.tabletop.valuebox.SkillBox;

public interface StatsService {

    public Collection<SkillBox> getDirectedTraits();

    public Collection<SkillBox> getPassions();

    public Collection<PendragonSkillBox> getSkills();

}
