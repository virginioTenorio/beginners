package application;

public class Stock {
	
	private int shares;
	private double price;
	private double capital;
	
	
	
	public int getShares() {
		return shares;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void buy(double p, int s) {
		shares += s;
		price = p;
		capital += s * p;
	}
	public void sell(double p, int s) {
		shares -= s;
		price = p;
		capital -= s * p;
	}
   public double getAveragePrice() {
	   return capital / getShares();
   }
}
