# SwampGame
Program finds an escape path from a given starting point in a maze. 
The maze (or swamp or mine field etc.) is a square 2D array of int. 
A value of zero in any cell represents a wall (land mine or quicksand etc.) while a value of one represents a possible step to take. 
Each input file will has a line at the top of the file that has the square dimension of the matrix followed by the drop in point. 
The drop in point is the row/col pair indicating where the program is dropped into the swamp. 
It escapes the swamp by taking one step at a time to any adjacent square that is a 1. 
The program is not allowed to step on a zero cell. It must remember which squares it has already stepped on in a path 
so that it don't get stuck in an infinite loop. The five input files have cycles and dead ends and valid paths to the edge of the swamp.

