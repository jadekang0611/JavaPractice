package dandyloper;

public class Car {

    // instance variables
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

    // constructor: just like assigning x, y, z inputs in function
    public Car (int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;

    }

    public void getIn() {
        numberOfPeopleInCar += 1;
    }

    public void getOut() {
        numberOfPeopleInCar -= 1;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println("This is the minSpeed " + minSpeed);
        System.out.println("This is the weight " + weight);
        System.out.println("This is the isTheCarOn " + isTheCarOn);
        System.out.println("This is the condition " + condition);
        System.out.println("This is the nameOfCar " + nameOfCar);
        System.out.println("NumberOfPeople In the Car: " + numberOfPeopleInCar);

    }

    public void wreckCar() {
        condition = 'C';
    }

}
