package Fruit;

public class Lemon extends Fruit {
	private double vitaminC;
	private double weight;
	private boolean compare;
	
	  public Lemon(String name, double c, double w, boolean compare) {
		super(name);
		this.vitaminC = c;
		this.weight = w;
		this.compare = compare;
	  }
	  
	  public double vitaminC() {
		  return this.vitaminC * this.weight;
	  }
	  
	  public String toString() {
		  return super.toString() + 
				 "\n\"Is lemon has higher vitamin C? " + this.compare;
	  }
}