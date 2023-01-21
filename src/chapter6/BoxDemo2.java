package chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(10, 20, 15);
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Oбъeм равен " + vol);
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Oбъeм равен " + vol);
    }

}
