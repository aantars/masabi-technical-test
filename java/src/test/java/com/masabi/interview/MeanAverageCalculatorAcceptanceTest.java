package com.masabi.interview;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MeanAverageCalculatorAcceptanceTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void calculates_the_correct_mean_average_when_provided_with_a_list_of_numbers() {
		var inputNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 1, 2, 1);

		AverageCalculator.printAverage(inputNumbers);

		assertThat(systemOutRule.getLog().trim()).isEqualTo("The mean is 3.2");
	}
}
