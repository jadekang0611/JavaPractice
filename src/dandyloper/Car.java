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

    // Getters and Setters
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }


    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
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
