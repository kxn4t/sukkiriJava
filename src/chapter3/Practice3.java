package chapter3;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {

    public static void main(String[] args) {

        Hero hero1 = new Hero("斎藤");
        Hero hero2 = new Hero("鈴木");

        Map<Hero, Integer> heroes = new HashMap<>();

        heroes.put(hero1, 3);
        heroes.put(hero2, 7);

        for (Map.Entry<Hero, Integer> entry : heroes.entrySet()) {
            System.out.println(entry.getKey().getName() + "が倒した数=" + entry.getValue());
        }
    }
}
