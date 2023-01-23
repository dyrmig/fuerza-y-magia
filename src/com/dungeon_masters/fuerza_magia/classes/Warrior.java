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
    public String attack(Character character) {
        String attackType = "";
        int random = (int)Math.floor(Math.random()*(2 - 1 + 1) + 1);
        if(random==1 && stamina>=5){
            attackType = "Strong Attack";
            character.setHp(character.getHp()-strength);
            stamina = stamina - 5;
        } else if(random==2) {
            attackType = "Weak Attack";
            character.setHp(character.getHp()-strength/2);
            stamina = stamina + 1;
        }
        if(character.getHp() <= 0){
            character.setAlive(false);
        }
        return attackType;
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
