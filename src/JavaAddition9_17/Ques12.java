/*
    Demonstrate the use of Sealed Classes.
 */
package JavaAddition9_17;

abstract sealed class Vehicle permits Car,Bike{
    private String registrationNo;

    public String getRegistrationNo() {
        return registrationNo;
    }

    public Vehicle(String registrationNo) {
        this.registrationNo = registrationNo;
    }
}


final class Car extends Vehicle{

    private int noOfSeats;

    public Car(int seats, String registrationNumber) {
        super(registrationNumber);
        this.noOfSeats = seats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }
}

 final class Bike extends Vehicle{

    private int noOfSeats;

    public Bike(int seats, String registrationNumber) {
        super(registrationNumber);
        this.noOfSeats = seats;
    }

     public int getNoOfSeats() {
         return noOfSeats;
     }
 }

public class Ques12 {
    public static void main(String[] args) {
        Bike b = new Bike(2,"DL 4056");
        System.out.println(b.getRegistrationNo());

        Car c= new Car(4,"DL 2230");
        System.out.println(c.getNoOfSeats());
    }
}





