package exm;

import java.util.Scanner;

public class testPlayer {
	Scanner input = new Scanner(System.in);
	Player players[];
	String s = null;
	String so = null;
	double t = 0;
	double a = 0;
	int x = input.nextInt();

	testPlayer(int x) {
		players = new Player[x];
	}

	void create() {
		for (int i = 0; i < players.length; i++) {
			s = input.nextLine();
			so = input.nextLine();
			t = input.nextDouble();
			a = input.nextDouble();
			players[i] = new Player(s, t, a, so);
		}
	}

	public void lowest(Player players[]) {
		int max = 0;
		for (int i = 1; i < players.length; i++) {
			if (players[i].getTime() < players[max].getTime()) {
				max = i;
			}
		}
		System.out.println(players[max].getName());
	}

}