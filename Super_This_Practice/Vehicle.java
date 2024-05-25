package com.company.Super_This_Practice;

public class Vehicle {
    protected  String brand;
    protected String model;
    public  Vehicle(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
}
class Car extends Vehicle{
    private final int seatingCapacity;
     public Car(String brand,String model,int seatingCapacity){
      super(brand,model);
      this.seatingCapacity=seatingCapacity;
     }
     public void showDetails(){
         System.out.println("\ncom.company.Super_This_Practice.Car Details: ");
         System.out.println("Brand Name: "+this.brand+
                 "\nModel Name: "+this.model+
                 "\nSeating Capacity: "+this.seatingCapacity);
     }

}
class Truck extends Vehicle{

    private  final int loadCapacity;

    public Truck(String brand ,String model,int loadingCapacity){
        super(brand,model);
        this.loadCapacity=loadingCapacity;
    }
    public void showDetails() {
        System.out.println("\ncom.company.Super_This_Practice.Truck Details: ");
        System.out.println("Brand Name: " + this.brand +
                "\nModel Name: " + this.model +
                "\nLoading Capacity: " + this.loadCapacity);
    }

    public static void main(String[] args) {
        Car car=new Car("Toyota","Corolla",5);
        Truck truck = new Truck("Ford","F-150",1000);

        car.showDetails();

        truck.showDetails();
    }
}

