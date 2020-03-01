import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;
import java.lang.*;
import java.lang.reflect.*;
import java.util.StringTokenizer;
import java.io.*;

public class Controller implements SystemTypes, ControllerInterface {
	Vector cdos = new Vector();
	Vector sectors = new Vector();
	Vector borrowers = new Vector();
	Vector borrowerInSectors = new Vector();
	Vector statfuncs = new Vector();
	private static Controller uniqueInstance;

	private Controller() {
	}

	public static Controller inst() {
		if (uniqueInstance == null) {
			uniqueInstance = new Controller();
		}
		return uniqueInstance;
	}

	public static void loadModel(String file) {
		try {
			BufferedReader br = null;
			File f = new File(file);
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (Exception ex) {
				System.err.println("No file: " + file);
				return;
			}
			Class cont = Class.forName("Controller");
			java.util.Map objectmap = new java.util.HashMap();
			while (true) {
				String line1;
				try {
					line1 = br.readLine();
				} catch (Exception e) {
					return;
				}
				if (line1 == null) {
					return;
				}
				line1 = line1.trim();

				if (line1.length() == 0) {
					continue;
				}
				String left;
				String op;
				String right;

				// 如果最后一位字符是引号
				if (line1.charAt(line1.length() - 1) == '"') {
					int eqind = line1.indexOf("=");
					if (eqind == -1) {
						continue;
					} else
					// left: 操作对象 right: 名
					{
						left = line1.substring(0, eqind - 1).trim();
						op = "=";
						right = line1.substring(eqind + 1, line1.length())
								.trim();
					}
				} else {
					StringTokenizer st1 = new StringTokenizer(line1);
					Vector vals1 = new Vector();
					while (st1.hasMoreTokens()) {
						String val1 = st1.nextToken();
						vals1.add(val1);
					}
					if (vals1.size() < 3) {
						continue;
					}
					left = (String) vals1.get(0);
					op = (String) vals1.get(1);
					right = (String) vals1.get(2);
				}
				// 如果操作符是冒号
				if (":".equals(op)) {
					int i2 = right.indexOf(".");
					//如果操作符右边没有点
					if (i2 == -1) {
						
						System.out.println("right: " + right);
						
						Class cl;
						try {
							cl = Class.forName("" + right);
						} catch (Exception _x) {
							System.err.println("No entity: " + right);
							continue;
						}
						
						try{
							Object xinst = cl.newInstance();
							
							//b1 : BorrowerInSector 对象名b1为key，实例为value存入map中
							objectmap.put(left, xinst);
							Class[] cargs = new Class[] { cl };
							Method addC = cont.getMethod("add" + right, cargs);
							System.out.println("Method name: add" + right + ": " + left);
							System.out.println("Method: " + addC);
							if (addC == null) {
								System.err.println("No Method in Controller: add" + right);
								continue;
							}
							Object[] args = new Object[] { xinst };
							addC.invoke(Controller.inst(), args);
							
						}catch (Exception e){
							e.printStackTrace();
						}
						
					} else { //如果操作符是冒号且右边有点，obj为右边对象，role为其变量
						     //b2 : s1.borrowers
						String obj = right.substring(0, i2);
						String role = right.substring(i2 + 1, right.length());
						Object objinst = objectmap.get(obj); //获取该对象(s1)实例
						if (objinst == null) {
							continue;
						}
						Object val = objectmap.get(left); //获取冒号左边对象(b2)实例
						if (val == null) {
							continue;
						}
						Class objC = objinst.getClass(); // 获取s1的Class(Sector)
						Class typeclass = val.getClass();
						Object[] args = new Object[] { val };
						Class[] settypes = new Class[] { typeclass };
						
						//在s1的类(Sector)中找add[role](addborrowers)方法
						Method addrole = Controller.findMethod(objC, "add" + role);
						if (addrole != null) {
							addrole.invoke(objinst, args);
						} else {
							System.err.println("Error: cannot add to " + role);
						}
					}
				}
				// 如果操作符是等号
				else if ("=".equals(op)) {
					int i1 = left.indexOf(".");
					if (i1 == -1) {
						continue;
					}
					String obj = left.substring(0, i1);
					String att = left.substring(i1 + 1, left.length());
					Object objinst = objectmap.get(obj);
					if (objinst == null) {
						continue;
					}
					Class objC = objinst.getClass();
					Class typeclass;
					Object val;
					if (right.charAt(0) == '"'
							&& right.charAt(right.length() - 1) == '"') {
						typeclass = String.class;
						val = right.substring(1, right.length() - 1);
					} else if ("true".equals(right) || "false".equals(right)) {
						typeclass = boolean.class;
						if ("true".equals(right)) {
							val = new Boolean(true);
						} else {
							val = new Boolean(false);
						}
					} else {
						val = objectmap.get(right);
						if (val != null) {
							typeclass = val.getClass();
						} else {
							int i;
							long l;
							double d;
							try {
								i = Integer.parseInt(right);
								typeclass = int.class;
								val = new Integer(i);
							} catch (Exception ee) {
								try {
									l = Long.parseLong(right);
									typeclass = long.class;
									val = new Long(l);
								} catch (Exception eee) {
									try {
										d = Double.parseDouble(right);
										typeclass = double.class;
										val = new Double(d);
									} catch (Exception ff) {
										continue;
									}
								}
							}
						}
					}
					Object[] args = new Object[] { val };
					Class[] settypes = new Class[] { typeclass };
					Method setatt = Controller.findMethod(objC, "set" + att);
					if (setatt != null) {
						setatt.invoke(objinst, args);
					} else {
						System.err.println("No attribute: " + att);
					}
				}
			}
		} catch (Exception e) {
		}
	}

	public static Method findMethod(Class c, String name) {
		Method[] mets = c.getMethods();
		for (int i = 0; i < mets.length; i++) {
			Method m = mets[i];
			if (m.getName().equals(name)) {
				return m;
			}
		}
		return null;
	}

	public void checkCompleteness() {
	}

	public void saveModel(String file) {
		File outfile = new File(file);
		PrintWriter out;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(outfile)));
		} catch (Exception e) {
			return;
		}
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox_ = (CDO) cdos.get(_i);
			out.println("cdox_" + _i + " : CDO");
			out.println("cdox_" + _i + ".ps0 = " + cdox_.getps0());
		}

		for (int _i = 0; _i < sectors.size(); _i++) {
			Sector sectorx_ = (Sector) sectors.get(_i);
			out.println("sectorx_" + _i + " : Sector");
			out.println("sectorx_" + _i + ".name = \"" + sectorx_.getname()
					+ "\"");
			out.println("sectorx_" + _i + ".n = " + sectorx_.getn());
			out.println("sectorx_" + _i + ".p = " + sectorx_.getp());
			out.println("sectorx_" + _i + ".q = " + sectorx_.getq());
			out.println("sectorx_" + _i + ".L = " + sectorx_.getL());
			out.println("sectorx_" + _i + ".mu = " + sectorx_.getmu());
		}

		for (int _i = 0; _i < statfuncs.size(); _i++) {
			StatFunc statfuncx_ = (StatFunc) statfuncs.get(_i);
			out.println("statfuncx_" + _i + " : StatFunc");
		}

		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox_ = (CDO) cdos.get(_i);
			List cdo_sectors_Sector = cdox_.getsectors();
			for (int _j = 0; _j < cdo_sectors_Sector.size(); _j++) {
				out.println("sectorx_"
						+ sectors.indexOf(cdo_sectors_Sector.get(_j))
						+ " : cdox_" + _i + ".sectors");
			}
		}
		out.close();
	}

	public void saveXSI(String file) {
		File outfile = new File(file);
		PrintWriter out;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(outfile)));
		} catch (Exception e) {
			return;
		}
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<My:model xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\">");
		for (int _i = 0; _i < cdos.size(); _i++) {
			CDO cdox_ = (CDO) cdos.get(_i);
			out.print("<cdos xsi:type=\"My:CDO\"");
			out.print(" ps0=\"" + cdox_.getps0() + "\" ");
			out.print(" sectors = \"");
			List cdo_sectors = cdox_.getsectors();
			for (int _j = 0; _j < cdo_sectors.size(); _j++) {
				out.print(" //@sectors." + sectors.indexOf(cdo_sectors.get(_j)));
			}
			out.print("\"");
			out.println(" />");
		}

		for (int _i = 0; _i < sectors.size(); _i++) {
			Sector sectorx_ = (Sector) sectors.get(_i);
			out.print("<sectors xsi:type=\"My:Sector\"");
			out.print(" name=\"" + sectorx_.getname() + "\" ");
			out.print(" n=\"" + sectorx_.getn() + "\" ");
			out.print(" p=\"" + sectorx_.getp() + "\" ");
			out.print(" q=\"" + sectorx_.getq() + "\" ");
			out.print(" L=\"" + sectorx_.getL() + "\" ");
			out.print(" mu=\"" + sectorx_.getmu() + "\" ");
			out.println(" />");
		}

		for (int _i = 0; _i < statfuncs.size(); _i++) {
			StatFunc statfuncx_ = (StatFunc) statfuncs.get(_i);
			out.print("<statfuncs xsi:type=\"My:StatFunc\"");
			out.println(" />");
		}

		out.println("</My:model>");
		out.close();
	}

	public void addCDO(CDO oo) {
		cdos.add(oo);
	}

	public void addSector(Sector oo) {
		sectors.add(oo);
	}
	
	public void addBorrower(Borrower oo) {
		borrowers.add(oo);
	}
	
	public void addBorrowerInSector(BorrowerInSector oo) {

		borrowerInSectors.add(oo);
	}

	public void addStatFunc(StatFunc oo) {
		statfuncs.add(oo);
	}

	public void createAllCDO(List cdox) {
		for (int i = 0; i < cdox.size(); i++) {
			CDO cdox_x = (CDO) cdox.get(i);
			if (cdox_x == null) {
				cdox_x = new CDO();
			}
			cdox.set(i, cdox_x);
			addCDO(cdox_x);
		}
	}

	public CDO createCDO() {
		CDO cdox = new CDO();
		addCDO(cdox);
		setps0(cdox, 0);
		setsectors(cdox, new Vector());

		return cdox;
	}

	public void createAllSector(List sectorx) {
		for (int i = 0; i < sectorx.size(); i++) {
			Sector sectorx_x = (Sector) sectorx.get(i);
			if (sectorx_x == null) {
				sectorx_x = new Sector();
			}
			sectorx.set(i, sectorx_x);
			addSector(sectorx_x);
		}
	}

	public Sector createSector() {
		Sector sectorx = new Sector();
		addSector(sectorx);
		setname(sectorx, "");
		setn(sectorx, 0);
		setp(sectorx, 0);
		setq(sectorx, 0);
		setL(sectorx, 0);
		setmu(sectorx, 0);

		return sectorx;
	}

	public void createAllStatFunc(List statfuncx) {
		for (int i = 0; i < statfuncx.size(); i++) {
			StatFunc statfuncx_x = (StatFunc) statfuncx.get(i);
			if (statfuncx_x == null) {
				statfuncx_x = new StatFunc();
			}
			statfuncx.set(i, statfuncx_x);
			addStatFunc(statfuncx_x);
		}
	}

	public StatFunc createStatFunc() {
		StatFunc statfuncx = new StatFunc();
		addStatFunc(statfuncx);

		return statfuncx;
	}

	public void setps0(CDO cdox, double ps0_x) {
		cdox.setps0(ps0_x);
	}

	public void setsectors(CDO cdox, List sectorsxx) {
		List _oldsectorsxx = cdox.getsectors();
		for (int _i = 0; _i < sectorsxx.size(); _i++) {
			Sector _xx = (Sector) sectorsxx.get(_i);
			if (_oldsectorsxx.contains(_xx)) {
			} else {
				CDO.removeAllsectors(cdos, _xx);
			}
		}
		cdox.setsectors(sectorsxx);
	}

	public void setsectors(CDO cdox, int _ind, Sector sectorx) {
		cdox.setsectors(_ind, sectorx);
	}

	public void addsectors(CDO cdox, Sector sectorsxx) {
		CDO.removeAllsectors(cdos, sectorsxx);
		cdox.addsectors(sectorsxx);
	}

	public void removesectors(CDO cdox, Sector sectorsxx) {
		cdox.removesectors(sectorsxx);
	}

	public void unionsectors(CDO cdox, List sectorsx) {
		for (int _i = 0; _i < sectorsx.size(); _i++) {
			Sector sectorxsectors = (Sector) sectorsx.get(_i);
			addsectors(cdox, sectorxsectors);
		}
	}

	public void subtractsectors(CDO cdox, List sectorsx) {
		for (int _i = 0; _i < sectorsx.size(); _i++) {
			Sector sectorxsectors = (Sector) sectorsx.get(_i);
			removesectors(cdox, sectorxsectors);
		}
	}

	public void setname(Sector sectorx, String name_x) {
		sectorx.setname(name_x);
	}

	public void setn(Sector sectorx, int n_x) {
		sectorx.setn(n_x);
	}

	public void setp(Sector sectorx, double p_x) {
		sectorx.setp(p_x);
	}

	public void setq(Sector sectorx, double q_x) {
		sectorx.setq(q_x);
	}

	public void setL(Sector sectorx, int L_x) {
		sectorx.setL(L_x);
	}

	public void setmu(Sector sectorx, float mu_x) {
		sectorx.setmu(mu_x);
	}

	public List AllCDOnocontagion(List cdoxs, int k, int m) {
		List result = new Vector();
		for (int _i = 0; _i < cdoxs.size(); _i++) {
			CDO cdox = (CDO) cdoxs.get(_i);
			result.add(new Double(cdox.nocontagion(k, m)));
		}
		return result;
	}

	public List AllCDOP(List cdoxs, int k, int m) {
		List result = new Vector();
		for (int _i = 0; _i < cdoxs.size(); _i++) {
			CDO cdox = (CDO) cdoxs.get(_i);
			result.add(new Double(cdox.P(k, m)));
		}
		return result;
	}

	public List AllCDOPCond(List cdoxs, int k, int m) {
		List result = new Vector();
		for (int _i = 0; _i < cdoxs.size(); _i++) {
			CDO cdox = (CDO) cdoxs.get(_i);
			result.add(new Double(cdox.PCond(k, m)));
		}
		return result;
	}

	public List AllCDOmaxfails(List cdoxs, int k, int s) {
		List result = new Vector();
		for (int _i = 0; _i < cdoxs.size(); _i++) {
			CDO cdox = (CDO) cdoxs.get(_i);
			result.add(new Integer(cdox.maxfails(k, s)));
		}
		return result;
	}

	public List AllCDOPS(List cdoxs, int s) {
		List result = new Vector();
		for (int _i = 0; _i < cdoxs.size(); _i++) {
			CDO cdox = (CDO) cdoxs.get(_i);
			result.add(new Double(cdox.PS(s)));
		}
		return result;
	}

	public List AllCDOVS(List cdoxs, int k, int s) {
		List result = new Vector();
		for (int _i = 0; _i < cdoxs.size(); _i++) {
			CDO cdox = (CDO) cdoxs.get(_i);
			result.add(new Double(cdox.VS(k, s)));
		}
		return result;
	}

	public void test1(CDO cdox, Sector s) {
		cdox.test1(s);
	}

	public void test1outer(CDO cdox) {
		cdox.test1outer();
	}

	public void test2(CDO cdox) {
		cdox.test2();
	}

	public void test3(CDO cdox) {
		cdox.test3();
	}
	
	public void test4(CDO cdox, Vector bs) {
		cdox.test4(bs);
	}

	public List AllSectornocontagion(List sectorxs, int m) {
		List result = new Vector();
		for (int _i = 0; _i < sectorxs.size(); _i++) {
			Sector sectorx = (Sector) sectorxs.get(_i);
			result.add(new Double(sectorx.nocontagion(m)));
		}
		return result;
	}

	public List AllSectorcontagion(List sectorxs, int i, int m) {
		List result = new Vector();
		for (int _i = 0; _i < sectorxs.size(); _i++) {
			Sector sectorx = (Sector) sectorxs.get(_i);
			result.add(new Double(sectorx.contagion(i, m)));
		}
		return result;
	}

	public static int comb(int n, int m) {
		return StatFunc.comb(n, m);
	}

	public void killAllCDO(List cdoxx) {
		for (int _i = 0; _i < cdoxx.size(); _i++) {
			killCDO((CDO) cdoxx.get(_i));
		}
	}

	public void killCDO(CDO cdoxx) {
		cdos.remove(cdoxx);
	}

	public void killAllSector(List sectorxx) {
		for (int _i = 0; _i < sectorxx.size(); _i++) {
			killSector((Sector) sectorxx.get(_i));
		}
	}

	public void killSector(Sector sectorxx) {
		sectors.remove(sectorxx);
		Vector _1qrangesectorsCDO = new Vector();
		_1qrangesectorsCDO.addAll(cdos);
		for (int _i = 0; _i < _1qrangesectorsCDO.size(); _i++) {
			CDO cdox = (CDO) _1qrangesectorsCDO.get(_i);
			if (cdox.getsectors().contains(sectorxx)) {
				removesectors(cdox, sectorxx);
			}
		}
	}

	public void killAllStatFunc(List statfuncxx) {
		for (int _i = 0; _i < statfuncxx.size(); _i++) {
			killStatFunc((StatFunc) statfuncxx.get(_i));
		}
	}

	public void killStatFunc(StatFunc statfuncxx) {
		statfuncs.remove(statfuncxx);
	}

	public void test() {
		Date d1 = new Date();
		long t1 = d1.getTime();

		//对于所有CDO,执行testouter
		List cdotest1outerx = new Vector();
		cdotest1outerx.addAll(Controller.inst().cdos);
		for (int cdotest1outerx_ind4 = 0; cdotest1outerx_ind4 < cdotest1outerx
				.size(); cdotest1outerx_ind4++) {
			Controller.inst().test1outer(
					(CDO) cdotest1outerx.get(cdotest1outerx_ind4));
		}

		//对于所有CDO,执行test2
		List cdotest2x = new Vector();
		cdotest2x.addAll(Controller.inst().cdos);
		for (int cdotest2x_ind5 = 0; cdotest2x_ind5 < cdotest2x.size(); cdotest2x_ind5++) {
			Controller.inst().test2((CDO) cdotest2x.get(cdotest2x_ind5));
		}

		//对于所有CDO,执行test3
		List cdotest3x = new Vector();
		cdotest3x.addAll(Controller.inst().cdos);
		for (int cdotest3x_ind6 = 0; cdotest3x_ind6 < cdotest3x.size(); cdotest3x_ind6++) {
			Controller.inst().test3((CDO) cdotest3x.get(cdotest3x_ind6));
		}
		
		//对于所有CDO,执行test4
		List cdotest4x = new Vector();
		cdotest4x.addAll(Controller.inst().cdos);
		for (int cdotest4x_ind7 = 0; cdotest4x_ind7 < cdotest4x.size(); cdotest4x_ind7++) {
			Controller.inst().test4((CDO) cdotest4x.get(cdotest4x_ind7), borrowers);
		}

		Date d2 = new Date();
		long t2 = d2.getTime();
		System.out.println("Time = " + (t2 - t1));

	}
	
	public void testBorrowerInSector(int cdo, int k0, int i0) {
		
		if(cdos.size() == 0){
			System.out.println("Please load the model");
			return;
		}
		
		if(cdo - 1 > cdos.size()){
			System.err.println("Don't have so many CDOs!");
			return;
		}
		
		System.out.println("using CDO" + cdo);
		((CDO)cdos.get(cdo-1)).borrowerRiskContribution(k0, i0);
	}

}
