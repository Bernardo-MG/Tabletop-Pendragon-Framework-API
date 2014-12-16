package com.wandrell.tabletop.data.dao.pendragon.manor;

import java.util.Collection;

import com.wandrell.tabletop.business.model.pendragon.manor.Pet;

public interface PetDAO {

    public Collection<Pet> getPets();

    public void savePet(final Pet pet);

}
