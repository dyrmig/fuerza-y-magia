package com.dungeon_masters.fuerza_magia;

import com.dungeon_masters.fuerza_magia.classes.Character;
import com.dungeon_masters.fuerza_magia.classes.Warrior;
import com.dungeon_masters.fuerza_magia.classes.Wizard;

public class Main {
    public static void main(String[] args) {
        Warrior character1 = new Warrior("judaor1");
        Wizard character2 = new Wizard("jugador2");
        System.out.println(character1.getStrength());
        System.out.println(character2.generateMana());
    }
}
