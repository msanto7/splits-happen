//Michael Santoro
//10-29-18
//Enlighten Design and Development Challenge - Bowling Score
//IDE used Eclipse 



public class BowlingScore {
	
	//10 frames
	//10 pins per frame
	//2 rolls in every frame besides the final (if strike the 2, if spare then 3)
	private int rollsArray[] = new int[21];   //21 max rolls
	private int currentRoll = 0;  //this will help keep track of frames and rolls
	//int score = 0; //global initialize 

	public static void main(String[] args) {
		
		
		//Main Driver for bowling score program
		
		//so we are provided with a valid sequence of rolls from the begininng 
			//must decide on how to store
			//the sequence will contain numbers 1-9, "/" (spare), "X" (strike), "-" (miss) 
			//how should we store a sequence?
		//array?...we need to conceptualize a frame in addition to just individual rolls..
		//this is how we will keep track of a spare or strike 
		
		
		//we need to keep track of 2 frames at a time...only adding to the total score when we are sure we have finished calulcating a spare or strike scenario 
		
		
		System.out.println("Bowling Score:  ");  //Build test
		
	} //End Main
	 
	
	
	//Scoring Logic ************************************************************************
	public int score() {
		
		//calculate and return score 
		
		//initialize 
		//int score = 0;     brought up one level to give other methods access to variable
		
		//for (int i = 0; i < 21; i++) {
			
			//if frame total < 10
				//basic case (frame is neither spare nor strike 
				//score = (roll1 of frame) + (roll2 of frame)
			
			//else if ('/' spare)
				//score = 10 + (next roll)
			
			//else ('X' strike)
				// score = 10 + (next 2 rolls, total of pins down in the next frame)
				
			
			
			
		 //     }      End for loop
		
			
			// return 0; used for original hardcoded solution
		
		int score = 0;
		
		for (int i = 0; i < rollsArray.length; i++) {
			score = score + rollsArray[i];
		}			
			
		return score;
		
		
	} //End Method Score 
	//************************************
	
	//We will create a method to create a level of abstraction representing a single throw
	
	public void throwBall(int numPins) {
		
		//score = score + numPins;   //simple case without any logic for spare or strike
		//move score outside single method scope
		
		rollsArray[currentRoll++] = numPins;   //so this updates the the frame score including the next roll (for the case of a spare)
		
	}
	

	
	public boolean isSpare() {
		//if first or second roll in frame is "/"
			return true;
		
		//else 
			//return false;
	}
	
	public boolean isStrike() {
		//if first roll in frame is "X"
			return true;
		//else 
			//return false;
	}
	
	
	
	

} //End Class



//out of scope but will try to implement
	//checking for valid rolls
	//check for correct number of rolls and frames
	//provide scores for intermediate frames (this will probably be the most intensive)



//Resources used towards the development design and solution 

	//https://www.youtube.com/watch?v=OPGTPQ4kURU
	//


