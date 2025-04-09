package Main;

import java.util.Scanner;

public class HumanPlayer extends Player{
    Scanner scanner = new Scanner(System.in);



    @Override
    public void makeMove(Board Table) {
        while (true) {
            int correct_row = 0,correct_col = 0;

            System.out.println("Enter the row : ");
            row = scanner.nextInt();
            System.out.println("Enter the column : ");
            column = scanner.nextInt();
            if ((row != 0) && (row > 2))
            {
                if (column!= 0 && column > 2) {
                    System.out.println("Invalid Prompt! enter the values again !");

                }





            }
            else {

                if ((Table.board[row][column] == '-'))
                {
                    correct_col = column;
                    correct_row = row;
                    Table.UpdateBoard(correct_row, correct_col, 'X');
                    break;

                }
                else {
                    System.out.println("Already Occupied! enter different row & col !");

                }
            }







        }
    }



       


    }
  

