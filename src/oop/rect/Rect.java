package oop.rect;

public class Rect {
    int length;
    int width;

    void setDimens(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int perimeter() {
        return (length * 2) + (width * 2);
    }

    public int square() {
        return length * width;
    }
}
