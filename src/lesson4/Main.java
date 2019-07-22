package lesson4;

public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(() -> {
            mt.printA();
        }).start();
        new Thread(() -> {
            mt.printB();
        }).start();

        new Thread(() -> {
            mt.printC();
        }).start();
    }

}
