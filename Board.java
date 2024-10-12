public class Board 
{
    private final char[][] board;
    private int count;
    //initailize the play board
    public Board()
    {
        board=new char[3][3];
        initializeBoard();
    }
    private void initializeBoard()
    {
        for(char[] arr:board)
        {
            for(int i=0;i<3;i++)
            {
                arr[i]='?';
            }
        }
        count=0;
    }
    //Method to print the board
    public void print()
    {
        for(int j=0;j<3;j++)
        {
            for(int i=0;i<3;i++)
            {
                if(i==1) System.out.print(" "+'|'+" "+board[j][i]+" "+'|'+" ");
                else System.out.print(board[j][i]);
            }
            System.out.println();
        }
    }
    //Method to check it is a valid move
    public void makeMove(int row,int col,char symbol)
    {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '?') {
            throw new IllegalArgumentException("Invalid move!");
        }
        board[row][col] = symbol;
        count++;
    }
    //check if all boxes are full, if boxes are filled, it cannot be played further
    public boolean isFull()
    {
        return count==9;
    }
    //Method to check if any one of the winning condition is met
    public boolean hasWinner()
    {
        //check rows
        for(int i=0;i<3;i++)
        {
            if(board[i][0]!='?' && board[i][0]==board[i][1] && board[i][1]==board[i][2])
            {
                return true;
            }
        }
        //check columns
        for(int i=0;i<3;i++)
        {
            if(board[0][i]!='?' && board[0][i]==board[1][i] && board[1][i]==board[2][i])
            {
                return true;
            }
        }
        //check two diagonals
        if(board[0][0]!='?' && board[0][0]==board[1][1] && board[1][1]==board[2][2])
        {
            return true;
        }
        if(board[2][0]!='?' && board[2][0]==board[1][1] && board[1][1]==board[0][2])
        {
            return true;
        }
        return false;
    }
}
