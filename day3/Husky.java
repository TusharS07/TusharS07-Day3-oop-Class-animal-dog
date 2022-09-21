package day3;

public class Husky extends Dog {
    private String speciality;
    private String food;
    private String location;
    private int height;

    //create contructer
    public Husky() {
        System.out.println("This is Husky Constructor");
    }

    public void nameOfDog(String dogName) {
        System.out.println("My Dog name is " +dogName);
    }

    public void dogSpec(String speciality) {
        System.out.println("dog speciality is " +speciality);
    }

    public void dogFood(String food) {
        System.out.println("My dog fav food is " +food);
    }

    public void doglocation(String location) {
        System.out.println("husky are stay in " +location);
    }

    public void dogHeight(int height) {
        System.out.println("Husky height is in feet is " +height);
    }
}
