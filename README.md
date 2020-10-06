# Mini Games

[![GitHub license](https://img.shields.io/github/license/Naereen/StrapDown.js.svg)](https://github.com/Naereen/StrapDown.js/blob/master/LICENSE) [![official JetBrains project](http://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub) 

Welcome to Mini Games! There are 3 different games you can play: Dice Roll, Rock/Paper/Scissors, or Coin Flip. All of our projects have ASCII art to enhance your experience. 

## How to run our code?
Prerequisites: 
- [Java JRE](https://www.oracle.com/java/technologies/javase-jre8-downloads.html)

Download the most recent release. Then open a console or terminal window. CD into the directory and run the following command:   
`java -jar DiceRoll.jar`


## Project Goals/Features:
DiceRoll - Dice Roll game where you roll a dice and dice faces are displayed  
RockPaperScissors - Game where you play rock paper scissors against the computer  
CoinFlip - A simple coin flip animation game  
MainMenu - Main file that is running. It calls the other files.   
  
## AP Test Parallels:
  * Arrays
  * Objects
  * If/Else Statements
  * Classes
  * Primitive Data Types (Strings)  
  * 2D Arrays
  * Array Lists
  * Iteration

## Unit -> Mini Game usage
Unit | Mini Game Usage | Example
---- | --------------- | -------
Primative Types 15% | Mini Games uses integer, boolean types, and strings | MainMenu.java uses boolean types in while loop and switch cases use integer types
Using Objects 15% | Mini Games is using multiple Objects and String (non-primitive data type) | We call objects of the different mini-game classes in MainMenu.java
Boolean Expression and Control statement 40% | Mini Games uses if and switch/case | We use control expressions like "if" and "switch/case" to control how the code runs. We also use boolean expressions to make sure that the code runs until the user says no. 
Writing Classes  10% | Mini Games defines RockPaperScissors, DiceRoll, CoinFlip, and MainMenu | We have different classes for each mini-game so that our code is modular and easier to edit
Arrays 10% | Mini Games uses arrays in multiple places | We use arrays in DiceRoll.java and in RockPaperScissors.java to get a random case.  
2D Arrays 2.5% | Mini games uses 2D arrays the coin flip animation | We use arrays in CoinFlip.java for holding the strings that contain the ASCII art for the dice.  
Array Lists 2.5% | Mini games uses array lists to store the number of rolls you do | We use array lists in DiceRoll.java to store the number of dice rolls that you have so that they can all be printed out at the end.
Iteration 5% | Mini games uses iteration for our main loops and our main files | We use iteration in MainMenu.java, RockPaperScissors, DiceRoll.java, and CoinFlip.java to go through all of our posibilities through if/else, while, and switch/case loops. 

### Project Credits
Contributor | GitHub Link
----------- | -----------
Gautam Gupta | [@batman084](https://github.com/batman084)  
Tanay Shah | [@Altoid0](https://github.com/Altoid0)  
Dhruv Kanetkar | [@DhruvK0](https://github.com/DhruvK0)  
Dhruv Sengupta | [@DaHippoBear](https://github.com/DaHippoBear)  
