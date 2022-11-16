package bluebenny.karel.assignment;

public class GeonuKarelMk2 extends GeonuKarel {

    static boolean beeperTurn = true;

    public GeonuKarelMk2(String name) {
        super(name);
    }

    @Override
    public void move() {
        if(beeperTurn) putBeeper();
        super.move();
        beeperTurn = !beeperTurn;
    }
}
