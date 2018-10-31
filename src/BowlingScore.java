//Michael Santoro
//10-29-18
//Enlighten Design and Development Challenge - Bowling Score
//IDE used Eclipse 

public class BowlingScore {

	// 10 frames
	// 10 pins per frame
	// 2 rolls in every frame besides the final
	private int rollsArray[] = new int[21]; // 21 max rolls
	private int currentRoll = 0; // this will help keep track of frames and rolls

	// Scoring Logic
	// ************************************************************************
	public int score() {
		// calculate and return score
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
				score = score + rollsArray[frameCursor] + rollsArray[frameCursor + 1];
				frameCursor = frameCursor + 2; // meaning we need to jump 2 rolls into the next frame
			}
		} // ends for

		return score;

	} // End Method Score
	// ************************************
	public void throwBall(int numPins) {
		rollsArray[currentRoll++] = numPins;
	}
	//***********************
	public void throwBall(String gameInput) {
		char[] individualRolls = gameInput.toCharArray();	
		for (int i = 0; i < individualRolls.length; i++) {
			
			switch (individualRolls[i]) {     //this is ugly, better way to parse input?
			case 'X':
				rollsArray[i] = 10;
				break;
			case '/':
				rollsArray[i] = 10 - rollsArray[i-1];
				break;
			case '-':
				rollsArray[i] = 0;
				break;
			case '0':
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
				break;
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
	// http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata

