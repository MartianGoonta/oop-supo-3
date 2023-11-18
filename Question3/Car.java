package Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {
    private String manufacturer;
    private int age;

    public Car(String manufacturer, int age)
    {
        this.manufacturer = manufacturer;
        this.age = age; 
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getAge()
    {
        return age;
    }

    public String toString(){
        return manufacturer + " " + age;
    }

    public static void main(String[] args)
    {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Volvo", 5));
        carList.add(new Car("Nissan", 2));
        carList.add(new Car("Vauxhall", 5));
        carList.add(new Car("Audi", 12));
        carList.add(new Car("Audi", 13));

 
        for (Car car : carList) {
            System.out.println(car);
        }

        Collections.sort(carList,new CarSortingComparator());

        for (Car car2: carList) {
            System.out.println(car2);
        }
    }
}
