package app;

public class ObjectJanken {
    public static void main(String[] args){
        Judge saito = new Judge();
        Player kato = new Player("加藤さん");
        Player suzuki = new Player("鈴木さん");

        Tactics katoTactics = new StoneOnlyTactics();
        kato.setTactics(katoTactics);

        Tactics suzukiTactics = new RandomTactics();
        suzuki.setTactics(suzukiTactics);

        saito.startJanken(kato, suzuki);
    }
}