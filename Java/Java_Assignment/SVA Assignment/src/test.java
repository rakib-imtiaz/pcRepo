
public class test {
	public static void main(String[] args) {
		
		
		Apple appleObj_1 = new Apple();
		appleObj_1.setColor("red");
		appleObj_1.setSeed("brown");
		appleObj_1.setVarieties("Cider");
		appleObj_1.setSeason("Winter");
		
		
		Apple appleObj_2 = new Apple();
		appleObj_2.setColor("red");
		appleObj_2.setSeed("brown");
		appleObj_2.setVarieties("Cooking");
		appleObj_2.setSeason("Winter");
		
		Apple appleObj_3 = new Apple();
		appleObj_3.setColor("red");
		appleObj_3.setSeed("brown");
		appleObj_3.setVarieties("Dessert");
		appleObj_3.setSeason("Winter");
		
		
		Mango mangoObj_4 = new Mango();
		mangoObj_4.setColor("yellow");
		mangoObj_4.setSeed("brown");
		mangoObj_4.setPropagation("grafting");
		mangoObj_4.setSeason("Summer");
		
		Mango mangoObj_5 = new Mango();
		mangoObj_5.setColor("yellow");
		mangoObj_5.setSeed("brown");
		mangoObj_5.setPropagation("budding");
		mangoObj_5.setSeason("Summer");
		
		
		
		
		
		Fruit []  fruitArray = new Fruit[10];
		
		fruitArray[0]=appleObj_1;
		fruitArray[1]=appleObj_2;
		fruitArray[2]=appleObj_3;
		fruitArray[3]=mangoObj_4;
		fruitArray[4]=mangoObj_5;
		
		
		for(int i=0;i<5;i++)
		{
			
			
			System.out.println(fruitArray[i]);
			
			
		}
		
		
		
		
		
		
		
	}

}
