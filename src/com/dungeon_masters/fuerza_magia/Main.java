package com.dungeon_masters.fuerza_magia;

import com.dungeon_masters.fuerza_magia.classes.Character;
import com.dungeon_masters.fuerza_magia.classes.Warrior;
import com.dungeon_masters.fuerza_magia.classes.Wizard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player1 introduce your name:");
        String namePlayer1 = scanner.nextLine();

        String typePlayer1 = "";
        while (!typePlayer1.equals("wizard") && !typePlayer1.equals("warrior")){
            System.out.println("Player1 chose 'wizard' or 'warrior':");
            typePlayer1 = scanner.nextLine();
        }

        System.out.println("Player2 introduce your name:");
        String namePlayer2 = scanner.nextLine();

        String typePlayer2 = "";
        while (!typePlayer2.equals("wizard") && !typePlayer2.equals("warrior")){
            System.out.println("Player2 chose 'wizard' or 'warrior':");
            typePlayer2 = scanner.nextLine();
        }

        scanner.close();

        Character character1 = null;
        Character character2 = null;

        if(typePlayer1.equals("wizard")){
            character1 = createWizard(namePlayer1);
        } else {
            character1 = createWarrior(namePlayer1);
        }

        if(typePlayer2.equals("wizard")){
            character2 = createWizard(namePlayer2);
        } else {
            character2 = createWarrior(namePlayer2);
        };

        game(character1, character2);
    }
    public static void game(Character player1, Character player2){
        boolean runGame = true;
        int roundCounter = 0;
        System.out.println(player1.getName()+": "+player1.getClass().getSimpleName()+" HP:"+player1.getHp());
        System.out.println(player2.getName()+": "+player2.getClass().getSimpleName()+" HP:"+player2.getHp());
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
    public static Wizard createWizard(String name){
            return new Wizard(name);
    }
    public static Warrior createWarrior(String name){
        return new Warrior(name);
    }
}
