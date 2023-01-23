package com.dungeon_masters.fuerza_magia.classes;

public class Wizard extends Character {
    private int mana;
    private int intelligence;
    public Wizard(String name){
        super(name);
        super.setHp(generateHp());
        mana = generateMana();
        intelligence = generateIntelligence();
    }
    @Override
    public void attack(Character character) {

    }
    public int generateHp(){
        int random = (int)Math.floor(Math.random()*(100 - 50 + 1) + 50);
        //return String.valueOf(random);
        return random;
    }
    public int generateMana(){
        int random = (int)Math.floor(Math.random()*(50 - 10 + 1) + 10);
        //return String.valueOf(random);
        return random;
    }
    public int generateIntelligence(){
        int random = (int)Math.floor(Math.random()*(50 - 1 + 1) + 1);
        //return String.valueOf(random);
        return random;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
