package com.dungeon_masters.fuerza_magia.classes;

public class Warrior extends Character {
    private int stamina;
    private int strength;

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Warrior(int stamina, int strength) {
        this.stamina = stamina;
        this.strength = strength;
    }
}
