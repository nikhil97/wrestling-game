package in.codekamp.wrestling;

public class Game {

	public static void main(String[] args) {

		Wrestler wrestler1 = new Wrestler("Undertaker", 2, 10.5, 100.0, 40, 5);

		System.out.println(wrestler1.toString());
		wrestler1.rank = 5;

		System.out.println(wrestler1.toString());

		Wrestler wrestler2 = new Wrestler("Khali", 5, 12.5, 150.0, 10, 4);

		System.out.println(wrestler2.toString());
		
		try {
			int wins = wrestler2.setMatchesWon(5);
			System.out.println("Matches won = " + wins);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Wrestler[] wrestlers = {wrestler1, wrestler2};

	}

}
