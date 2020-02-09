package app;

import java.io.BufferedReader;

class AskTactics implements Tactics{

    public int readTactics() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
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