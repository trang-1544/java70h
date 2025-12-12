package oop.interface_1.move;

public class RobotDog implements moveable,playable{
    @Override
    public void move() {
        System.out.println("Move right");
    }

    @Override
    public void play() {
        System.out.println("Play date dog");
    }
}
