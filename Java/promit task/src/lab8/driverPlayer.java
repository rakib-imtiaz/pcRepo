package lab8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class driverPlayer {

	public static void main(String[] args) {
		System.out.println("sds");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		Player players[] = new Player[size];

		Player p;
		String name;
		int score;
		for (int i = 0; i < size; i++) {
			name = scan.nextLine();
			score = scan.nextInt();

			p = new Player(name, score);

			players[i] = p;
		}
		
		Arrays.sort(players);
		for (int i = 0; i < size; i++) {
			
			System.out.println(players[i].getScore());
		}

	}
	
}
