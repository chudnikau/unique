import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford", "Mustang", 1998));
        cars.add(new Car("Audi", "A4", 2000));
        cars.add(new Car("Ford", "Transit", 2022));
        cars.add(new Car("Reno", "Transit", 2018));

        AllCars allCars = new AllCars();

        List<Car> uniqueCars = allCars.uniqueCars(cars);

        uniqueCars.forEach(v -> System.out.println(v.make));
    }
}


