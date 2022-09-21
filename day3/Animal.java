package day3;

public class Animal {
    //declare variables
    public String name;
    public int weight;
    public int legs;
    public String size;

    //create constructor
    public Animal() {
        System.out.println("This is a Animal Constructor");
    }

    public static void main(String[] args) {
        //create object
        Animal an = new Animal();
        //create object for class dog
        Dog dog = new Dog();
        //create object for class husky
        Husky hus = new Husky();
        //create object for class cat
        Cat ca = new Cat();

        //call cat class methds
        ca.setCatName("Mimi");
        ca.setColor("white");
        ca.animalSize("Small");
        ca.animalWeight(2,"kg");
        ca.setCatPrice(6000);
        ca.move();

       /* //call husky class methods
        hus.nameOfDog("bachhan");
        hus.dogSpec("bacchan is well traind");
        hus.dogFood("chiken");
        hus.doglocation("cool place");
        hus.dogHeight(4);



        //call dog class methods
        dog.nameOfDog("bachhan");
        dog.breedName("husky");
        dog.costOfDog(50000);
        dog.animalSize("Medium");
        dog.animalWeight(45);
        dog.move();


        //call animal methods
        an.nameOfAnimal("Dog");
        an.animalSize("big");
        an.animalWeight(40);
        an.animalLegs(4);
        an.move(); */

    }

    public void move() {
        System.out.println("the animal is walking");
    }

    public void nameOfAnimal(String animal) {
        name = animal;
        System.out.println("animal name is " +name);
    }

    public void animalSize(String aSize) {
        size = aSize;
        System.out.println("the Animal size is " +size);
    }

    public void animalWeight(int aWeight) {
        weight = aWeight;
        System.out.println("Animal weight is " +weight);
    }

    public void animalLegs(int alegs) {
        legs = alegs;
        System.out.println("animal having numaber of legs " +legs);
    }


}
