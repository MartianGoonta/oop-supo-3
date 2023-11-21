package VirtualPet;

import java.util.ArrayList;

public class Pets {
    ArrayList<Pet> pets;
    public Pets()
    {
        pets = new ArrayList<Pet>();
    }

    public void newPet(Pet pet)
    {
        pets.add(pet);
    }

    public Pet searchPet(String name)
    {
        for (Pet pet:pets)
        {
            if (pet.getName().equals(name))
            {
                return pet;
            }
        }
        return null;
    }
    
}
