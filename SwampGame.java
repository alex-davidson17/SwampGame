//Alyssa Davidson
import java.io.*;
import java.util.*;

public class SwampGame
{
	private static int[][] loadSwamp( String infileName, int[] dropInPt  ) throws Exception
	{
		Scanner infile = new Scanner(new File(infileName));
		int rowNum =infile.nextInt();
		int colNum = rowNum;

		dropInPt[0] = infile.nextInt();
		dropInPt[1] = infile.nextInt();

		int[][] swamp = new int[rowNum][colNum];
		for(int r=0; r<rowNum; r++)
			for (int c=0; c<colNum;c++)
				swamp[r][c] = infile.nextInt();
			infile.close();
			return swamp;
	}
	public static void main(String[] args) throws Exception
	{
		String[][] board = loadBoard( args[1] );
		int row=dropInPt[0], col = dropInPt[1];		
		String path = ""; // "[2,3][3,4][3,6][4,6]"
		depthFirstSearch( swamp, row, col, path );
	} // END MAIN

	private static String[][] loadBoard(String infileName) throws Exception
	{
		Scanner infile = new Scanner(new File(infileName)); 
		int row=infile.nextInt(); 
		int col=row; 

		String[][] board = new String[row][col]; 

		for (int i=0; i<row; i++)
			for (int j=0; j<col; j++)
				board[i][j]=infile.next(); 

		infile.close(); 
		return board; 		
	}


	static void depthFirstSearch( int[][] swamp, int r, int c, String path )
	{
		// IMPLEMENT THE DFS ALGORITHM IN HERE
		path += "["+r+","+c+"]";
		if(r==0 || r==swamp.length-1 || c==0 || c==swamp[0].length-1)
		{
			System.out.println(path);
			return;
		}
		if(swamp[r-1][c]==1) //North
		{
			swamp[r][c]=-1;
			depthFirstSearch(swamp,r-1,c,path);
			swamp[r-1][c]=1;
		}
		if(swamp[r-1][c+1]==1)//Northeast
		{
			swamp[r][c]=-1;
			depthFirstSearch(swamp,r-1,c+1,path);
			swamp[r-1][c+1]=1;
		}	
		if(swamp[r][c+1]==1)//East
		{
			swamp[r][c]=-1;
			depthFirstSearch(swamp,r,c+1,path);
			swamp[r][c+1]=1;
		}
		if(swamp[r+1][c+1]==1)//Southeast
		{
			swamp[r][c]=-1;
			depthFirstSearch(swamp,r+1,c+1,path);
			swamp[r+1][c+1]=1;
		}
		if(swamp[r+1][c]==1)//South
		{
			swamp[r][c]=-1; 
			depthFirstSearch(swamp,r+1,c,path);
			swamp[r+1][c]=1;
		}
		if(swamp[r+1][c-1]==1)//Southwest
		{
			swamp[r][c]=-1;
			depthFirstSearch(swamp,r+1,c-1,path);
			swamp[r+1][c-1]=1;
		}
		if(swamp[r][c-1]==1)//West
		{
			swamp[r][c]=-1;
			depthFirstSearch(swamp,r,c-1,path);
			swamp[r][c-1]=1;
		}
		if(swamp[r-1][c-1]==1)//Northwest
		{
			swamp[r][c]=-1;
			depthFirstSearch(swamp,r-1,c-1,path);
			swamp[r-1][c-1]=1;
		}
	} // END DFS
}//END CLASS
