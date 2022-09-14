package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount: ");
		double startAmount = in.nextDouble();
		
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble(); 
		
		System.out.println("Win Limit: ");
		double winLimit = in.nextDouble();
		
		double winMin = 1;
		
		while(startAmount>=winMin && startAmount<winLimit) {
			System.out.println("Amount: " + startAmount);
			double win = Math.random();	
			boolean winOutcome = win > 0.5;
			win = Math.round(win);
			if (win==1) {
				startAmount += 1;
			}
				else {
					startAmount -= 1;
				}
			System.out.println("New Amount: " + startAmount + " and Win Outcome: " + winOutcome);
		}
		
		
		
	}

}
