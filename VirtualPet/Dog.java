package VirtualPet;

public class Dog extends Pet{
    public Dog(String name)
    {
        super(name, 100, 10, 100, 10);
    }

    public void feed()
    {
        if (getHunger() < maxHunger)
        {
            System.out.println(getName() + " ate some dog food");
                setHunger(getHunger() + 100);
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
            System.out.println(getName() + " fetches a stick");
            setHunger(getHunger() - 20);
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
