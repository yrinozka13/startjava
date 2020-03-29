package com.startjava.Lesson_2_3.game;

public class Player {
    private String name;
    private int number;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return "Player{" +
                "name='" + name + ", number='" + number +
                '}';
    }
}
