package Fruit;

public class GreenApple extends Apple  { 
	private boolean pie;
	
	 public GreenApple(String name, int q, double p, String clr, String t, boolean pie) {
		super(name,q,p,clr,t);
		this.taste = t;
		this.pie = pie;
		
	 }
	 
	 public String toString() {
		  return super.toString() +
				 "\nIs it suitable for making pie? " + this.pie;
	 }
	 
	 public double getTotal() {
		  return super.getTotal();
	 }
	 
}