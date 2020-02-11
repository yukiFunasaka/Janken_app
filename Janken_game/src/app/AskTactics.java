package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class AskTactics implements Tactics{

    public int readTactics() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("出す手を選択してください(0:グー,1:チョキ,2:パー)");
        System.out.println("?");
        int hand = 0;

        while(true){
            try {
                String inputStr = br.readLine();
                hand = Integer.parseInt(inputStr);
                if(hand == Player.STONE || hand == Player.PAPER || hand == Player.SCISSORS){
                    break;
                }else{
                    System.out.println("入力値が正しくありません。再度入力してください。");
                }
            } catch (Exception e) {
                System.out.println("入力値が正しくありません。再度入力してください。");
            }
        }
        return hand;
    }
}