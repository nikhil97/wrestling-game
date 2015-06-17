import java.util.*;


public class Game {

	public static void main(String[] args) {
		
		
		List<Wrestler> wrestlers = Wrestler.defaultDeck();
		
		Collections.shuffle(wrestlers);
		
		List<Wrestler> playerOneCards = new ArrayList<Wrestler>();
		List<Wrestler> playerTwoCards = new ArrayList<Wrestler>();
		
		int index = 0;
		
		for(Wrestler someWrestler : wrestlers){
			if(index%2 ==0){
				playerOneCards.add(someWrestler);
			}else{
				playerTwoCards.add(someWrestler);
			}
			index++;
			
		 	
	}     int chance=0;
	      int choice=0;
	      boolean result=true;
	      Scanner userInput=new Scanner(System.in);
	      int lastIndex=0;
		do{
		    
		    
		   
		   if(chance%2==0){
		    
		     lastIndex = playerOneCards.size()-1;
		    
		    Wrestler topCardOfPlayerOne = playerOneCards.get(lastIndex);
		    
		    System.out.println(playerOneCards.get(lastIndex).toString());
		
		     
		     
		     
		     
		     userInput.hasNextInt();
		     
		     choice=userInput.nextInt();
		     
		     System.out.println(playerTwoCards.get(lastIndex).toString());
		     
		     
		
		     result = Wrestler.Play(choice,playerOneCards.get(lastIndex),playerTwoCards.get(lastIndex));
		     chance++;
		     }
		   else 
		   {  lastIndex = playerTwoCards.size()-1;
		    
		    Wrestler topCardOfPlayerTwo = playerTwoCards.get(lastIndex);
		    
		    System.out.println(playerTwoCards.get(lastIndex).toString());
		
		     
		     
		    
		     
		     userInput.hasNextInt();
		     
		     choice=userInput.nextInt();
		     
		     System.out.println(playerOneCards.get(lastIndex).toString());
		     
		     
		
		     result = Wrestler.Play(choice,playerOneCards.get(lastIndex),playerTwoCards.get(lastIndex));
		     chance++;
			   
		      }
		
		if(result==true){
			System.out.println("PlayerOneWon\n");
			
			Wrestler removedCard = playerTwoCards.remove(lastIndex);
			
			playerOneCards.add(removedCard);
			Collections.shuffle(playerOneCards);
			
		    }
		else
		   {
			System.out.println("PlayerTwoWon\n");
		
		   Wrestler removedCard = playerOneCards.remove(lastIndex);
		
		   playerTwoCards.add(removedCard);
		   Collections.shuffle(playerTwoCards);
		   }
		   
		  
		   
		   System.out.println("Do You Wish To Continue\n1-YES\n2=NO");
		   
		    int a=1;
		     userInput.hasNextInt(); 
		     
		     a=userInput.nextInt();
		     
		 if(a==1)
			 continue;
		 else if(a==2)
		 {
			 System.out.println("THANKS FOR PLAYING\n");
			 
			 break;
		 }
			   
			 
			 
		
   }while(true);
	
	}
	
}
