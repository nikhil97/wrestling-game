import java.util.*;

public class Game {

	public static void main(String[] args) {

		List<Wrestler> wrestlers = Wrestler.defaultDeck();

		Collections.shuffle(wrestlers);

		List<Wrestler> playerOneCards = new ArrayList<Wrestler>();
		List<Wrestler> playerTwoCards = new ArrayList<Wrestler>();

		int index = 0;

		for (Wrestler someWrestler : wrestlers) {
			if (index % 2 == 0) {
				playerOneCards.add(someWrestler);
			} else {
				playerTwoCards.add(someWrestler);
			}
			index++;

		}
		int chance = 0;
		int choice = 0;
		boolean result = true;
		Scanner userInput = new Scanner(System.in);
		int lastIndexOne = 0, lastIndexTwo =0;
		do {

			
			lastIndexOne = playerOneCards.size() - 1;
			Wrestler topCardOfPlayerOne = playerOneCards.get(lastIndexOne);
			lastIndexTwo = playerTwoCards.size() -1;
			Wrestler topCardOfPlayerTwo = playerTwoCards.get(lastIndexTwo);

			if (chance % 2 == 0) {

				

				System.out.println(topCardOfPlayerOne.toString());
				System.out.println("Enter choice");

				userInput.hasNextInt();

				choice = userInput.nextInt();

				System.out.println(topCardOfPlayerTwo.toString());

				result = Wrestler.Play(choice, topCardOfPlayerOne,
						topCardOfPlayerTwo);
				chance++;
			} else {

				System.out.println(topCardOfPlayerTwo.toString());

				userInput.hasNextInt();

				choice = userInput.nextInt();

				System.out.println(topCardOfPlayerOne.toString());

				result = Wrestler.Play(choice, topCardOfPlayerOne,
						topCardOfPlayerTwo);
				chance++;

			}

			if (result == true) {
				System.out.println("PlayerOneWon\n");

				Wrestler removedCard = playerTwoCards.remove(lastIndexTwo);

				playerOneCards.add(removedCard);
				Collections.shuffle(playerOneCards);

			} else {
				System.out.println("PlayerTwoWon\n");

				Wrestler removedCard = playerOneCards.remove(lastIndexOne);

				playerTwoCards.add(removedCard);
				Collections.shuffle(playerTwoCards);
			}

			System.out.println("Do You Wish To Continue\n1-YES\n2=NO");

			int a = 1;
			userInput.hasNextInt();

			a = userInput.nextInt();

			if (a == 1)
				continue;
			else if (a == 2) {
				System.out.println("THANKS FOR PLAYING\n");

				break;
				
			}
			

		} while (playerOneCards.size()!=0 && playerTwoCards.size()!=0);
		if(playerOneCards.size()==0)
			System.out.println("PLAYER 2 HAS ALL CARDS PLAYER 2 WINS ");
		else 
			System.out.println("PLAYER 1 HAS ALL THE CARDS PLAYER 1 WINS ");
		userInput.close();

	}

}
//end of game......