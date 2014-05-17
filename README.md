APCSFinal
=========
Authors: Aman Dhar, Matthew Demele, Jesse Chen
Date: 5/13/14

Description: This project is a puzzle game in which colored pieces can be dropped into a square grid from any
	side. In this game, the user must attempt to get three pieces of the same color in a row. Players are only 
	able to drop primary colored tiles into the grid. If a piece enters the grid from one side, all pieces in 
	that row/column, including the most recent piece will slide as far as possible in that direction.
	When two primary colors collide, they form one tile of a different, secondary color. If two tiles of a secondary
	color collide, they will form a brown piece. The collision of two brown pieces create a black piece that explodes, 
	destroying all of its neighboring pieces. As the game progresses, powerups will randomly appear giving players 
	the ability to make attacks or defend.
	Users of our game would be 10 to 99 years old (anyone over 100 doesn't deserve to play our game). Users 
	would play this game mostly for entertainment, but also as a challenging mind game. Other features of our
	program include sound, local multiplayer mode, and networking. 


Instructions: 
-Click to select buttons or drop pieces
-First player to get three of their secondary colors in a row wins!

Features:

Must have:
-Working game with pieces that form to make different colors
-Ability to keep score
-Local Multiplayer

Want to have:
-Networking
-Sound
-PowerUps

Stretches:
-Playing against the computer
-Ability to record high scores


Class List:

Game
  Game.java
Grid
  Grid.java
  GridLocation.java
Panel
  GamePanel.java
  Tor.java
  MainMenu.java
  Instructions.java
Piece
  Piece.java
  PrimColorPiece.java
  SecColorPiece.java
  Black.java
  Brown.java
  PowerUp.java
  Griddable.java


Responsibility List:

Aman: Piece package, Game package
Jesse: Piece Package, Grid package 
Matthew: Panel package, Graphics


