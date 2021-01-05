package dandyloper;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println("This is the minSpeed " + minSpeed);
        System.out.println("This is the weight " + weight);
        System.out.println("This is the isTheCarOn " + isTheCarOn);
        System.out.println("This is the condition " + condition);
        System.out.println("This is the nameOfCar " + nameOfCar);

    }

    public void wreckCar() {
        condition = 'C';
    }

}
