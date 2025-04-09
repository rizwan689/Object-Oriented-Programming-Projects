package Main;



//Step 4: Implement the Game Logic
//Class Game:
//Properties:

//Player player1
//Player player2
//Player currentPlayer
//Methods:
//void start(): Main game loop.
//void switchPlayer(): Switch the current player.
public class Game {
    Board board;
    Player player1;
    Player player2;
    Player currentPlayer;
    public Game(Player player1, Player player2,Player currentplayer)
    {
        board = new Board();

        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = currentplayer;


    }



    public void start()
    {
        board.initializeBoard();
        System.out.println("Game Start!");
        board.printBoard();
      

       
        player1.setMark('X');
        player2.setMark('O');
        while (true)
        {
            System.out.println(player1.getMark() + " make Your Move ! :");
            player1.makeMove(board);
            board.printBoard();
            System.out.println(player2.getMark() + " make Your Move ! :");

            player2.makeMove(board);
            board.printBoard();

            if (CheckGameOver()) {

                break;
                
            }

           
            






        }
      


    }
    private boolean CheckGameOver()
    {
        
        char c = board.checkWin();
        if (c == 'X')
        {
            System.out.println(player1.getMark() + " Wins!");
            return true;


        }
        else if (c == 'O')
        {
            System.out.println(player2.getMark() + " Wins!");
            return true;

        }
        else if (board.isBoardFull()) {
            System.out.println("Its a tie!");
            return true;
        }
        return false;
        

    }
   // private void switchPlayer() {
        //currentPlayer = (currentPlayer == player1) ? player2 : player1;
    //}/





}
