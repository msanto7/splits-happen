# Design and Development Challenge – Bowling Score

## Build Instructions 
The most simple way to test this java application is to download and unzip the project...change directory into the "splits-happen-dev" folder, and execute the score.jar file in the command prompt.
<br />
Alternatively you could clone the repository as well. Opening the project in an IDE will allow you to analyze the success of our JUnit tests. 

## Environment -
My solution is written in Java. More specifically, the current Java Version 8 update 191. I used Eclipse to edit code, build and debug the solution, analyze JUnit tests, and manage my VCS (Git 2.19.1). I am most familiar with Git and Java so this is my main reason for choosing this language and set of tools.
<br /> 
## Solution Process - 
I used the Test Driven Design method to help build a clean solution to this well known coding challenge. Starting by writing small unit tests for the most basic case of a bowling game. Leaving more complicated logic, such as handling a spare or strike, as a later step in the process. There are 2 main Java classes used. The BowlingScore.java is where our scoring logic and input processing takes place, as well as our main method to drive the program for user input. The TestScore.java is where we feed the program our given input and check to see if we are correctly calculating the expected score. I first handled the logic just given integer input, building an integer array so we could conceptualize a frame, and have storage to see 2 frames at a time. Then added the ability to use 'X', '/', '-' characters for strike spare and miss. The final step was implementing a build automation with Maven and creating a JAR file.   
<br />
## Things to Add	- 
Ideally some type of GUI or web application could be used to allow the user to enter their input for example (http://www.bowlinggenius.com/). This solution also forces valid input, which in my current solution there is no input validation. 
<br />

In addition there remains some inefficiencies in the code. Given an input string we must iterate through twice, once to build the integer array, and again to calculate the score. There also appears to be potential for recursion here.

## Requirement
Create a program which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game. Fork this repository, build your program in the language of your choice, then submit a pull request with your code.

## Tasks which are out of scope
*   No need to check for valid rolls.
*   No need to check for correct number of rolls and frames.
*   No need to provide scores for intermediate frames.

## Validation Test Cases
Use the test cases from the table below to validate the scoring logic of your program. For program input, "X" indicates a strike, "/" indicates a spare, "-" indicates a miss, and a number indicates the number of pins knocked down in the roll.

| Program Input         | Scoring Calculation                                                                                                             | Total Score |
|-----------------------|---------------------------------------------------------------------------------------------------------------------------------|-------------|
| XXXXXXXXXXXX          | (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) + (10+10+10) | 300         |
| 9-9-9-9-9-9-9-9-9-9-  | 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9                                                                                           | 90          |
| 5/5/5/5/5/5/5/5/5/5/5 | (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5) + (10+5)                                         | 150         |
| X7/9-X-88/-6XXX81     | (10+7+3) + (7+3+9) + 9 + (10+0+8) + 8 + (8+2+0) + 6 + (10+10+10) + (10+10+8) + (10+8+1)                                         | 167         |


