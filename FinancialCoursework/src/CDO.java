import java.util.List;
import java.util.Vector;

class CDO implements SystemTypes {

	private double ps0 = 0; // internal
	private List sectors = new Vector(); // of Sector

	public CDO() {
		this.ps0 = 0;

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
					/ (1 - Math.pow((1 - ((Sector) sectors.get(k - 1)).getp()),
							((Sector) sectors.get(k - 1)).getn()));

		} else if (m < 1) {
			result = 0;

		}
		return result;
	}

	public int maxfails(int k, int s) {
		int result = 0;

		if (((Sector) sectors.get(k - 1)).getn() <= (s / ((Sector) sectors
				.get(k - 1)).getL())) {
			result = ((Sector) sectors.get(k - 1)).getn();

		} else if (((Sector) sectors.get(k - 1)).getn() > (s / ((Sector) sectors
				.get(k - 1)).getL())) {
			result = s / ((Sector) sectors.get(k - 1)).getL();

		}
		return result;
	}

	public double PS(int s) {
		double result = 0;
		//获取PS_cache中key为s的值
		Object cached_result = PS_cache.get(new Integer(s));
		if (cached_result != null) { //能取到该值
			result = ((Double) cached_result).doubleValue();
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
	public double VS(int k, int s) {
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
		Controller.inst().setmu(s, 1 - Math.pow((1 - s.getp()), s.getn()));
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
	}

	private java.util.Map PS_cache = new java.util.HashMap();

}
