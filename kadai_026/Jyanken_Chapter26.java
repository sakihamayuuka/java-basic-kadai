package kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        String choice = scanner.nextLine().toLowerCase();
        while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
            System.out.println("無効な選択です。r, s, または p を入力してください: ");
            choice = scanner.nextLine().toLowerCase();
        }
        return choice;
    }

    public String getRandom() {
        String[] choices = {"r", "s", "p"};
        return choices[new Random().nextInt(choices.length)];
    }

    public void playGame() {
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        String myChoice = getMyChoice();
        String opponentChoice = getRandom();

        System.out.println("自分の手は" + handMap.get(myChoice) + ", 対戦相手の手は" + handMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
