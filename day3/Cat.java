package day3;

public class Cat extends Animal{
    String catName;
    int catPrice;
    String color;


    //create constructor
    public Cat(){
        System.out.println("This is Cat Constructor ");
    }

    //create methods
    public void setCatName(String name) {
        catName = name;
        System.out.println("My cat name is " +catName);
    }

    public void setColor(String catColor) {
        color = catColor;
        System.out.println("my cat color is " +color);
    }

    //overriding
    public void animalSize(String size) {
        System.out.println("the cat size is " +size);
    }

    //overloading
    public void animalWeight(int weight, String unit) {
        System.out.println("cat weight is " +weight +unit);
    }

    public void setCatPrice(int price) {
        catPrice = price;
        System.out.println("cat price is "+catPrice);
    }

    public void move() {
        System.out.println("the cat is running");
    }

}
