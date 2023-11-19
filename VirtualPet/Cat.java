package VirtualPet;

public class Cat extends Pet {
    
    public Cat(String name)
    {
        super(name, 50, 10, 50, 20);
    }

    public void feed()
    {
        if (getHunger() < maxHunger)
        {
            System.out.println(getName() + " ate some cat food");
                setHunger(getHunger() + 20);
        }
        else 
        {
            System.out.println(getName() + " isn't hungry");
        }
    }
    public void play()
    {
        if (getEnergy() < minEnergy)
        {
            System.out.println(getName() + " is too tired");
        }
        else if (getHunger() < minHunger)
        {
            System.out.println(getName() + " is too hungry");
        }
        else
        {
            System.out.println(getName() + "plays with a laser pointer");
            setHunger(getHunger() - 5);
            setEnergy(getEnergy() - 10);
        }
    }
    public void sleep()
    {
        if (getEnergy() < minEnergy)
        {
            System.out.println(getName() + " goes to sleep");
            setEnergy(maxEnergy);
        }
        else{
            System.out.println(getName() + " isn't tired");
        }
    }
}
