# Number Guesser Project

Due:

## Overview

In this assignment, you’ll be creating two programs—one called `NumberGuesser.java` that is a class for an object that handles generation and guessing of random values and one called `NumberGuesserRunner.java` that uses the `NumberGuesser` object to interface with the user and play a game.

## Background

The rules for Number Guessing Game are as follows:

1. The computer generates a random number from 1 to 10 inclusive.

2. The user has three chances to guess the number. After each guess, the computer communicates whether the number was “too high”, “too low”

3. If the guesser identifies the number by the third guess, they win. If not, they lose and the correct number is revealed.

## Program Specifications

You must create two files that meet the following criteria:

`NumberGuesser.java`

- This file is the class for a `NumberGuesser` object.
- A NumberGuesser object should have two methods:
- `startNewGame()` that resets the random number to be guessed
- `guessValue(int guess)` that accepts an integer as a parameter and returns -1 if the guess is too low, 1 if the guess is too high and 0 if the guess is correct.
- The constructor can either start a new game by default or set the secret value to some consistent default number—your choice!
- There should be **no print statements** in this file—the runner will be the one to handle printing.
- We will let the runner file keep track of total guesses and win/loss conditions for simplicity.
- Comments should be included at the beginning of the file as well as for each method.


`NumberGuesserRunner.java`

- This file contains the main method and is run by the user.
- The file should make a NumberGuesser object and use the object’s methods to determine outcome.
- The file should greet the user and prompt them to guess numbers.
- After guessing, the program should print out whether the guess was too high, too low or spot on.
- When the user has made three guesses and still not gotten the number, they should be informed of a loss.
- After a game is complete, the user should be prompted if they want to play again and can choose to do so by either typing “y” or “n”.
- Once a user stops playing, the program should stop running.
- Comments should be included at the beginning of the file as well as for any methods written and any other details that require explanation.


## Ideas to Consider

- What field(s) will the NumberGuesser object need? Are accessor methods needed for them?
- While debugging any problems, you can include extra print statements in your files to see what the actual random number is while working.
- The `NumberGuesserRunner` will need at least one loop to be able to replay the game if the user wants, but it may be necessary to use nested loops depending on your implementation.
- Do you want any other methods in your `NumberGuesserRunner` file? The program can be written entirely in the main method, but it might be helpful to have a method such playGame() for ease of control.
- What benefits are there to separating the gameplay into an object? Is it more or less confusing for you to use?

## Rubric

- The NumberGuesser.java file is bug free and includes appropriate fields, constructors and methods to meet the design needs. Numbers between 1 and 10 are randomly generated accurately. (5 pts)
- The NumberGuesserRunner.java file makes successful use of a NumberGuesser object to handle guesses, start new games and report information back to the user. (8 pts)
- The NumberGuesserRunner.java file supports the ability to have the user play multiple games in a single run. (5 pts)
- Code is neat, easy to follow and commented as needed. This includes Javadoc-style comments at the beginning of each file and heading for each method. (2 pts)