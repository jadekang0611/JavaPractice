package dandyloper;

public class Main {

    public static void main(String[] args) {
	// write your code here

     Car birthdayPresent = new Car(250, 5000.5, true);
     System.out.println("Birthday Car v1");
     birthdayPresent.printVariables();
     birthdayPresent.getIn();
     birthdayPresent.getIn();
     birthdayPresent.getIn();
     System.out.println("Miles Left " + birthdayPresent.howManyMilesTillOutOfGas());
     System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
     System.out.println("Birthday Car v2");
     birthdayPresent.printVariables();
     birthdayPresent.getOut();
     System.out.println("Birthday Car v3");
     birthdayPresent.printVariables();
    };

}
