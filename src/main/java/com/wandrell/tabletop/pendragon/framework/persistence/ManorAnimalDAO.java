package com.wandrell.tabletop.pendragon.framework.persistence;

import java.util.Collection;

import com.wandrell.tabletop.pendragon.manor.ManorAnimal;

public interface ManorAnimalDAO {

    public Collection<ManorAnimal> getManorAnimals();

}
