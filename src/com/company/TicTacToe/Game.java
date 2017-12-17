package com.company.TicTacToe;

import java.util.Scanner; //https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

public class Game {
    static int T1, T2, T3, M1, M2, M3, D1, D2, D3; // T1 for top left, M1 middle left , D1 down left etc.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String prompt = "Enter your first move(T1 for top left, M1 middle left , D1 down left etc.): "; // prompt for convenience
        String humanMove = "";
        String computerMove = "";
        boolean gameIsWon = false; // initial state

        for (int i = 1; i <10; i++)  //Because we have 3x3 board , we only have 9 moves
        {
            humanMove = getMove(prompt);
            updateBoard(humanMove, 1);
            displayBoard();
            if (isGameWon())
            {
                System.out.println("Player wins");
                gameIsWon = true;
                break;
            }


            if (i < 9)
            {
                computerMove = getComputerMove();
                System.out.println("Computer placed at" + computerMove);
                updateBoard(computerMove, 2);
                displayBoard();
                if (isGameWon())
                {
                    System.out.println("Computer win");
                    gameIsWon = true;
                    break;
                }
                prompt = "Enter your next move: ";
                i++;
            }
        }

        if (!gameIsWon)
            System.out.println("Draw");
    }

    public static void displayBoard(){ // drawing a board

        String line = "";
        System.out.println();
        line = " " + getXO(T1) + "|" + getXO(T2) + "|" + getXO(T3);
        System.out.println(line);
        System.out.println("-------");
        line = " " + getXO(M1) + "|" + getXO(M2) + "|" + getXO(M3);
        System.out.println(line);
        System.out.println("-------");
        line = " " + getXO(D1) + "|" + getXO(D2) + "|" + getXO(D3);
        System.out.println(line);
        System.out.println();
    }
// 0 for an empty square , 1 for X, 2 for O
    public static String getXO(int square) // player will be playing with X, computer with O
    {
        if (square == 1)
            return "X";
        if (square == 2)
            return "O";
        return " ";
    }

    public static String getMove(String prompt) // for occupied spaces , returnes invalid play
    {
        String move;
        System.out.print(prompt);
        move = sc.nextLine();
        if (!isValidPlay(move))
        {
            System.out.println("It is not a valid play.");
        }
        while (!isValidPlay(move)) {
            move = sc.nextLine();
            if (!isValidPlay(move)) {
                System.out.println("It is not a valid play.");
            }
        }
        return move;
    }

    public static boolean isValidPlay(String play)
    {
        if (play.equalsIgnoreCase("T1") & T1 == 0) // just for reminder https://www.tutorialspoint.com/java/java_string_equalsignorecase.htm
            return true;
        if (play.equalsIgnoreCase("T2") & T2 == 0)
            return true;
        if (play.equalsIgnoreCase("T3") & T3 == 0)
            return true;
        if (play.equalsIgnoreCase("M1") & M1 == 0)
            return true;
        if (play.equalsIgnoreCase("M2") & M2 == 0)
            return true;
        if (play.equalsIgnoreCase("M3") & M3 == 0)
            return true;
        if (play.equalsIgnoreCase("D1") & D1 == 0)
            return true;
        if (play.equalsIgnoreCase("D2") & D2 == 0)
            return true;
        if (play.equalsIgnoreCase("D3") & D3 == 0)
            return true;
        return false;
    }

    public static void updateBoard(String play, int player)
    {
        if (play.equalsIgnoreCase("T1"))
            T1 = player;
        if (play.equalsIgnoreCase("T2"))
            T2 = player;
        if (play.equalsIgnoreCase("T3"))
            T3 = player;
        if (play.equalsIgnoreCase("M1"))
            M1 = player;
        if (play.equalsIgnoreCase("M2"))
            M2 = player;
        if (play.equalsIgnoreCase("M3"))
            M3 = player;
        if (play.equalsIgnoreCase("D1"))
            D1 = player;
        if (play.equalsIgnoreCase("D2"))
            D2 = player;
        if (play.equalsIgnoreCase("D3"))
            D3 = player;
    }

    public static String getComputerMove()
    {
        if (T1 == 0)
            return "T1";
        if (T2 == 0)
            return "T2";
        if (T3 == 0)
            return  "T3";
        if (M1 == 0)
            return  "M1";
        if (M2 == 0)
            return  "M2";
        if (M3 == 0)
            return  "M3";
        if (D1 == 0)
            return  "D1";
        if (D2 == 0)
            return  "D2";
        if (D3 == 0)
            return  "D3";
        return "";
    }


    public static boolean isGameWon() // checks for row won (all possible winning combinationts)
    {
        if (isRowWon(T1, T2, T3))
            return true;
        if (isRowWon(M1, M2, M3))
            return true;
        if (isRowWon(D1, D2, D3))
            return true;
        if (isRowWon(T1, M1, D1))
            return true;
        if (isRowWon(T2, M2, D2))
            return true;
        if (isRowWon(T3, M3, D3))
            return true;
        if (isRowWon(T1, M2, D3))
            return true;
        if (isRowWon(T3, M2, D1))
            return true;
        return false;
    }

    public static boolean isRowWon(int a, int b, int c) // if row is won game is won
    {
        return ((a == b) & (a == c) & (a != 0));
    }





}


