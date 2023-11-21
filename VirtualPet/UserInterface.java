package VirtualPet;

import VirtualPet.enums.*;

public interface UserInterface {
    public MenuOptions mainMenu();
    public String newPetName();
    public PetOptions newPetType();
    public String selectPet();
    public Interactions interactWithPet();
}
