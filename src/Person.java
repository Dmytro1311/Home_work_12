public class Person {
    String name;
    String sureName;
    String city;
    int phoneNumber;

    Person(String name, String sureName, String city, int phoneNumber ){
        this.name = name;
        this.sureName = sureName;
        this.city = city;
        this.phoneNumber = phoneNumber;

    }
             void personInfo(){
                 System.out.println("Зателефонувати громадянину" + " " + name + " " + sureName + " " + " " + "із міста" +" " + city + " " + "можна за номером" + " " + phoneNumber);

    }
}
