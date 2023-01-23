package com.dungeon_masters.fuerza_magia.classes;

public class Warrior extends Character {
    private int stamina;
    private int strength;
    public Warrior(String name) {
        super(name);
        super.setHp(generateHp());
        stamina = generateStamina();
        this.strength = generateStrength();
    }

    @Override
    public void attack(Character character) {

    }
    public int generateHp(){
        int random = (int)Math.floor(Math.random()*(200 - 100 + 1) + 100);
        //return String.valueOf(random);
        return random;
    }
    public int generateStamina(){
        int random = (int)Math.floor(Math.random()*(50 - 10 + 1) + 10);
        //return String.valueOf(random);
        return random;
    }
    public int generateStrength(){
        int random = (int)Math.floor(Math.random()*(10 - 1 + 1) + 1);
        //return String.valueOf(random);
        return random;
    }
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
}
