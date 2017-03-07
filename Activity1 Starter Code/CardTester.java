/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card j = new Card("jack","diamonds", 11);
		System.out.println(j.toString());
		Card j2 = new Card("jack","hearts", 11);
		System.out.println(j2.toString());
		if(j.matches(j2)) System.out.println("They match.");
		else System.out.println("They don't match.");
	}
}
