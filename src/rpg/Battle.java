package rpg;

import java.util.ArrayList;

public class Battle implements BattleInterface {

    ArrayList<Character> characters = new ArrayList<>();

    @Override
    public void start() {

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
