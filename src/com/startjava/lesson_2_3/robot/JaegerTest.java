package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f);
        // strikerEureka.setModelName("Striker Eureka");
        // strikerEureka.setMark("Mark-5");
        // strikerEureka.setOrigin("Australia");
        // strikerEureka.setHeight(76.2f);
        // strikerEureka.setWeight(1.850f);

        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f);
        // crimsonTyphoon.setModelName("Crimson Typhoon");
        // crimsonTyphoon.setMark("Mark-4");
        // crimsonTyphoon.setOrigin("China");
        // crimsonTyphoon.setHeight(76.2f);
        // crimsonTyphoon.setWeight(1.722f);

        Jaeger jaeger = new Jaeger();

        System.out.println(jaeger);
        System.out.println(strikerEureka);
        System.out.println(crimsonTyphoon);

        crimsonTyphoon.drift();
        System.out.println(strikerEureka.scanKaiju());
        crimsonTyphoon.useWeapon();
        strikerEureka.move();
    }
}