package rpg;

import java.util.ArrayList;
import java.util.Random;

public class Battle implements BattleInterface {

    ArrayList<Character> characters = new ArrayList<>();

    @Override
    public void start() {
        Monster monster = new Monster("ドラゴン");
        monster.hp = 100;
        monster.mp = 0;
        monster.attackPower = 5;
        monster.defencePower = 3;

        // パーティーでモンスターにこうげき
        for (Character character : characters) {
            character.attack(monster);
        }
        // モンスターのこうげき
        if (monster.isAlive()) {
            Random random = new Random();
            int index = random.nextInt(characters.size());
            monster.attack(characters.get(index));
        }
    }

    @Override
    public void isWin() {

    }

    @Override
    public void addCharacter(Character character) {
        if (characters.size() < 4) {
            characters.add(character);
        } else {
            System.out.println("パーティーは4人までです。");
        }
    }

}
