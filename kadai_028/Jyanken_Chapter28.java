package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String myChoice = scanner.next();

        return myChoice;
    }

    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        int index = (int) Math.floor(Math.random() * 3);

        return choices[index];
    }

    public void playGame(String myChoice, String random) {
        HashMap<String, String> choiceMap = new HashMap<String, String>();
        choiceMap.put("r", "グー");
        choiceMap.put("s", "チョキ");
        choiceMap.put("p", "パー");

        System.out.println("自分の手は" + choiceMap.get(myChoice) + ",対戦相手の手は" + choiceMap.get(random));

        if (myChoice.equals(random)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && random.equals("s")) ||
            (myChoice.equals("s") && random.equals("p")) ||
            (myChoice.equals("p") && random.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}