package rpg;

import java.util.Random;

public class App3 {
    
    public static void main(String[] args) {
        Wizard wizard1 = new Wizard("アリス");
        Wizard wizard2 = new Wizard("テリー");
        Warrior warrior1 = new Warrior("ボブ");

        Character[] characters = { 
            wizard1, 
            wizard2, 
            warrior1 
        };

        Monster monster1 = new Monster("スライム");
        System.out.println(monster1.name + "があらわれた！");

        // キャラクターの攻撃
        for (Character character : characters) {
            System.out.println(character.getName() + "のこうげき！");
            character.attack(monster1);
        }

        // モンスターの攻撃
        System.out.println("--- battle ---");
        Random rand = new Random();
        int characerIndex = rand.nextInt(characters.length);
        if (monster1.hp > 0) {
            // モンスターのHPがあれば、モンスターの攻撃
            Character character = characters[characerIndex];
            System.out.println(monster1.name + "のこうげき！");

            monster1.attack(character);
            System.out.println(character.getName() + "にダメージ！");
            if (character.isAlive()) {
                System.out.println(character.getName() + "はいきている");
            } else {
                System.out.println(character.getName() + "はたおれた！");
            }
        } else {
            // モンスターのHPがなければ、たおした
            System.out.println(monster1.name + "をたおした！");
        }

    }

}
