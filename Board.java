package Main;

public class Board {
    static final int size = 3;
    public char[][] board ;
    public Board() {
        board = new char[size][size]; // Initialize the board array
        initializeBoard();
    }





    public void initializeBoard()
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';

            }

        }

    }
    boolean isBoardFull()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-')
                {
                    return false;



                }



            }


        }

        return true;



    }

    public void UpdateBoard(int row, int col,char mark)
    {
        if (!isBoardFull())
        {
            board[row][col] = mark;
        }

    }





    char checkWin()
    {
        for (int i = 0; i < size; i++) {
            //columns
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-')
            {
                return board[0][i];

            }

            else if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];


            }


        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-')
        {
            return board[0][0];
        }
        else if (board[0][2] == board[1][1] && board[1][1] == board[2][0])
        {
            return board[0][2];
        }
        return 'D';





    }
    public void printBoard()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");

            }
            System.out.println();

        }

    }




}
