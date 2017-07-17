package marolt.it.services;

public class CDService {

	double price;
	double percentage;
	
	public void setPrice(double price) {
		this.price = price;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	// Ultimative BusinessLogic
	public double calcPercentage()
	{
		double zahl = percent2Double(this.percentage);
		return multiply(this.price, zahl);
	}
	
	

	// Methoden af
	
	public double multiply(double a, double b){
		return a*b;
	}
	
	public double percent2Double(double percent) {
		return percent/100;
	}	
	
	
}
