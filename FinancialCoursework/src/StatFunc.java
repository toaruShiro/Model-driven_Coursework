class StatFunc implements SystemTypes {

	public StatFunc() {

	}

	public String toString() {
		String _res_ = "(StatFunc) ";
		return _res_;
	}

	public static int comb(int n, int m) {
		int result = 0;
		if (n < m || m < 0) {
			return result;
		}
		Object cached_result = comb_cache.get(n + ", " + m);
		if (cached_result != null) {
			result = ((Integer) cached_result).intValue();
			return result;
		} else {
			if (n - m < m) {
				result = Set
						.prdint(Set.collect_3(Set.integerSubrange(m + 1, n)))
						/ Set.prdint(Set.collect_4(Set
								.integerSubrange(1, n - m)));

			} else if (n - m >= m) {
				result = Set.prdint(Set.collect_3(Set.integerSubrange(
						n - m + 1, n)))
						/ Set.prdint(Set.collect_4(Set.integerSubrange(1, m)));

			}
			comb_cache.put(n + ", " + m, new Integer(result));
		}
		return result;
	}

	private static java.util.Map comb_cache = new java.util.HashMap();

}
