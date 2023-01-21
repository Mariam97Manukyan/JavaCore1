package chapter6;

public class Box {
    double width;
    double height;
    double depth;
    Box (int i, int i1, int i2) {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");


    }

    void volume() {
        System.out.print("Oбъeм равен ");
        System.out.println(width * height * depth);

    }

    double volume1() {
        return width * height * depth;
    }

    void setDenim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}
