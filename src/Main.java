import java.util.*;
public class Main {
    public static void main(String[] args){
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("Dodge", 1000);
        Car car2 = new Car("Lamborghini", 1000);
        Car car3 = new Car("Ferrari", 1000);

        Car[] cars = {car1, car2, car3};

        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carList);



    }
}
