package VirtualPet;


import VirtualPet.enums.Interactions;
import VirtualPet.enums.MenuOptions;
import VirtualPet.enums.PetOptions;

public class GameLoop {
    private Pets pets = new Pets();
    private TextInterface userInterface = new TextInterface();
    private Pet currentPet;



    public void mainMenu()
    {
        MenuOptions menuChoice = userInterface.mainMenu();
        switch (menuChoice)
        {
            case EXISTING_PET:
            {
                selectPet();
                
            }
            case NEW_PET:
            {
                addNewPet();
            }
            case INVALID_INPUT:
            {
                System.out.println("invalid input");
                mainMenu();
            }
            case EXIT:
            {

            }

        }
        
    }

    public void selectPet(){
        currentPet = pets.searchPet(userInterface.selectPet());
        interactWithPet();
    }

    public void addNewPet()
    {
        PetOptions petType = userInterface.newPetType();
        switch (petType)
        {
            case CAT:
            {
                Cat cat = new Cat(userInterface.newPetName());
                pets.newPet(cat);
                currentPet = cat;
                interactWithPet();
            }
            case INVALID_INPUT:
            {
                System.out.println("invalid input");
                addNewPet();
            }
        }
    }

    public void interactWithPet()
    {
        Interactions interaction = userInterface.interactWithPet();
        switch (interaction)
        {
            case EXIT:
            {
                mainMenu();
            }
            case FEED:
            {
                currentPet.feed();
                interactWithPet();
            }
            case PLAY:
            {
                currentPet.play();
                interactWithPet();
            }
            case SLEEP:
            {
                currentPet.sleep();
                interactWithPet();
            }
            case INVALID_INPUT:
            {
                System.out.println("invalid input");
                interactWithPet();
            }
        }
    }
}
