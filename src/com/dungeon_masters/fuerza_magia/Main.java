package com.dungeon_masters.fuerza_magia;

import com.dungeon_masters.fuerza_magia.classes.Character;
import com.dungeon_masters.fuerza_magia.classes.Warrior;
import com.dungeon_masters.fuerza_magia.classes.Wizard;

public class Main {
    public static void main(String[] args) {
        Warrior character1 = new Warrior("jugadaor1");
        Wizard character2 = new Wizard("jugador2");
        //System.out.println(character1.getStrength());
        //System.out.println(character2.generateMana());

        game(character1, character2);
    }
    public static void game(Character player1, Character player2){
        boolean runGame = true;
        int roundCounter = 0;
        while (runGame){
            roundCounter++;
            System.out.println("===Round:"+roundCounter+"===");
            String currentAttack = player1.attack(player2);
            System.out.println(player1.getName() + " --" + currentAttack + "--> " + player2.getName() + " HP: " + player2.getHp());
            currentAttack = player2.attack(player1);
            System.out.println(player2.getName() + " --" + currentAttack + "--> " + player1.getName() + " HP: " + player1.getHp());
            if(!player1.isAlive() || !player2.isAlive()){
                if(!player1.isAlive() && !player2.isAlive()){
                    System.out.println("TIE !");
                } else if (!player1.isAlive()) {
                    System.out.println(player2.getName() + " " + "is the winner!!");
                } else if (!player2.isAlive()) {
                    System.out.println(player1.getName() + " " + "is the winner!!");
                }
                runGame = false;
                roundCounter = 0;
            }
        }
    }
}
