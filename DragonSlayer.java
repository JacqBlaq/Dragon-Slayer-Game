package classWork;
/*
 * Jacquelyn Gboyor
 * 7/1/2017
 * Dragon Slayer Game
 */
public class DragonSlayer {

	public static void main(String[] args) {
		//Declare Variables
		boolean slaying = true;
		int youHit = 0;
		int damageThisRound = 0;
		int totalDamage = 0;
		int rounds = 0;
		
		while (slaying){
			youHit = (int)Math.floor(Math.random() * 2);
			damageThisRound = (int)(Math.random() * 5 + 1);
				if(youHit == 1){
					System.out.println("Congrats! You hit the dragon!");
					totalDamage += damageThisRound;
					System.out.println("Total Damage Points: " + totalDamage);
					System.out.println();
					if(totalDamage >= 4){
						System.out.println("You slayed the dragon!");
						slaying = false;
					}//End if
					else if (totalDamage <= 4){
						youHit = (int)Math.floor(Math.random() * 2);
					}//End else
				}//End if
				else if (youHit == 0){
					System.out.println("The dragon defeated you :( ");
				}//End else
			rounds++;
			
		}//End while
		System.out.println("Took you " + rounds + " round(s) to slay the dragon.");
		
		
	}//End main

}//End Class
