package Main;
//Step 3: Implement the Players
//Class Player:
//Properties:
//char mark: The mark of the player (e.g., 'X' or 'O').
//Methods:
//int[] makeMove(Board board): Abstract method to be implemented by subclasses.

public abstract class Player {

    protected char mark;
     int  row;
     int column;



    public void setMark(char mark1)
    {
        if (mark1 != 'X' && mark1 != 'O')
        {
            System.out.println("Invalid Prompt! Enter Either X or O ");



        }
        else
        {
            mark = mark1;
        }

    }


    public char getMark()
    {
        return mark;




    }





    public abstract void makeMove(Board board);


}
