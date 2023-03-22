import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford", "Mustang", 1998));
        cars.add(new Car("Audi", "A4", 2000));
        cars.add(new Car("Ford", "Transit", 2022));
        cars.add(new Car("Reno", "Transit", 2018));

        List<Car> uniqueCars = uniqueCars(cars);

        uniqueCars.forEach(v -> System.out.println(v.make));

    }

    private static List<Car> uniqueCars(List<Car> allCars) {
        Set<String> uniqueCars = allCars.stream().map(v -> v.make).collect(Collectors.toSet());

        List<Car> result = new ArrayList<>();

        for (String carName : uniqueCars) {
            List<Car> carsByUniqueName = allCars.stream().filter(v -> v.make.equals(carName)).toList();
            if (carsByUniqueName.size() == 1) {
                Car carByName = carsByUniqueName.get(0);
                result.add(new Car(carByName.make, carByName.mark, carByName.year));
            }
        }

        return result;
    }
}


