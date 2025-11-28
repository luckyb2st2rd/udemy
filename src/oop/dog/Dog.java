package oop.dog;

public class Dog {
    String name;
    String breed;
    int speed;

    public void run() {
        StringBuilder count = new StringBuilder();
        int i = 0;
        while (i < speed) {
            count.append("бегу, ");
            i++;
        }
        System.out.println(count);
    }

    public String info() {
        return "Кличка: " + name + "\nПорода: " + breed + "\nСкорость: " + speed;
    }
}
