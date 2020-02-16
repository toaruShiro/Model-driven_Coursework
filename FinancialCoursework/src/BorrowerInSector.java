
public class BorrowerInSector implements SystemTypes {
	private double theta = 0;
	private double omega = 0;
	private Borrower borrower = new Borrower();
	
	public BorrowerInSector() {
		theta = 0;
		omega = 0;
	}
	
	public void settheta(double theta0){
		theta = theta0;
	}
	
	public void setomega(double omega0){
		omega = omega0;
	}
	
	public void setborrower(Borrower borrower0){
		borrower = borrower0;
	}

}
