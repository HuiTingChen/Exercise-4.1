package Fruit;

public class RedApple extends Apple  { 
	private boolean sugar;
	
	  public RedApple(String name, int q, double p, String clr, String t, boolean s) {
		super(name,q,p,clr,t);
		this.sugar = s;
	  }
	  

	  public String toString() {
		  return super.toString() +
				 "\nIs red apple has higher sugar level compare to green apple? " + this.sugar;
	 }
		 
	  public double getTotal() {
		  return super.getTotal();
	  }
	  
}