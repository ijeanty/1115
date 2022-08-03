package car;

import java.util.Scanner;

//This is the CarTest Class

public class CarCopy {

    // The main Method in the Test Class

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Receiving Users inputs

        System.out.print("Enter the car's year model: ");

        int yearModel = in.nextInt();

        System.out.print("Enter the car's make: ");

        String make = in.next();

        System.out.print("Enter the car's speed: ");

        int speed = in.nextInt();

        Car newCar = new Car(yearModel, make, speed);

        // Printing Cars Current Status

        System.out.println("Current status of the car:");

        System.out.println("Year Model: " + newCar.getYearModel());

        System.out.println("Make: " + newCar.getMake());

        System.out.println("Speed: " + newCar.getSpeed());

        // Calling the accelerate method

        for (int i = 1; i < 6; i++) {

            int newSpeed = newCar.getSpeed();

            newCar.setSpeed(newSpeed);

            newCar.accelerate();

            System.out.println("Accelerating...");

            System.out.println("Now the Speed is " + newCar.getSpeed());

        }

        // Calling the Breaking Method

        for (int i = 1; i < 6; i++) {

            int newSpeed = newCar.getSpeed();

            newCar.setSpeed(newSpeed);

            newCar.breaking();

            System.out.println("Breaking...");

            System.out.println("Now the Speed is " + newCar.getSpeed());

        }

    }

}

// The Car Class begins here

class Car {

    private int yearModel;

    private String make;

    private int speed;

    // Constructors

    public Car(int yearModel, String make, int speed) {

        this.speed = speed;

        this.make = make;

        this.yearModel = yearModel;

    }

    public Car() {

        this.yearModel = 0;

        this.speed = 0;

        this.make = "";

    }

    // Accessor Methods

    public int getYearModel() {

        return yearModel;

    }

    public String getMake() {

        return make;

    }

    public int getSpeed() {

        return speed;

    }

    // Mutators

    public void setYearModel(int yearModel) {

        this.yearModel = yearModel;

    }

    public void setMake(String make) {

        this.make = make;

    }

    public void setSpeed(int speed) {

        this.speed = speed;

    }

    // Method Accelerate

    public void accelerate() {

        this.speed = this.speed + 5;

    }

    // Method Break

    public int breaking() {

        return this.speed = this.speed - 5;

    }

}