package oop.human;

public class Main {
    public static void main(String[] args) {
        Human nurlan = new Human();
        nurlan.setAge(25);
        Human artem = new Human();
        artem.setAge(20);
        Human vlad = new Human();
        vlad.setAge(17);
        Human ura = new Human();
        ura.setAge(27);
        Human sergei = new Human();
        sergei.setAge(1);
        System.out.println((nurlan.getAge() + artem.getAge() + vlad.getAge() + ura.getAge() + sergei.getAge()) / 5) ;
    }
}
