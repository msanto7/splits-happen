

import junit.framework.*;  //junit added to project path




public class TestScore extends TestCase{
	
	
	//Junit tests to examine game behavior
	
	
	//example test cases
	
		//game of 0 (all gutter balls)
		public void testZero() {
			BowlingScore game = new BowlingScore();  //create game instance
			for (int i = 0; i <=20; i++) {
				game.throwBall(0);
				assertEquals(0, game.score()); //return 0 from score method
			}
				
		}
		
	
		//game of 300, perfect (all strikes)
	
		//spare with next roll of zero
	
		//spare with next roll of >= 1 
	

} //End Class 
