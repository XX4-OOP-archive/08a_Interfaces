package com.cc.java;
public class App {

    // static Honeybee worker;

    public static void main(String[] args) {
      
        HoneyBee queen = new Queen();
        HoneyBee drone = new Drone();
        HoneyBee worker = new Worker();

        Bird bird = new Bird();

        output(queen.doYourJob());
        output(drone.doYourJob());
        output(worker.doYourJob());
        output(bird.doYourJob());

        output("-----------------");

        output(queen.fly());
        output(drone.fly());
        output(worker.fly());
        output(bird.fly());

  
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
