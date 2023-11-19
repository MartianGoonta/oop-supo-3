package VirtualPet;

public abstract class Pet implements Interactable {
    private String name;
    private int hunger;
    private int energy;
    protected final int maxHunger;
    protected final int minHunger;
    protected final int maxEnergy;
    protected final int minEnergy;



    public Pet(String name, int maxHunger, int minHunger, int maxEnergy, int minEnergy)
    {
        this.name = name;
        this.maxHunger = maxHunger;
        this.maxEnergy = maxEnergy;
        this.minHunger = minHunger;
        this.minEnergy = minEnergy;
        this.hunger = maxHunger;
        this.energy = maxEnergy;
    }



    public void setHunger(int foodPoints)
    {
        hunger = foodPoints;
    }

    public int getHunger()
    {
        return hunger;
    }

    public void setEnergy(int newEnergy)
    {
        energy = newEnergy;
    }
    
    public int getEnergy()
    {
        return energy;
    } 

    public String getName()
    {
        return name;
    }
}
