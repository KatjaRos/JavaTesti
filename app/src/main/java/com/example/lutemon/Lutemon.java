package com.example.lutemon;

import java.io.Serializable;

public class Lutemon implements Serializable {
    protected String name;
    protected String type;
    protected String color;
    protected int health;
    protected int attack;
    protected int defense;
    protected int image;

    public Lutemon (String name, String type){
        this.name = name;
        this.type = type;
        this.health = 100;
        if (type == "Mossmon"){
            this.color = "Green";
            this.attack = 20;
            this.defense = 8;
        }
        else if (type == "Oranmon"){
            this.color = "Orange";
            this.attack = 10;
            this.defense = 15;
        }
        else if (type == "Redimon"){
            this.color = "Red";
            this.attack = 13;
            this.defense = 17;
        }
        else if (type == "Blumon"){
            this.color = "Blue";
            this.attack = 8;
            this.defense = 20;
        }
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public int getImage() {
        return image;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
