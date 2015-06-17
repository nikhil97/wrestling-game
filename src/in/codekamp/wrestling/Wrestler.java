import java.util.*;

public class Wrestler {
	public String name;
	public int rank;
	public double height;
	public double weight;
	private int matchesWon;
	private int matchesLost;
	private int totalMatches;
	
	public Wrestler(String name, int rank, double height, double weight, int matchesWon, int matchesLost) {
		
		this.name = name;
		this.rank = rank;
		this.height = height;
		this.weight = weight;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.totalMatches = matchesWon + matchesLost;
		
	}
	
	public String toString() {
		  return "Name: "+this.name+ "\n1-Rank:"+this.rank + "\n2-Height:"+this.height+" m"+ "\n3-Weight:"+this.weight+" kgs"+" \nMatchesWon:"+this.matchesWon+"\nMatchesLost:"+this.matchesLost+"\nTotalMatches:"+this.totalMatches;
	  }
	
	public int setMatchesWon(int wins) throws Exception {
		if(wins < this.matchesWon) {
			throw new Exception("How come the matches won decrease!");
		}
		this.matchesWon = wins;
		
		this.totalMatches = this.matchesWon + this.matchesLost;
		
		return wins;
	}
	
	public void incrementMatchesWon() {
		this.matchesWon++;
		
		this.totalMatches++;
	} 
	
	public static List<Wrestler> defaultDeck() {
		List<Wrestler> deck = new ArrayList<Wrestler>();
		
		deck.add(new Wrestler("Undertaker", 5, 2.08, 136.0, 1673, 429));
		deck.add(new Wrestler("Hulk Hogan", 6, 1.93, 125.0, 1347, 336));
		deck.add(new Wrestler("HHH", 8, 1.93, 116.0, 990, 850));
		deck.add(new Wrestler("Kane", 9, 2.08, 147.0, 1391, 1192));
		deck.add(new Wrestler("Khali", 10, 2.16, 190.0, 446, 237));
		deck.add(new Wrestler("Seth Rollins", 2, 1.85, 93.0, 431, 537));
		deck.add(new Wrestler("John Cena", 4, 1.85, 114.0,1596 ,359 ));
		deck.add(new Wrestler("Roman Reigns", 1, 1.90, 127.0, 315, 213));
		deck.add(new Wrestler("Dean Ambrose", 3, 1.90, 102.0, 562, 451));
		deck.add(new Wrestler("Brock Lesnar", 7, 1.93, 121.0, 264, 95));
		
		return deck;
	}

	 public  static boolean Play(int choice, Wrestler temp1, Wrestler temp2){
		   boolean result=true;
		 switch(choice)
		 {
		 case 1:if(temp1.rank<temp2.rank)
			          result=true;
			     else
			    	 result= false;
		        break;
		           
		 case 2:if(temp1.height>temp2.height)
			 result= true;
			           
			    else  
			    	result= false;
		 
		     break;
		     
		 case 3: if(temp1.weight>temp2.weight)
			 result= true;
		         else
		        	 result= false;
		 
		         break;
		      
		 default : System.out.println("Please Enter A valid Value ");      
		           break;
		           
		        	   
			 
		 }
	          
		   return result;       
		 }
}
// end of wrestler.......


