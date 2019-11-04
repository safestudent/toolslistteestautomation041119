package co.uk.safebear.dog.hostel;

import org.junit.Test;

public class HostelTest {

    @Test
    public void testHostel(){

        HomeDog fluffy = new HomeDog();
        HostelDog rover = new HostelDog();

        fluffy.setAge(4);
        rover.setAge(7);

        fluffy.bark();

        fluffy.setDogsWeight(55.6);

        rover.neuter();

        System.out.println("Fluffy's age is " + fluffy.getAge());
        System.out.println("Rover's age is " + rover.getAge());

        System.out.println("Fluffy's weight is " + fluffy.isObese());

        DogHostelAccounts.numberOfDogs = 1000;


    }

    @Test
    public void blah(){

        HostelDog fluffy = new HostelDog();
        HomeDog rover = new HomeDog();

        fluffy.setRoomAndBed(6,"double bed");

        System.out.println("Fluffy's bed is " + fluffy.getDogBedType());

    }
}
