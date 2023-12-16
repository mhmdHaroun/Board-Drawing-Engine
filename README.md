Board Drawing Engine
  
  Implemented a generic game engine for drawing game boards. The engine can support drawing four games: **Tic-Tac-Toe**, **Connect-4**, **Checkers** and **Chess**, 
  however, it is extensible to draw any other board game (e.g., Go Game).

 ** _The engine will have only two responsibilities:_**
    1. Drawing the board and pieces
    2. Enforce the rules of moving pieces
    3. Check the winner, or calculate the scores
    4. Save/Load the game status

  Applyed the concepts of abstraction and higher order functions. So, you need to implement only one abstract game engine that can be used in multiple board games.
  The engine has to support two functionalities: Drawer and Controller.
  
  **Drawer**:
  Draws the game board and pieces given a game state

- The board will have different dimensions (tic tac toe is 3 * 3, connect 4 is 6 * 7 and checkers/chess is 8 * 8)
- The pieces of playing in each game are different
- The board cell is different in terms of colors and each place shape (circular in connect 4 for example)

  Controller: It does two things:
      1. Validates the user input :
          according to the rules of the game. For Tic-Tac-Toe you are allowed to play in any empty place, in Connect-4 you are allowed to play
          in any column that has an empty place and the piece must fall in the first empty place in the column while in Chess each piece has different allowed moves. In
          Checkers pieces move diagonally under certain conditions.
      2. Applies the user action
          modifies the board accordingly (e.g., in Chess we can remove pieces that got killed, and in Checkers we can alter the color of the captured pieces).


  Assuming that in all the games the columns are identified by letters, and rows will be identified by numbers.
The user will choose a cell by entering the location (e.g., 2c, 4f, 3g).
No need to use Mouse Cursor to move pieces, all the user input will be using the keyboard
According to the game, in each move the user will need to input only one cell location, for example: in Tic-Tac-Toe and
Connect-4. While in Checkers and Chess, he will have to enter two cell locations (from and to).
If the Controller rejects the move, the user will retry and enter a new location.




