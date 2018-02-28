package pink.lsj.study2017.java.testscoreprocess;

class NumberProcess {
	/**
	 * Parse Integer type number.
	 *
	 * @param numberStr String to parse to number.
	 * @return Parsed Integer type number.
	 */
	static int[] parseInt(String numberStr) {
		if(numberStr.matches("([^0-9])+") || numberStr.isEmpty()) return new int[] {0, -1};
		else return new int[] {1, (Integer.parseInt(numberStr))};
	}

	/**
	 * Parse Double type number.
	 *
	 * @param numberStr String to parse to number.
	 * @return Parsed Double type number.
	 */
	static double[] parseDouble(String numberStr) {
		if(numberStr.matches("([^0-9.])+") || numberStr.isEmpty()) return new double[] {0, -1};
		else return new double[] {1, (Double.parseDouble(numberStr))};
	}
}
