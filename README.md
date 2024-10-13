# Tic-Tac-Toe
This project is a console-based implementation of the classic Tic-Tac-Toe game. It allows two players to play against each other, taking turns to mark spaces in a 3x3 grid. The implementation design follows a modular approach, separating concerns into four different classes.

## Conditions
 - Two players make their turns to mark their symbols on an unfilled box of a board.
 - The first player who gets three of their symbols in a row (horizontally, vertically, or diagonally) wins the game.
 - If all the cells on the grid are filled and no player has won, the game ends in a draw.

## Features
- Two-player mode.
- Input validation to ensure players choose valid and empty cells.
- Display of the game board after each move.
- Detection of win conditions and draw conditions.
- Option to restart the game after it ends.

## Classes
 - **Main**: Main class is the entry point of the game, intializes the two players and starts the game.
 - **Player**: Player class represents a player in the game, with a name, a symbol and wins.
 - **Board**: It has the game board of a 3x3 grid with methods to make moves, check for a winner, and check if the board is full.
 - **Game**: Game class ensures a correct play with valid turns, marking of symbols, and determine the results.

## Steps to Implement
- Clone the repository to your local machiene
- Compile the code using **javac Main.java**
- Run the code using **java Main**

## Sample Game
~~~
Hello there, Let's play!
Enter the name of player 1:
Ram
Enter your symbol:
X
Enter the name of player 2:
John
Enter your symbol:
O
? | ? | ?
? | ? | ?
? | ? | ?
Ram's turn
Enter row number (0, 1, or 2): 1
Enter column number (0, 1, or 2): 1
? | ? | ?
? | X | ?
? | ? | ?
John's turn
Enter row number (0, 1, or 2): 2
Enter column number (0, 1, or 2): 1
? | ? | ?
? | X | ?
? | O | ?
Ram's turn
Enter row number (0, 1, or 2): 0
Enter column number (0, 1, or 2): 2
? | ? | X
? | X | ?
? | O | ?
John's turn
Enter row number (0, 1, or 2): 2
Enter column number (0, 1, or 2): 0
? | ? | X
? | X | ?
O | O | ?
Ram's turn
Enter row number (0, 1, or 2): 2
Enter column number (0, 1, or 2): 2
? | ? | X
? | X | ?
O | O | X
John's turn
Enter row number (0, 1, or 2): 1
Enter column number (0, 1, or 2): 0
? | ? | X
O | X | ?
O | O | X
Ram's turn
Enter row number (0, 1, or 2): 1
Enter column number (0, 1, or 2): 2
? | ? | X
O | X | X
O | O | X
Ram wins!
Play again? Yes/No
Yes
? | ? | ?
? | ? | ?
? | ? | ?
Ram's turn
Enter row number (0, 1, or 2): 1
Enter column number (0, 1, or 2): 1
? | ? | ?
? | X | ?
? | ? | ?
John's turn
Enter row number (0, 1, or 2): 2
Enter column number (0, 1, or 2): 1
? | ? | ?
? | X | ?
? | O | ?
Ram's turn
Enter row number (0, 1, or 2): 2
Enter column number (0, 1, or 2): 2
? | ? | ?
? | X | ?
? | O | X
John's turn
Enter row number (0, 1, or 2): 2
Enter column number (0, 1, or 2): 0
? | ? | ?
? | X | ?
O | O | X
Ram's turn
Enter row number (0, 1, or 2): 0
Enter column number (0, 1, or 2): 0
X | ? | ?
? | X | ?
O | O | X
Ram wins!
Play again? Yes/No
No
Results
Ram 2/2
John 0/2
Ram leads!
See you soon, Have a good day!
~~~
