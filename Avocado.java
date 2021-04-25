package Fruit;

public class Avocado extends Fruit {
	private double fats;
	private double weight;
	private boolean heart_healthy;
	
	  public Avocado(String name, double f, double w, boolean h) {
		super(name);
		this.fats = f;
		this.weight = w;
		this.heart_healthy = h;
	  }
	  
	  public double getFats() {
		  return this.fats * this.weight;
	  }
	  
	  public String toString() {
		  return super.toString() + 
				 "\nIs avocado contain heart healthy fatty acid? "+ this.heart_healthy;
	  }
}