package pink.lsj.study2017.java.testscoreprocess;

class NumberProcess {
	static int[] parseInt(String numberStr) {
		if(numberStr.matches("([^0-9])+") || numberStr.isEmpty()) return new int[] {0, -1};
		else return new int[] {1, (Integer.parseInt(numberStr))};
	}

	static double[] parseDouble(String numberStr) {
		if(numberStr.matches("([^0-9.])+") || numberStr.isEmpty()) return new double[] {0, -1};
		else return new double[] {1, (Double.parseDouble(numberStr))};
	}
}
