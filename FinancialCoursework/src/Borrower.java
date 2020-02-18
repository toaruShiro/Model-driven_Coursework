import java.util.List;
import java.util.Vector;


public class Borrower implements SystemTypes {
	
	private double L = 0; // internal
	private double p = 0; // of Sector

	public Borrower() {
		L = 0;
		p = 0;
	}
	
	public void setL(double l){
		L = l;
	}
	
	public double getL(){
		return L;
	}
	
	public void setp(double p0){
		p = p0;
	}
	
	public double getp(){
		return p;
	}

}
