package com.company;

public class Main {

    public static void main(String[] args) {

            Person firstPerson = new Person();
            firstPerson.setFirstName("Dirty");
            firstPerson.setLastName("Harry");
            firstPerson.setAge(22);
            System.out.println(firstPerson.isTeen());
            System.out.println(firstPerson.getFullName());

            Person secondPerson = new Person();
            secondPerson.setFirstName("Beyonce");
            secondPerson.setLastName("");
            secondPerson.setAge(34);
            System.out.println(secondPerson.getFullName());

            Person thirdPerson = new Person();
            thirdPerson.setFirstName("");
            thirdPerson.setLastName("Dailey");
            thirdPerson.setAge(29);
            System.out.println(thirdPerson.getFullName());

            Person fourthPerson = new Person();
            fourthPerson.setFirstName("");
            fourthPerson.setLastName("");
            fourthPerson.setAge(1000);
            System.out.println(fourthPerson.getAge());
    }
}
