package com.company.Super_This_Practice;

public class Person {
    protected String name;
    protected  int age;

    //Constructor
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Employee employee= new Employee("Ashum",23,"01");
        employee.showDetails();
    }
}

class Employee extends Person{
private  String employeeId;
 public  Employee(String name,int age,String employeeId){
     super(name,age);
     this.employeeId=employeeId;
 }
 public void showDetails(){
     System.out.println("\nName: "+this.name+
                        "\nAge: "+this.age+
                        "\nEmployeeId: "+this.employeeId);
 }


}
