# Design and Development Challenge – Bowling Score

## Solution -
###Environment
My solution is written in Java. More specifically, the current Java Version 8 update 191. I used Eclipse to edit code, build and debug the solution, analyze JUnit tests, and manage my VCS (Git 2.19.1). I am most familiar with Git and Java so this is my main reason for choosing this language and set of tools. 
###Process
I used the Test Driven Design method to help build a clean solution to this well known coding challenge. Starting by writing small unit tests for the most basic case of a bowling game. Leaving more complicated logic, such as handling a spare or strike, as a later step in the process. There are 2 main Java classes used. The BowlingScore.java is where our scoring logic and input processing takes place. The TestScore.java is where we feed the program our given input and check to see if we are correctly calculating the expected score. 

### Things to Fix or Add
The most obvious is that the program has no entry point, simply the Java class containing the logic to score the bowling game, and a set of tests to test the functionality. Ideally some type of GUI or web application could be used to allow the user to enter their input for example (http://www.bowlinggenius.com/). This solution also forces valid input, which in my current solution there is no input validation. 

In addition there remains some inefficiencies in the code. Given an input string we must iterate through twice, once to build the integer array, and again to calculate the score. There also appears to be potential for recursion here.

## Requirement
Create a program which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game. Fork this repository, build your program in the language of your choice, then submit a pull request with your code.

## Tasks which are out of scope
*   No need to check for valid rolls.
*   No need to check for correct number of rolls and frames.
*   No need to provide scores for intermediate frames.

## Scoring Logic
*   Each game, or "line" of bowling, includes ten turns, or "frames" for the bowler.
*   In each frame, the bowler gets up to two tries to knock down all the pins.
*   If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
*   If in two tries he knocks them all down, this is called a "spare" and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
*   If on his first try in the frame he knocks down all the pins, this is called a "strike". His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
*   If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
*   The game score is the total of all frame scores.

## Validation Test Cases
Use the test cases from the table below to validate the scoring logic of your program. For program input, "X" indicates a strike, "/" indicates a spare, "-" indicates a miss, and a number indicates the number of pins knocked down in the roll.

| Program Input         | Scoring Calculation                                                                                                             | Total Score |
|-----------------------|---------------------------------------------------------------------------------------------------------------------------------|-------------|
| XXXXXXXXXXXX          | (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) | 300         |
| 9-9-9-9-9-9-9-9-9-9-  | 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9                                                                                           | 90          |
| 5/5/5/5/5/5/5/5/5/5/5 | (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5)                                         | 150         |
| X7/9-X-88/-6XXX81     | (10+7+3) + (7+3+9) + 9 + (10+0+8) + 8 + (8+2+0) + 6 + (10+10+10) + (10+10+8) + (10+8+1)                                         | 167         |


