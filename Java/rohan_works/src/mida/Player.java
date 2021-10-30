package mida;

public class Player {
 private String name;
 private int number;
 private int goals;
 private String position;
 Player(){
	 name=null;
	 number=1;
	 goals=0;
	 position=null;
 }
 Player(String name,int number){
	 this.name=name;
	 this.number=number;
 }
public Player(String name, int number, int goals, String position) {
	this.name = name;
	this.number = number;
	this.goals = goals;
	this.position = position;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getGoals() {
	return goals;
}
public void setGoals(int goals) {
	this.goals = goals;
}
public String getPosition() {
	return position;
}
 public void setPosition(String position) {
	this.position = position;
 }
 public void addGoals(int goals) {
	this.goals+=goals;
}
public String toString() {
	return "Player [name=" + name + ", number=" + number + ", goals=" + goals + ", position=" + position + "]";
}
}