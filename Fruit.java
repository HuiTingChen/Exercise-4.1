package Fruit;

public class Fruit {
	private String name;
	
	public Fruit(String name) {
		this.name = name;		
	    System.out.println(name + " contructor is invoked" );
	}
	
	public String toString() {
		return "Fruit Name         : " + name ; 
	}
}
