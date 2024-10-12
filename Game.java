import java.util.*;
public class Game 
{
    //Fields of a game
    private final Player p1;
    private final Player p2;
    private final Board b;
    private Player currPlayer;
    public Game(Player p1,Player p2)
    {
        this.p1=p1;
        this.p2=p2;
        b=new Board();
        currPlayer=p1;
    }
    //Method to play the game
    public void play()
    {
        b.print();
        while(!b.isFull() && !b.hasWinner())
        {
            System.out.println(currPlayer.getName()+"'s turn");
            int row=getValidInput("row");
            int col=getValidInput("column");
            try
            {
                b.makeMove(row, col,currPlayer.getSymbol());
                b.print();
                switchPlayer();
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
        }
        if(b.hasWinner())
        {
            switchPlayer();
            currPlayer.updateWin();
            System.out.println(currPlayer.getName()+" wins!");
        }
        else
        {
            System.out.println("The game is a draw!");
        }
    }
    //Method to switch turns for players
    public void switchPlayer()
    {
        currPlayer=currPlayer==p1?p2:p1;
    }
    //Method to a valid box number in a board to play 
    public int getValidInput(String str) {
        while (true)
        {
            // Keep looping until valid input is provided
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter " + str + " number (0, 1, or 2): ");

            if (scanner.hasNextInt()) { // Check if input is a valid integer
                int input = scanner.nextInt(); // Read integer input

                if (input >= 0 && input <= 2) { // Check if input is within range
                    return input; // Return the valid input
                } else {
                    System.out.println("Please enter a number between 0 and 2.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number between 0 and 2.");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}

