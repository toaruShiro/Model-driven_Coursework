import java.util.List;
import java.util.Vector;

class Sector implements SystemTypes

{

	private String name = ""; // internal
	private int n = 0; // internal
	private double p = 0; // internal
	private double q = 0; // internal
	private double L = 0; // internal
	private float mu = 0; // internal
	
	private double rc = 0;
	
	private List borrowers = new Vector(); // of BorrowerInSector

	public Sector() {
		this.name = "";
		this.n = 0;
		this.p = 0;
		this.q = 0;
		this.L = 0;
		this.mu = 0;

	}

	public String toString() {
		String _res_ = "(Sector) ";
		_res_ = _res_ + name + ",";
		_res_ = _res_ + n + ",";
		_res_ = _res_ + p + ",";
		_res_ = _res_ + q + ",";
		_res_ = _res_ + L + ",";
		_res_ = _res_ + mu;
		return _res_;
	}

	public void setname(String name_x) {
		name = name_x;
	}

	public static void setAllname(List sectors, String val) {
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			Controller.inst().setname(sectorx, val);
		}
	}

	public void setn(int n_x) {
		n = n_x;
	}

	public static void setAlln(List sectors, int val) {
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			Controller.inst().setn(sectorx, val);
		}
	}

	public void setp(double p_x) {
		p = p_x;
	}

	public static void setAllp(List sectors, double val) {
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			Controller.inst().setp(sectorx, val);
		}
	}

	public void setq(double q_x) {
		q = q_x;
	}

	public static void setAllq(List sectors, double val) {
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			Controller.inst().setq(sectorx, val);
		}
	}

	public void setL(int L_x) {
		L = L_x;
	}

	public static void setAllL(List sectors, int val) {
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			Controller.inst().setL(sectorx, val);
		}
	}

	public void setmu(float mu_x) {
		mu = mu_x;
	}

	public static void setAllmu(List sectors, float val) {
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			Controller.inst().setmu(sectorx, val);
		}
	}
	
	public void addborrowers(BorrowerInSector bisxx) {
		borrowers.add(bisxx);
	}
	
	public List getborrowers() {
		return borrowers;
	}
	

	public String getname() {
		return name;
	}

	public static List getAllname(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			if (result.contains(sectorx.getname())) {
			} else {
				result.add(sectorx.getname());
			}
		}
		return result;
	}

	public static List getAllOrderedname(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			result.add(sectorx.getname());
		}
		return result;
	}

	public int getn() {
		return n;
	}

	public static List getAlln(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			if (result.contains(new Integer(sectorx.getn()))) {
			} else {
				result.add(new Integer(sectorx.getn()));
			}
		}
		return result;
	}

	public static List getAllOrderedn(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			result.add(new Integer(sectorx.getn()));
		}
		return result;
	}

	public double getp() {
		return p;
	}

	public static List getAllp(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			if (result.contains(new Double(sectorx.getp()))) {
			} else {
				result.add(new Double(sectorx.getp()));
			}
		}
		return result;
	}

	public static List getAllOrderedp(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			result.add(new Double(sectorx.getp()));
		}
		return result;
	}

	public double getq() {
		return q;
	}

	public static List getAllq(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			if (result.contains(new Double(sectorx.getq()))) {
			} else {
				result.add(new Double(sectorx.getq()));
			}
		}
		return result;
	}

	public static List getAllOrderedq(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			result.add(new Double(sectorx.getq()));
		}
		return result;
	}

	public double getL() {
		return L;
	}
	
	public void InitMu(){
		float mu0 = 0;
		float temp = 1;
		for(int i = 0; i < borrowers.size(); i++){
			BorrowerInSector bi = (BorrowerInSector)(borrowers.get(i));
			temp *= (1 - bi.getborrower().getp());
		}
		
		mu0 = 1 - temp;
		mu = mu0;
	}
	
	//µk = 1 - (1 - pk)^nk
	//pk = 1 - (1 - uk)^1/n
	public void InitP(){
		float temp = 0;
		temp = (float)Math.pow((1 - mu), ( 1 / (float)n ));
		System.out.println("temp: " + temp + " float: " + ( 1 / (float)n ));
		p = 1 - temp;
	}
	
	public void InitL(){
		for(int i = 0; i < borrowers.size(); i++){
			BorrowerInSector bi = (BorrowerInSector)(borrowers.get(i));
			double li = bi.getborrower().getL();
			li *= bi.getomega();
			li *= bi.gettheta();
			L += li;
		}
	}
	
	public void InitRc(){
		
		
	}

	public static List getAllL(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			if (result.contains(new Double(sectorx.getL()))) {
			} else {
				result.add(new Double(sectorx.getL()));
			}
		}
		return result;
	}

	public static List getAllOrderedL(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			result.add(new Double(sectorx.getL()));
		}
		return result;
	}

	public double getmu() {
		return mu;
	}

	public static List getAllmu(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			if (result.contains(new Double(sectorx.getmu()))) {
			} else {
				result.add(new Double(sectorx.getmu()));
			}
		}
		return result;
	}

	public static List getAllOrderedmu(List sectors) {
		List result = new Vector();
		for (int i = 0; i < sectors.size(); i++) {
			Sector sectorx = (Sector) sectors.get(i);
			result.add(new Double(sectorx.getmu()));
		}
		return result;
	}

	public double nocontagion(int m) {
		double result = 0;
		Object cached_result = nocontagion_cache.get(new Integer(m));
		if (cached_result != null) {
			result = ((Double) cached_result).doubleValue();
			return result;
		} else {
			result = Math.pow((1 - p), n - m) * Math.pow(p, m)
					* Math.pow((1 - q), m * (n - m));

			nocontagion_cache.put(new Integer(m), new Double(result));
		}
		return result;
	}

	public double contagion(int i, int m) {
		double result = 0;

		result = Math.pow((1 - p), n - i) * Math.pow(p, i)
				* Math.pow((1 - q), i * (n - m))
				* Math.pow((1 - Math.pow((1 - q), i)), m - i)
				* StatFunc.comb(m, i);
		return result;
	}

	private java.util.Map nocontagion_cache = new java.util.HashMap();

}