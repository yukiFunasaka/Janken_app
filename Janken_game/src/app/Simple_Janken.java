package app;

public class Simple_Janken {
    public static void main(String[] args){
        System.out.println("ジャンケンゲームをスタートします");

        final int STONE = 0;
        final int SCISSORS = 1;
        final int PAPER = 2;

        int player1WinCount = 0;
        int player2WinCount = 0;

        for(int cnt = 0 ; cnt < 3 ; cnt++){
            double randomNum = 0;

            int player1Hand = 0;

            randomNum = Math.random() * 3;
            if (randomNum < 1){
                player1Hand = STONE;
                System.out.println("player1はグーをだしました。");
            }else if(randomNum < 2){
                player1Hand = SCISSORS;
                System.out.println("player1はチョキをだしました。");
            }else if(randomNum < 3){
                player1Hand = PAPER;
                System.out.println("player1はパーをだしました。");
            }

            int player2Hand = 0;

            randomNum = Math.random() * 3;
            if (randomNum < 1){
                player2Hand = STONE;
                System.out.println("player2はグーをだしました。");
            }else if(randomNum < 2){
                player2Hand = SCISSORS;
                System.out.println("player2はチョキをだしました。");
            }else if(randomNum < 3){
                player2Hand = PAPER;
                System.out.println("player2はパーをだしました。");
            }

            if ((player1Hand == STONE && player2Hand == SCISSORS) || (player1Hand == SCISSORS && player2Hand == PAPER) || (player1Hand == PAPER && player2Hand == STONE)){
                System.out.println("player1の勝ちです");
                player1WinCount++;
            }else if((player2Hand == STONE && player1Hand == SCISSORS) || (player2Hand == SCISSORS && player1Hand == PAPER) || (player2Hand == PAPER && player1Hand == STONE)){
                System.out.println("player2の勝ちです");
                player2WinCount++;  
            }else if(player1Hand == player2Hand){
                System.out.println("あいこです");
            }

        }

        System.out.println("ゲーム終了です");

        if(player1WinCount > player2WinCount){
            System.out.println(player1WinCount + "対" + player2WinCount + "でplayer1の勝利です");
        }else if(player1WinCount < player2WinCount){
            System.out.println(player1WinCount + "対" + player2WinCount + "でplayer2の勝利です");
        }else if(player1WinCount == player2WinCount){
            System.out.println(player1WinCount + "対" + player2WinCount + "で引き分けです");
        }


    }
}