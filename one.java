import java.util.Random;
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		
		int player=0;
		int player_start=0;
		int dealer=0;
		int go=0;
		int hd=0;
		int dealer_total=0;
		int dc=0;
		String play="";
		
		
		
		Random card=new Random();
	    while(true) {
		System.out.println("Welcome to the simplified blackjack game!");
		player_start=2+card.nextInt(10);
		player=2+card.nextInt(10);
		System.out.println("You get a " + player + " and a " +player_start + ".");
		int total=player+player_start;
		System.out.println("Your total is " +total+".") ;
		if(total==21)
		{
			System.out.println("YOU WIN!");
			break;
		}
		
		dealer=2+card.nextInt(10);
		System.out.println("");
		System.out.println("The dealer has a " + dealer + " showing, and a hidden card.");
		hd=2+card.nextInt(10);
		dealer_total=dealer+hd;
		System.out.println("");
		System.out.println("Would you like to <<hit>> or <<stay>>?");
		play=keyboard.next();
		if(play.equals("hit"))
		{
			
			while(play.equals("hit"))
			{
			go=2+card.nextInt(10);
			System.out.println("You drew a " + go + ".");
			total=total+go;
			System.out.println("Your total is "+total+".");
			if(total>21)
			{
				System.out.println("DEALER WINS!");
				break;
			}
			if(total==21)
			{
				System.out.println("YOU WIN!");
				break;
			}
			
			System.out.println("Would you like to <<hit>> or <<stay>>?"); 
			play=keyboard.next();
			if(play=="stay")
			{
			   break ;
			} } 
		
		}
		
		 if(play.equals("stay"))
			{
			    while(true) {
			    System.out.println("");
			    System.out.println("OK, dealer is playing.");
			    System.out.println("His hidden card was "+hd+".");
			    System.out.println("Dealer total is "+dealer_total+".");
			    if(dealer_total>16)
			    {
			    	System.out.println("Dealer stays.");
			    	break ;
			    }
			    else {
			    	while(dealer_total<=16)
			    	{
			    		System.out.println("");
			    		System.out.println("Dealer choses to hit");
			    	    dc=2+card.nextInt(10);
			    	    System.out.println("He draws a " +dc+ ".");
			    	    dealer_total=dealer_total+dc;
			    	    System.out.println("His total is " +dealer_total+ ".");
			    	    if(total>=22)
			    	    {
			    	    	System.out.println("YOU WIN!");
			    	    	break;
			    	    }
			    	} 	
			    }
			    break ;
			      }
			    
			    
			    	System.out.println("");
			    	if(dealer_total<=21)
			    	{
					System.out.println("Dealer total is " +dealer_total+ ".");
					System.out.println("Your total is "+total+"."); }
					if(dealer_total>21)
					{
						System.out.println("YOU WIN!");
						break;
					}
					if(dealer_total>=total)
					{
						System.out.println("DEALER WINS!");
						break;
					}
					else if(total>dealer_total)
					{
						System.out.println("YOU WIN!");
						break;
					} 
				    }
				break ;}
			 } 
	    }
			    



