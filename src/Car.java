class Car {
    String make;
    String mark;
    Integer year;

    Car(String make, String mark, Integer year) {
        this.make = make;
        this.mark = mark;
        this.year = year;
    }

    Car(Car car) {
        this.make = car.make;
        this.mark = car.mark;
        this.year = car.year;
    }
}
