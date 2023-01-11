package chap09.abstractEx;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("켜다");
    }

    public void turnOff() {
        System.out.println("끄");
    }
}
