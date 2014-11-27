package com.wandrell.tabletop.data.access.pendragon;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.manor.ManorAnimal;

public interface ManorAnimalDAO {

    public Collection<ManorAnimal> getManorAnimals();

}
