package com.vikram.whatfixtest.robotmovement;

public class RobotMovementProblem 
{
    public static void main(String[] args) 
    {
        int grid[][]=new int[4][4];
        System.out.println(countPaths(grid, 0, 0));
    }
    
   
    static int countPaths(int grid[][],int i,int j)
    {

        if ( i < 0 || j < 0 || i >= 4 || j >= 4 ) return 0;
        if ( grid[i][j] == 1 ) return 0;
        if ( i == 3 && j == 3 ) return 1;
        int arr[][]=new int[4][4];
        for(int m=0;m<4;m++)
        {
            for(int n=0;n<4;n++)
            {
                arr[m][n]=grid[m][n];
            }
        }

        arr[i][j] = 1;
        return countPaths(arr, i, j+1) + countPaths(arr, i, j-1) +  countPaths(arr, i+1, j) + countPaths(arr, i-1, j);  
    }
}