
import junit.framework.*; //junit added to project path

public class TestScore extends TestCase {
	private BowlingScore game;

	// constructors
	public void setUp() {
		game = new BowlingScore();
	}

	//Tests
	public void testZero() {
		throwBallRepeat(20, 0);
		assertEquals(0, game.score()); // check if score is accurate
	}
	// ************************************************
	// game of no spares or strikes....just empty a few pins each roll
	public void testOne() {
		throwBallRepeat(20, 1);
		assertEquals(20, game.score());
	}
	// ************************************************
	public void testSpareFollwedByAnyRoll() {
		game.throwBall(5);
		game.throwBall(5);
		game.throwBall(3);
		throwBallRepeat(17, 0);
		assertEquals(16, game.score());
	}
	// ************************************************
	public void testStrikeFollwedByAnyRoll() {
		game.throwBall(10);
		game.throwBall(3);
		game.throwBall(4);
		throwBallRepeat(16, 0);
		assertEquals(24, game.score());
	}
	// ***********************************************
	// game of 300, perfect (all strikes)
	public void testPerfect() {
		throwBallRepeat(12, 10);
		assertEquals(300, game.score());
	}
	// ***********************************************
	// spare with next roll of zero following
	public void testSpareFollowedByMiss() {
		game.throwBall("2/------------------");
		assertEquals(10, game.score());
	}
	// spare with next roll of >= 1
	public void testSpareFollowedByPins() {
		game.throwBall("-/3-----------------");
		assertEquals(16, game.score());
	}
	//spare in tenth frame followed by pins
	public void testTenthFrameSpare() {
		game.throwBall("------------------2/3");
	}
	//********************************************
	
	//Tests for Given Program Input    ************************	
	public void testInput1() {		
		game.throwBall("XXXXXXXXXXXX");		
		assertEquals(300, game.score());
	}
	public void testInput2() {	
		game.throwBall("9-9-9-9-9-9-9-9-9-9-");
		assertEquals(90, game.score());		
	}
	public void testInput3() {
		//throwBallRepeat(21, 5);
		game.throwBall("5/5/5/5/5/5/5/5/5/5/5");
		assertEquals(150, game.score());		
	}
	public void testInput4() {		
		game.throwBall("X7/9-X-88/-6XXX81");
		assertEquals(167, game.score());
	}	
	//**********************************************************	
	// helper
	private void throwBallRepeat(int numRolls, int numPins) {
		for (int i = 0; i < numRolls; i++) {
			game.throwBall(numPins);
		} // ends for
	}
	//*****************************

} // End Class
