

import junit.framework.*;  //junit added to project path




public class TestScore extends TestCase{
	
	
	//Junit tests to examine game behavior
	
	
	//example test cases
	
		//game of 0 (all gutter balls)
		public void testZero() {
			BowlingScore game = new BowlingScore();  //create game instance
			for (int i = 0; i <=20; i++) {
				game.throwBall(0);
			} //ends for
			
			assertEquals(0, game.score()); //return 0 from score method	
		} 
		//************************************************************
		
		//game of no spares or strikes....just empty a few pins each roll
		public void testOne() {
			BowlingScore game = new BowlingScore();
			for (int i = 0; i <= 20; i++) {
				game.throwBall(1);
			} //ends for
			
			assertEquals(20, game.score());
		}
		//***********************************************************
		
		
	
		//game of 300, perfect (all strikes)
	
		//spare with next roll of zero
	
		//spare with next roll of >= 1 
	

} //End Class 
