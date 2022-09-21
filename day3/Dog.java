package day3;

public class Dog extends Animal {
    //declare variables
    public String dogName;
    public String dogBreed;
    public int dogCost;

    //create constructor
    public Dog() {
        System.out.println("This is Dog Constructor");
    }

    public void nameOfDog(String dogName) {
        System.out.println("My Dog name is " +dogName);
    }

    public void breedName(String dogBreed) {
        System.out.println("The dog breed is " +dogBreed);
    }
    public void costOfDog(int dogCost) {
        System.out.println("The Cost of Dog is " +dogCost);
    }

    @Override
    public void animalSize(String aSize) {
        super.animalSize(aSize);
        System.out.println("the Dog size is " +aSize);
    }

    @Override
    public void animalWeight(int aWeight) {
       // super.animalWeight(aWeight);
        System.out.println("Dog weight is " +aWeight);
    }

    @Override
    public void move() {
        //super.move(); //super keyword is use to call both methods parent and child class
        System.out.println("The Dog is Running");
    }
}
