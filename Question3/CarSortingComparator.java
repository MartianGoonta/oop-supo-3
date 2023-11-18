package Question3;

import java.util.Comparator;

public class CarSortingComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2)
    {
        int compMan = car1.getManufacturer().compareTo(car2.getManufacturer());
        if (compMan != 0)
        {
            return compMan;
        }
        else
        {
            return car1.getAge() - car2.getAge();
        }
    }
    
}
