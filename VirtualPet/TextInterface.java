package VirtualPet;

import java.util.Scanner;


import VirtualPet.enums.*;

public class TextInterface implements UserInterface{

    @Override
    public MenuOptions mainMenu() {
        Scanner is = new Scanner(System.in);
            System.out.println("Would you like to 1: create a new pet, 2: select an exisiting pet, or 3: Quit");
            int input = is.nextInt();
            switch (input)
            {
                case 1:
                {
                    return MenuOptions.NEW_PET;
                }
                case 2:
                {
                    return MenuOptions.EXISTING_PET;
                }
                case 3:
                {
                    return MenuOptions.EXIT;
                }
            }
            return MenuOptions.INVALID_INPUT;


    }

    @Override
    public String newPetName() {
        Scanner is = new Scanner(System.in);
        System.out.println("what would you like to name your pet");
        return is.nextLine();
    }

    @Override
    public PetOptions newPetType() {
        Scanner is = new Scanner(System.in);
        System.out.println("what type of pet would you like? 1: Cat 2: Dog");
        int selection = is.nextInt();
        switch (selection)
        {
            case 1:
            {
                return PetOptions.CAT;
            }
            case 2:
            {
                return PetOptions.DOG;
            }
        }
        return PetOptions.INVALID_INPUT;
    }

    @Override
    public String selectPet() {
        Scanner is = new Scanner(System.in);
        System.out.println("Input the name of the pet you want to interact with");
        return is.nextLine();
    }

    @Override
    public Interactions interactWithPet() {
        Scanner is = new Scanner(System.in);
        System.out.println("would you like to 1: play, 2: feed, 3: sleep or 4, go back");
        int selection = is.nextInt();
        switch (selection)
        {
            case 1:
            {
                return Interactions.PLAY;
            }
            case 2:
            {
                return Interactions.FEED;
            }
            case 3:
            {
                return Interactions.SLEEP;
            }
            case 4:
            {
                return Interactions.EXIT;
            }
        }
        return Interactions.INVALID_INPUT;
    }


}
