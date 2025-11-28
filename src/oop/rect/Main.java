package oop.rect;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setDimens(10, 5);
        System.out.println(rect.perimeter());
        System.out.println(rect.square());
    }
}
