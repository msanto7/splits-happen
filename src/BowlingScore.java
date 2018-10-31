//Michael Santoro
//10-29-18
//Enlighten Design and Development Challenge - Bowling Score
//IDE used Eclipse 

public class BowlingScore {

	// 10 frames
	// 10 pins per frame
	// 2 rolls in every frame besides the final (if strike the 2, if spare then 3)
	private int rollsArray[] = new int[21]; // 21 max rolls
	private int currentRoll = 0; // this will help keep track of frames and rolls
	// int score = 0; //global initialize

	public static void main(String[] args) {
		// Main Driver for bowling score program
		// so we are provided with a valid sequence of rolls from the begininng
		// must decide on how to store
		// the sequence will contain numbers 1-9, "/" (spare), "X" (strike), "-" (miss)
		// how should we store a sequence?
		// array?...we need to conceptualize a frame in addition to just individual
		// rolls..
		// this is how we will keep track of a spare or strike
		// we need to keep track of 2 frames at a time...only adding to the total score
		// when we are sure we have finished calulcating a spare or strike scenario

		System.out.println("Bowling Score:  "); // Build test

	} // End Main

	// Scoring Logic
	// ************************************************************************
	public int score() {
		// calculate and return score

		// initialize
		// int score = 0; brought up one level to give other methods access to variable
		// for (int i = 0; i < 21; i++) {
		// if frame total < 10
		// basic case (frame is neither spare nor strike
		// score = (roll1 of frame) + (roll2 of frame)
		// else if ('/' spare)
		// score = 10 + (next roll)
		// else ('X' strike)
		// score = 10 + (next 2 rolls, total of pins down in the next frame)
		// } End for loop
		// return 0; used for original hardcoded solution

		int score = 0;
		int frameCursor = 0; // need to create an idea of a frame

		for (int cFrame = 0; cFrame < 10; cFrame++) {
			if (isStrike(frameCursor)) {
				// strike = true
				score = score + 10 + rollsArray[frameCursor + 1] + rollsArray[frameCursor + 2];
				frameCursor++;
			} else if (isSpare(frameCursor)) {
				// spare = true
				score = score + 10 + rollsArray[frameCursor + 2];
				frameCursor = frameCursor + 2;
			} else {
				score = score + rollsArray[frameCursor] + rollsArray[frameCursor + 1]; // add the 2 in a frame
				frameCursor = frameCursor + 2; // meaning we need to jump 2 rolls into the next frame..we have fully
												// processed the current one
			}
		} // ends for

		return score;

	} // End Method Score
		// ************************************

	public void throwBall(int numPins) {
		
		
		//XXXXXXXXXX There is where I may be able to account for the characters 
		
		//lets say we pass this method a char...
		//and use each character to build an integer array
		//so if we roll a ('X')...we populate the rollsArray with the integer 10
		
		//this way our logic is the same...and we process it before even entering the score 
		
		//we could also maybe overload the throwBall method...so if it recieves a character 
		//we use another throwBall method that takes care of that arguement and correctly
		//updates the rollsArray
		
		//XXXXXXXXXXX
			

		// score = score + numPins; //simple case without any logic for spare or strike
		// move score outside single method scope

		rollsArray[currentRoll++] = numPins; // so this updates the the frame score including the next roll (for the
												// case of a spare)
	}
	//*****
	public void throwBall(String gameInput) {
		//String[] individualRolls = gameInput.split("[]+");
		char[] individualRolls = gameInput.toCharArray();
		
		for (int i = 0; i < individualRolls.length; i++) {
			System.out.println(individualRolls[i]);
			
			switch (individualRolls[i]) {
			case 'X':
				rollsArray[i] = 10;
				break;
			case '/':
				rollsArray[i] = 10 - rollsArray[i-1];
				break;
			case '-':
				rollsArray[i] = 0;
				break;
			case '1':
				rollsArray[i] = 1;
				break;
			case '2':
				rollsArray[i] = 2;
				break;
			case '3':
				rollsArray[i] = 3;
				break;
			case '4':
				rollsArray[i] = 4;
				break;
			case '5':
				rollsArray[i] = 5;
				break;
			case '6':
				rollsArray[i] = 6;
				break;
			case '7':
				rollsArray[i] = 7;
				break;
			case '8':
				rollsArray[i] = 8;
				break;
			case '9':
				rollsArray[i] = 9;
				break;
				
			default: System.out.println("Invalid character");
					
			} //end switch
		} //end for
		
	}
	// **********************************************************
	public boolean isSpare(int frameCursor) {
		return (rollsArray[frameCursor] + rollsArray[frameCursor + 1] == 10);
	}

	// **********************************************************
	public boolean isStrike(int frameCursor) {
		return rollsArray[frameCursor] == 10;
	}
	// ***********************************************************

} // End Class

//out of scope but will try to implement
// checking for valid rolls
// check for correct number of rolls and frames
// provide scores for intermediate frames (this will probably be the most
// intensive)

//Resources used towards the development design and solution 

// https://www.youtube.com/watch?v=OPGTPQ4kURU
//
