package com.company.TicTacToe;

import java.util.Scanner; //https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

public class Game {
    static int A1, A2, A3, B1, B2, B3, C1, C2, C3; // A1 for top left, B1 middle left , C1 down left etc.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String prompt = "Enter your first move(A1 for top left, B1 middle left , C1 down left etc.): "; // prompt for convenience
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
        line = " " + getXO(A1) + "|" + getXO(A2) + "|" + getXO(A3);
        System.out.println(line);
        System.out.println("-------");
        line = " " + getXO(B1) + "|" + getXO(B2) + "|" + getXO(B3);
        System.out.println(line);
        System.out.println("-------");
        line = " " + getXO(C1) + "|" + getXO(C2) + "|" + getXO(C3);
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
        if (play.equalsIgnoreCase("A1") & A1 == 0) // just for reminder https://www.tutorialspoint.com/java/java_string_equalsignorecase.htm
            return true;
        if (play.equalsIgnoreCase("A2") & A2 == 0)
            return true;
        if (play.equalsIgnoreCase("A3") & A3 == 0)
            return true;
        if (play.equalsIgnoreCase("B1") & B1 == 0)
            return true;
        if (play.equalsIgnoreCase("B2") & B2 == 0)
            return true;
        if (play.equalsIgnoreCase("B3") & B3 == 0)
            return true;
        if (play.equalsIgnoreCase("C1") & C1 == 0)
            return true;
        if (play.equalsIgnoreCase("C2") & C2 == 0)
            return true;
        if (play.equalsIgnoreCase("C3") & C3 == 0)
            return true;
        return false;
    }

    public static void updateBoard(String play, int player)
    {
        if (play.equalsIgnoreCase("A1"))
            A1 = player;
        if (play.equalsIgnoreCase("A2"))
            A2 = player;
        if (play.equalsIgnoreCase("A3"))
            A3 = player;
        if (play.equalsIgnoreCase("B1"))
            B1 = player;
        if (play.equalsIgnoreCase("B2"))
            B2 = player;
        if (play.equalsIgnoreCase("B3"))
            B3 = player;
        if (play.equalsIgnoreCase("C1"))
            C1 = player;
        if (play.equalsIgnoreCase("C2"))
            C2 = player;
        if (play.equalsIgnoreCase("C3"))
            C3 = player;
    }

    public static String getComputerMove()
    {
        if (A1 == 0)
            return "A1";
        if (A2 == 0)
            return "A2";
        if (A3 == 0)
            return  "A3";
        if (B1 == 0)
            return  "B1";
        if (B2 == 0)
            return  "B2";
        if (B3 == 0)
            return  "B3";
        if (C1 == 0)
            return  "C1";
        if (C2 == 0)
            return  "C2";
        if (C3 == 0)
            return  "C3";
        return "";
    }


    public static boolean isGameWon() // checks for row won (all possible winning combinationts)
    {
        if (isRowWon(A1, A2, A3))
            return true;
        if (isRowWon(B1, B2, B3))
            return true;
        if (isRowWon(C1, C2, C3))
            return true;
        if (isRowWon(A1, B1, C1))
            return true;
        if (isRowWon(A2, B2, C2))
            return true;
        if (isRowWon(A3, B3, C3))
            return true;
        if (isRowWon(A1, B2, C3))
            return true;
        if (isRowWon(A3, B2, C1))
            return true;
        return false;
    }

    public static boolean isRowWon(int a, int b, int c) // if row is won game is won
    {
        return ((a == b) & (a == c) & (a != 0));
    }





}


