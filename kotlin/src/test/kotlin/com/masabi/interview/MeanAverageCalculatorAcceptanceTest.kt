package com.masabi.interview;

import org.assertj.core.api.Assertions.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.SystemOutRule

class MeanAverageCalculatorAcceptanceTest {
	@get:Rule
	val systemOutRule: SystemOutRule = SystemOutRule().enableLog();

	@Test
	fun `calculates the correct mean average when provided with a list of numbers`() {
		val inputNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 1, 2, 1)

		AverageCalculator.printAverage(inputNumbers);

		assertThat(systemOutRule.log.trim()).isEqualTo("The mean is 3.2");
	}
}
