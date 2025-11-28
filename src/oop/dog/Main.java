package oop.dog;

public class Main {
    public static void main(String[] args) {
        Dog muhtar = new Dog();
        muhtar.name = "Мухтар";
        muhtar.breed = "Немецкая овчарка";
        muhtar.speed = 10;
        muhtar.run();
        System.out.println(muhtar.info());
    }
}
