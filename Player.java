public class Player 
{
    //class to store the name of the palyer with the respective symbol
    private String name;
    private char symbol;
    private int wins;
    public Player(String name,String sym)
    {
        this.name=name;
        symbol=sym.charAt(0);
        wins=0;
    }
    public String getName()
    {
        return name;
    }
    public char getSymbol()
    {
        return symbol;
    }
    public int getWins()
    {
        return wins;
    }
    public void updateWin()
    {
        wins+=1;
    }
}
