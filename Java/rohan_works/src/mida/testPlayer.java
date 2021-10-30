package mida;
import java.util.Scanner;
public class testPlayer {
	Scanner input=new Scanner(System.in);
	String s1;
	int n;
	int g;
	String s2;
	
	Player players[];
	int x=input.nextInt();

 testPlayer(int x) {
	 players=new Player[x];
 }
 void Objcreate() {
 for(int i=0;i<x;i++) {
	 s1=input.nextLine();
	 n=input.nextInt();
	 g=input.nextInt();
	 s2=input.nextLine();
	 players[i]=new Player(s1,n,g,s2);
 }
 
 }
 void printHighest(Player players[]) {
 int max;
 String s9;
 max=0;
 for(int i=1;i<players.length;i++) {
	 if(players[i].getGoals()>players[max].getGoals()) {
		 max=i;
	 }
 }
 s9=players[max].getName();
System.out.println(s9);
}
 
}