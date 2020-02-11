package app;

class CyclicTactics implements Tactics{

    int lastHand = -1;

    public int readTactics(){
        int hand = (lastHand + 1) % 3;
        lastHand++;
        return hand;
    }
}