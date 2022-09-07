package com.masabi.interview;

import java.util.List;

public class AverageCalculator {
	public static void printAverage(List<Integer> inputNumbers) {
		sumAverage(inputNumbers);
		modeCalculator(inputNumbers);
	}

	private static void modeCalculator(List<Integer> inputNumbers) {

	}

	private static void sumAverage(List<Integer> inputNumbers) {
		if(inputNumbers.isEmpty()){ printLogExit(0); }
		else {
			double result = 0;
			result = getResult(inputNumbers, result);
			result = result / inputNumbers.size();

			printLogExit(result);
		}
	}

	private static double getResult(List<Integer> inputNumbers, double result) {
		for (int numberInList : inputNumbers) {
			result = result + numberInList;
		}
		return result;
	}

	private static void printLogExit(double averageResult){
		System.out.println("The mean is "+ averageResult);
	}

}
