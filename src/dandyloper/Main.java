package dandyloper;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car familyCar = new Car();
        System.out.println("Family's Car");
        familyCar.printVariables();

        Car aliceCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Alice's Car");
        aliceCar.printVariables();
    }
}
