/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[]ranks={"king", "queen", "peasant"}; 
        String[]suits={"diamonds","stone"};
        int[]pointValues={1, 100, 1000};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println(d.toString());
        for(int i=0; i<5; i++)
            d.deal();
        System.out.println(d.toString());
    }
}
