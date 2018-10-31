
import junit.framework.*; //junit added to project path

public class TestScore extends TestCase {

	private BowlingScore game;

	// constructors
	public void setUp() {
		game = new BowlingScore();
	}

	// Junit tests to examine game behavior
	// example test cases

	// game of 0 (all gutter balls)
	public void testZero() {

		throwBallRepeat(20, 0); // method used to make things cleaner and quicker than the for loop in every
								// individual method
		assertEquals(0, game.score()); // return 0 from score method
	}

	// ************************************************************
	// game of no spares or strikes....just empty a few pins each roll
	public void testOne() {
		// int maxRolls = 20; //need to remove hardcode rolls
		// int numPins = 0;
		// BowlingScore game = new BowlingScore();

		throwBallRepeat(20, 1);
		assertEquals(20, game.score());
	}

	// ***********************************************************
	public void testSpareFollwedByAnyRoll() {
		game.throwBall(5);
		game.throwBall(5); // this would be a spare
		game.throwBall(3); // so this would not affect previous frame score

		throwBallRepeat(17, 0);

		assertEquals(16, game.score());
	}
	// **********************************************************

	public void testStrikeFollwedByAnyRoll() {
		game.throwBall(10);
		game.throwBall(3);
		game.throwBall(4);
		throwBallRepeat(16, 0);

		assertEquals(24, game.score());
	}

	// **********************************************************
	// game of 300, perfect (all strikes)
	public void testPerfect() {
		throwBallRepeat(12, 10);

		assertEquals(300, game.score());
	}
	// ********************************************************

	// spare with next roll of zero
	// spare with next roll of >= 1
	
	
	
	
	//Tests for Given Program Input
	
	public void testInput1() {
		//same as perfect
		//throwBallRepeat(12, 10);
		
		game.throwBall("XXXXXXXXXXXX");
		
		assertEquals(300, game.score());
	}
	public void testInput2() {
		/*game.throwBall(9);
		game.throwBall(0);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(9);
		game.throwBall(0);*/
		
		game.throwBall("9-9-9-9-9-9-9-9-9-9-");
		assertEquals(90, game.score());
		
	}
	public void testInput3() {
		throwBallRepeat(21, 5);
		assertEquals(150, game.score());		
	}
	public void testInput4() {
		game.throwBall(10);
		game.throwBall(7);
		game.throwBall(3);
		game.throwBall(9);
		game.throwBall(0);
		game.throwBall(10);
		game.throwBall(0);
		game.throwBall(8);
		game.throwBall(8);
		game.throwBall(2);
		game.throwBall(0);
		game.throwBall(6);
		game.throwBall(10);
		game.throwBall(10);
		game.throwBall(10);
		game.throwBall(8);
		game.throwBall(1);
		assertEquals(167, game.score());
	}
	
	//**********************************************************
	
	// helper
	private void throwBallRepeat(int numRolls, int numPins) {
		for (int i = 0; i < numRolls; i++) {
			game.throwBall(numPins);
		} // ends for
	}
	
	

} // End Class
