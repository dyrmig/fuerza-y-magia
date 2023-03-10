package com.dungeon_masters.fuerza_magia.classes;

import com.dungeon_masters.fuerza_magia.interfaces.Attacker;

public abstract class Character implements Attacker {
    private String id;
    private String name;
    private int hp;
    private boolean isAlive;

    public Character(String name) {
        this.id = generateId();
        this.name = name;
        this.isAlive = true;
    }

    //@Override
    //public void attack(Character character) {
    //}

    public String generateId(){
        int random = (int)Math.floor(Math.random()*(9999 - 1000 + 1) + 1000);
        //return String.valueOf(random);
        return Integer.toString(random);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

