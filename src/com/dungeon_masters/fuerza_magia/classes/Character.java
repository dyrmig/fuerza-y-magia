package com.dungeon_masters.fuerza_magia.classes;

import com.dungeon_masters.fuerza_magia.interfaces.Attacker;

public abstract class Character implements Attacker {
    private String id;
    private String name;
    private int hp;
    private boolean isAlive;

    public Character(String name, int hp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
    }

    @Override
    public void attack(java.lang.Character character) {

    }
}
