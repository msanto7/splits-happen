

import junit.framework.*;  //junit added to project path




public class TestScore extends TestCase{
	
	private BowlingScore game;
	
	//constructors
	
	public void setUp() {
		game = new BowlingScore();		
	}
	
	
	
	//Junit tests to examine game behavior
	
	
	//example test cases
	
		//game of 0 (all gutter balls)
		public void testZero() {
			//BowlingScore game = new BowlingScore();  //create game instance
			//for (int i = 0; i < 20; i++) {
				//game.throwBall(0);
			//} //ends for
			
			throwBallRepeat(20,0);   //method used to make things cleaner and quicker than the for loop in every individual method
			assertEquals(0, game.score()); //return 0 from score method	
		} 
		//************************************************************
		
		//game of no spares or strikes....just empty a few pins each roll
		public void testOne() {
			//int maxRolls = 20;  //need to remove hardcode rolls 
			//int numPins = 0;
			//BowlingScore game = new BowlingScore();
			
			throwBallRepeat(20, 1);
			
			assertEquals(20, game.score());
		}
		
			//helper
		private void throwBallRepeat (int numRolls, int numPins) {
			for (int i = 0; i < numRolls; i++) {
				game.throwBall(numPins);
				//need to make game visible to this method
			} // ends for
		}
		//***********************************************************
		
		public void testSpareFollwedByZero() {
			game.throwBall(5);
			game.throwBall(5);      //this would be a spare
			game.throwBall(3);      //so this would not affect previous frame score
			
			throwBallRepeat(17, 0);
			
			assertEquals(16, game.score());
			
		}
		//**********************************************************
		
	
		//game of 300, perfect (all strikes)
	
		//spare with next roll of zero
	
		//spare with next roll of >= 1 
	

} //End Class 
