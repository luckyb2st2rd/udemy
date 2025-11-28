package oop;

public class Human {
    String name;
    double age;
    double weight;

    public static void main(String[] args) {
        Human nurlan = new Human();
        nurlan.age = 25;
        Human artem = new Human();
        artem.age = 20;
        Human vlad = new Human();
        vlad.age = 17;
        Human ura = new Human();
        ura.age = 27;
        Human sergei = new Human();
        sergei.age = 1;
        System.out.println((nurlan.age + artem.age + vlad.age + ura.age + sergei.age) / 5) ;
    }
}
