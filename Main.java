package Fruit;

public class Main {
public static void main(String[] args) {
		
		Fruit objFruit = new Fruit("Fruit");
		System.out.println(objFruit.toString());
		
		System.out.println();
		Apple objApple = new Apple("Apple", 25,2, "red & green", "sweet");	
		System.out.println(objApple);
		
		System.out.println();
		System.out.println("___________Green Apple___________");
		GreenApple objGApple = new GreenApple("Granny Smith", 25,1.5,"green","sour", true);	
		System.out.println(objGApple);
		System.out.println("Total Price        : RM" + objGApple.getTotal());
	
		System.out.println();
		System.out.println("____________Red Apple____________");
		RedApple objRApple = new RedApple("Fuji", 20,2,"red","sweet", true);	
		System.out.println(objRApple);
		System.out.println("Total Price        : RM" + objRApple.getTotal());
		
		
		System.out.println();
		System.out.println("______________Lemon______________");
		Lemon objLemon = new Lemon("Lemon", 0.53, 100, true);
		System.out.println(objLemon);
		System.out.println("Vitamin C (mg)     : "+ objLemon.vitaminC());
		
		
		System.out.println();
		System.out.println("______________Avocado_____________");
		Avocado objAvocado = new Avocado("Avocado", 0.15, 100, true);
		System.out.println(objAvocado);
		System.out.println("Fat Amount (g)     : "+ objAvocado.getFats());
		
	}
}