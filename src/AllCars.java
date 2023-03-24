import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AllCars {

    public List<Car> uniqueCars(List<Car> allCars) {
        Set<String> uniques = allCars.stream().map(v -> v.make).collect(Collectors.toSet());

        List<Car> result = new ArrayList<>();

        for (String carName : uniques) {
            Car uniqueCar = findUniqueElement(carName, allCars);
            if (isCarElement(uniqueCar)) {
                result.add(new Car(uniqueCar));
            }
        }

        return result;
    }

    private Car findUniqueElement(String carName, List<Car> allCars) {
        return findUniqueElement(allCars.stream().filter(v -> v.make.equals(carName)).toList());
    }

    private static Car findUniqueElement(List<Car> elements) {
        if (elements.size() == 1) {
            return elements.get(0);
        }
        return null;
    }

    private Boolean isCarElement(Car car) {
        return car != null;
    }

}
