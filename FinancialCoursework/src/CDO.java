import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class CDO implements SystemTypes {

	private double ps0 = 0; // internal
	private List<Sector> sectors = new Vector(); // of Sector
	private List<String> borrowerList = new ArrayList<String>();
	
	public CDO() {
		this.ps0 = 0;

	}
	
	public List<String> getBorrowerList() {
		return borrowerList;
	}
	
	public void addBorrower(String name) {
		borrowerList.add(name);
	}

	public void setBorrowerList(List<String> borrowerList) {
		this.borrowerList = borrowerList;
	}

	public String toString() {
		String _res_ = "(CDO) ";
		_res_ = _res_ + ps0;
		return _res_;
	}

	public void setps0(double ps0_x) {
		ps0 = ps0_x;
	}

	public static void setAllps0(List cdos, double val) {
		for (int i = 0; i < cdos.size(); i++) {
			CDO cdox = (CDO) cdos.get(i);
			Controller.inst().setps0(cdox, val);
		}
	}

	public void setsectors(List sectorsxx) {
		sectors = sectorsxx;
	}

	public void setsectors(int ind_x, Sector sectorsxx) {
		sectors.set(ind_x, sectorsxx);
	}

	public void addsectors(Sector sectorsxx) {
		sectors.add(sectorsxx);
	}

	public void removesectors(Sector sectorsxx) {
		Vector _removedsectorssectorsxx = new Vector();
		_removedsectorssectorsxx.add(sectorsxx);
		sectors.removeAll(_removedsectorssectorsxx);
	}

	public static void setAllsectors(List cdos, List _val) {
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox = (CDO) cdos.get(_i);
			Controller.inst().setsectors(cdox, _val);
		}
	}

	public static void setAllsectors(List cdos, int _ind, Sector _val) {
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox = (CDO) cdos.get(_i);
			Controller.inst().setsectors(cdox, _ind, _val);
		}
	}

	public static void addAllsectors(List cdos, Sector _val) {
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox = (CDO) cdos.get(_i);
			Controller.inst().addsectors(cdox, _val);
		}
	}

	public static void removeAllsectors(List cdos, Sector _val) {
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox = (CDO) cdos.get(_i);
			Controller.inst().removesectors(cdox, _val);
		}
	}

	public static void unionAllsectors(List cdos, List _val) {
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox = (CDO) cdos.get(_i);
			Controller.inst().unionsectors(cdox, _val);
		}
	}

	public static void subtractAllsectors(List cdos, List _val) {
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox = (CDO) cdos.get(_i);
			Controller.inst().subtractsectors(cdox, _val);
		}
	}

	public double getps0() {
		return ps0;
	}

	public static List getAllps0(List cdos) {
		List result = new Vector();
		for (int i = 0; i < cdos.size(); i++) {
			CDO cdox = (CDO) cdos.get(i);
			if (result.contains(new Double(cdox.getps0()))) {
			} else {
				result.add(new Double(cdox.getps0()));
			}
		}
		return result;
	}

	public static List getAllOrderedps0(List cdos) {
		List result = new Vector();
		for (int i = 0; i < cdos.size(); i++) {
			CDO cdox = (CDO) cdos.get(i);
			result.add(new Double(cdox.getps0()));
		}
		return result;
	}

	public List getsectors() {
		return (Vector) ((Vector) sectors).clone();
	}

	public static List getAllsectors(List cdos) {
		List result = new Vector();
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox = (CDO) cdos.get(_i);
			result = Set.union(result, cdox.getsectors());
		}
		return result;
	}

	public static List getAllOrderedsectors(List cdos) {
		List result = new Vector();
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox = (CDO) cdos.get(_i);
			result.addAll(cdox.getsectors());
		}
		return result;
	}

	public double nocontagion(int k, int m) {
		double result = 0;

		result = Math.pow((1 - ((Sector) sectors.get(k - 1)).getp()),
				((Sector) sectors.get(k - 1)).getn() - m)
				* Math.pow(((Sector) sectors.get(k - 1)).getp(), m)
				* Math.pow((1 - ((Sector) sectors.get(k - 1)).getq()), m
						* (((Sector) sectors.get(k - 1)).getn() - m));
		return result;
	}

	public double P(int k, int m) {
		double result = 0;

		result = StatFunc.comb(((Sector) sectors.get(k - 1)).getn(), m)
				* (((Sector) sectors.get(k - 1)).nocontagion(m) + Set
						.sumdouble(Set.collect_0(Set.integerSubrange(1, m - 1),
								this, k, m)));
		return result;
	}

	public double PCond(int k, int m) {
		double result = 0;

		if (m >= 1) {
			result = this.P(k, m)
					/ ((Sector) sectors.get(k - 1)).getmu();
		} else if (m < 1) {
			result = 0;

		}
		return result;
	}

	public int maxfails(int k, double s) {
		int result = 0;

		if (((Sector) sectors.get(k - 1)).getn() <= (s / ((Sector) sectors.get(k - 1)).getL())) {
			
			result = ((Sector) sectors.get(k - 1)).getn();

		} else if (((Sector) sectors.get(k - 1)).getn() > (s / ((Sector) sectors
				.get(k - 1)).getL())) {
			result = (int)(s / ((Sector) sectors.get(k - 1)).getL());

		}
		return result;
	}

	public double PS(int s) {
		double result = 0;
		//获取PS_cache中key为s的值
		Object cached_result = PS_cache.get(new Double(s));
		if (cached_result != null) { //能取到该值
			result = ((Double) cached_result).doubleValue();
			System.out.println("s: " + s + "result: " + result);
			return result;
		} else { //不能取到该值(未put过)
			
			if (s < 0) {
				result = 0;
				System.out.println("s < 0: " + s);
			} else if (s == 0) { //当key s为0时put p0
				result = ps0;

			} else if (s > 0) { //当key大于0时，put (1.0/s)*Integer.Sum(1,sectors.size,k,vs(s,k))) 
				                               //k从1到sectors.size,所有vs(s,k)的和
				                               //即(所有sector中vs(s,k)的和) / s
				result = Set.sumdouble(Set.collect_1(Set.integerSubrange(1, sectors.size()), this, s)) / s;				
			}
			PS_cache.put(new Integer(s), new Double(result));
		}
		return result;
	}

	/*
	 CDO::
     query vs(s : int, k : int) : double
     pre: s >= 0
     post:
     Lk = sectors[k].L &
     result = Integer.Sum(1,(s/Lk)->floor(),mk,sectors[k].vsk(mk)*ps(s-mk*Lk))
    */
	public double VS(int k, double s) {
		double result = 0;
		result = Set.sumdouble( //求和
				     Set.collect_2(
				    		 Set.integerSubrange(1, this.maxfails(k, s)), 
				             this, 
				             k, 
				             s       
				     )
				 );
		return result;
	}
	
	

	
	//执行test
	public void test1outer() {
		CDO cdox = this;
		List _range1 = cdox.getsectors();
		
		//获取所有sector
		for (int _i0 = 0; _i0 < _range1.size(); _i0++) {
			Sector s = (Sector) _range1.get(_i0);
			this.test1(s);//对每个sector执行test1
		}
	}
	
	//对于该sector,setmu(1-(1-p)^n)
	public void test1(Sector s) {
		
		System.out.println("s.getq(): " + (s.getq()));
		s.InitMu();
		s.InitP();
		s.InitL();
	}

	//对于该CDO,setps0(e^(所有sector的mu值的和))
	public void test2() {
		Controller.inst().setps0(
				this,
				Math.exp(-Set.sumdouble(Sector.getAllOrderedmu(this.getsectors()))));
	}

	//输出该CDO的PS(0到50)
	public void test3() {
		
		List _integer_list2 = new Vector();
		_integer_list2.addAll(Set.integerSubrange(0, 50));
		for (int _ind3 = 0; _ind3 < _integer_list2.size(); _ind3++) {
			int s = ((Integer) _integer_list2.get(_ind3)).intValue();
			System.out.println("PS(" + s + "): " + this.PS(s));
		}
		
		
        for(int i = 0; i < sectors.size(); i++){
        	Sector s = (Sector)sectors.get(i);
			System.out.println("\nSector" + i + ":\n  L: " + s.getL() + " p:" + s.getp() + " q:" + s.getq() + " mu:" + s.getmu() + " n:" + s.getn());
			for(int j = 0; j < s.getborrowers().size(); j++){
				BorrowerInSector bj = (BorrowerInSector)(s.getborrowers().get(j));
				System.out.println("    borrowerInSector" + j + ": \n" + "      omega: " + bj.getomega() + " theta: "+ bj.gettheta() + " L: "+ bj.getborrower().getL() + " p: "+ bj.getborrower().getp());
			}
			
		}
	}
	
	//遍历该CDO，计算其所有用户contribution
	//bs为所有用户列表
	public void test4(Vector bs) {
		
		List<Float> contributionList = new ArrayList<Float>();
		
		boolean exist[] = new boolean[bs.size()];
		
		for(int i = 0; i < bs.size(); i++){
			exist[i] = false;
		}
		
		for(int i = 0;i < bs.size(); i++){
			Borrower bi = (Borrower) bs.get(i);
			for(int j = 0; j < sectors.size(); j++){
	        	Sector s = (Sector)sectors.get(j);
				for(int k = 0; k < s.getborrowers().size(); k++){
					BorrowerInSector bk = (BorrowerInSector)(s.getborrowers().get(k));
					if(bi.equals(bk.getborrower())){//bi存在于sector s中，即存在于该CDO中
						exist[i] = true;
					}
				}
			}
		}
		
		for(int i = 0; i < bs.size(); i++){
			System.out.println(exist[i]);
		}
		
		for(int i = 0; i < bs.size(); i++){
			if(exist[i]){
				float contribution = CalculateContribution((Borrower)(bs.get(i)));
				contributionList.add(contribution);
			}
			
		}
		
		
		for(int i = 0; i < contributionList.size(); i++){
			System.out.println("RiskContribution: " + contributionList.get(i));
			
		}
		
	}
	
    private float CalculateContribution(Borrower bi) {
    	float t0 = 0, t1 = 0;
    	
    	//前半部分
    	for(int i = 1; i <= sectors.size(); i++){
			float outTemp = 0;
			for(int j = 1; j <= ((Sector)sectors.get(i-1)).getborrowers().size(); j++){
//				System.out.println("sectors.get(i-1).getborrowers().get(j-1): " + sectors.get(i-1).getborrowers().get(j-1));
//				System.out.println("bi: " + bi);
				if(sectors.get(i-1).getborrowers().get(j-1).getborrower().equals(bi)){
					float innerTemp = 0;
					innerTemp = (float) (j * P(i, j) * (float)sectors.get(i-1).getborrowers().get(j-1).getomega() 
							                         * (float)sectors.get(i-1).getborrowers().get(j-1).gettheta()
							            );
					outTemp += innerTemp;
					
				}
			}
			t0 += outTemp;
			
		}
    	t0 *= bi.getL();
    	
    	
        float EL = 0;
		
		for(int i = 0; i <= 50; i++){
			EL += i *PS(i);
		}
		
		float thegmapow = 0;
		for(int i = 1; i <= sectors.size(); i++){
			float outTemp = 0;
			for(int j = 1; j <= ((Sector)sectors.get(i-1)).getborrowers().size(); j++){
				float innerTemp = 0;
				float bL = (float)sectors.get(i-1).getborrowers().get(j-1).getborrower().getL();
				float muk = (float)sectors.get(i-1).getmu();
				innerTemp = (float) ( j * j * bL * bL * P(i, j)
						            );
				outTemp += innerTemp;
			}
			thegmapow += outTemp;
		}
		
		
		float ibeDivThegma = 1 - EL / thegmapow;
		
		
		for(int i = 1; i <= sectors.size(); i++){
			float outTemp = 0;
			for(int j = 1; j <= ((Sector)sectors.get(i-1)).getborrowers().size(); j++){
				if(sectors.get(i-1).getborrowers().get(j-1).getborrower().equals(bi)){
					
					float innerTemp = 0;
					float ome = (float)sectors.get(i-1).getborrowers().get(j-1).getomega();
					float the = (float)sectors.get(i-1).getborrowers().get(j-1).gettheta();
					float la = (float) bi.getL();
					
					float sum = 0;
					
					for(int k = 0; k < ((Sector)sectors.get(i-1)).getborrowers().size(); k++){
						if(sectors.get(i-1).getborrowers().get(k).getborrower().equals(bi)){
							continue;
						}
						float omeb = (float)sectors.get(i-1).getborrowers().get(k).getomega();
						float theb = (float)sectors.get(i-1).getborrowers().get(k).gettheta();
						float lb = (float) sectors.get(i-1).getborrowers().get(k).getborrower().getL();
						sum += ome * omeb * the * theb * la * lb;
					}
					
					innerTemp = (float) (j * j * (ome * ome * the * the * la * la + sum) * P(i,j));
					
					outTemp += innerTemp;
				}
			}
			t1 += outTemp;
		}
		
		t1 *= ibeDivThegma;
		
		float riskContribution = t0 + t1;

		return riskContribution;
    }

	private java.util.Map PS_cache = new java.util.HashMap();

}
