package com.ajay.Backtracking;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args){
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][] path=new int[board.length][board[0].length];
        allpathsPrint(0,0,"",board,path,1);

    }
    static void allpaths(int r,int c,String p,boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);

            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            allpaths(r+1,c,p+'D',maze);

        }
        if(c<maze[0].length-1){
            allpaths(r,c+1,p+'R',maze);

        }
        if(r>0){
            allpaths(r-1,c,p+'U',maze);
        }
        if(c>0){
            allpaths(r,c-1,p+'L',maze);
        }
        maze[r][c]=true;
    }
    static void allpathsPrint(int r,int c,String p,boolean[][] maze,int[][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            allpathsPrint(r+1,c,p+'D',maze,path,step+1);

        }
        if(c<maze[0].length-1){
            allpathsPrint(r,c+1,p+'R',maze,path,step+1);

        }
        if(r>0){
            allpathsPrint(r-1,c,p+'U',maze,path,step+1);
        }
        if(c>0){
            allpathsPrint(r,c-1,p+'L',maze,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;

    }
}
