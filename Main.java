import java.util.*;

class Main
{
    //Main class - starting point of execution
    public static void main(String[] args)
    {
        System.out.println("Hello there, Let's play!");
        Scanner input=new Scanner(System.in);
        //Get details of players
        System.out.println("Enter the name of player 1:");
        String name_p1=input.nextLine();
        System.out.println("Enter your symbol:");
        String symbol_p1=input.nextLine();
        System.out.println("Enter the name of player 2:");
        String name_p2=input.nextLine();
        System.out.println("Enter your symbol:");
        String symbol_p2=input.nextLine();
        //Initialize two players
        Player p1=new Player(name_p1,symbol_p1);
        Player p2=new Player(name_p2,symbol_p2);
        int total_game=0;
        while(true)
        {
            total_game++;
            //Initialize a new game
            Game g=new Game(p1,p2);
            //Start the game
            g.play();
            System.out.println("Play again? Yes/No");
            String in=input.nextLine();
            if(in.equalsIgnoreCase("no"))
            {
                System.out.println("Results");
                System.out.println(p1.getName()+" "+p1.getWins()+"/"+total_game);
                System.out.println(p2.getName()+" "+p2.getWins()+"/"+total_game);
                if(p1.getWins()>p2.getWins())
                {
                    System.out.println(p1.getName()+" leads!");
                }
                else if(p1.getWins()<p2.getWins())
                {
                    System.out.println(p2.getName()+" leads!");
                }
                else
                {
                    System.out.println("Neither side could pull ahead");
                }
                System.out.println("See you soon, Have a good day!");
                return;
            }
        }
        
    }
}
