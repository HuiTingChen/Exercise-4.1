package Fruit;

public class Apple extends Fruit {
	private int quantity;
	private double price;
	private String colour;
	public String taste;
	
	  public Apple(String name, int q, double p, String clr, String t) {
		super(name);
		this.quantity = q;
		this.price = p;
		this.colour = clr;
		this.taste = t;
		
	  }
	  
	  public String toString() {
		  return super.toString() + 
				 "\nPrice per piece    : RM" + this.price + "\n" +
				 "Purchase quantity  : " + this.quantity + "\n" + 
				 "Colour             : " + this.colour + "\n" + 
				 "Taste              : " + this.taste;
	  }
	  
	  public double getTotal() {
		  return this.quantity* this.price;
	  }
	  
	}