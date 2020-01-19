package app;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name_;
    private int winCount_ = 0;

    public Player (String name){
        name_ = name;
    }

    public String getName(){
        return name_;
    }

    private Tactics tactics_;

    void setTactics(Tactics tactics){
        tactics_ = tactics;
    }

    public int showHand(){
        int hand = tactics_.readTactics();
        return hand;
    }

    public void notifyResult(boolean result){
        if(result){
            winCount_++;
        }
    }

    public int getWinCount(){
        return winCount_;
    }
}