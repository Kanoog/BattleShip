

CLASS : 
Foundations of Software Development - Java
SEIS 601 - Section 1 (Fall 2022)


INSTRUCTOR: 
Professor Eric Level


TEAM MEMBERS ON PROJECT:
Kanoog Moua
Adam Moua (Yoojyim Moua)


PROJECT NAME:
Simple BattleShip

TOOLS:
- Eclipse Java IDE
- JDk 17
- Java Util library

CLASSES:
- Game.java
- Ship.java
- Computer.java
- PLayer.java


RUN PROJECT:

To run the Simple BattleShip program, Run the Game.java class. All of the driver code is located inside of the Game.java class.

Once you hit Run for the Game.java class, the game will start by giving instructions on how to play the game and then
asking you to enter in your name. For each round in the game, It'll then show you the number of available guesses you have, 
how many ships are on the board, and show you the board containing the (x,y) coordinates. 

You'll then be asked to enter in the X,Y coordinates of where you think
the ships might be. First enter in the x guess and then the y guess. You can only enter in numbers between 0 and 9. If you enter
in a guess that is not an integer, a number outside the range allowed, or if you enter in a guess you had already put in, you'll
be asked to enter a new x,y coordinate. For one game, there are only 15 guesses that you are alloted to input

If the guess you enter does hit the ship on the board, the board will indicate that you've hit a ship with the message HIT.
If you missed it, the board will show MISS in place of the coordinate you guessed.

At the end of the game, you'll get a reveal of where the ships were located on the board. The ship will say SHIP,
if a ship was placed in that spot. 





