package com.example.streaming.sample.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.example.streaming.sample.Sample;

public class SampleTest {

	Sample sample = new Sample();

	@Test
	public void testMap() {
		List<String> expected = Arrays.asList("aaahoge", "bbhoge", "choge");
		List<String> result = sample.map();
		assertThat(result, is(expected));
	}

	@Test
	public void testMapToInt() {
		int expected = 6;
		int result = sample.mapToInt();
		assertThat(result, is(expected));
	}

	@Test
	public void testMapToLong() {
		long expected = 6;
		long result = sample.mapToLong();
		assertThat(result, is(expected));
	}

	@Test
	public void testMapToDouble() {
		double expected = 6;
		double result = sample.mapToDouble();
		assertThat(result, is(expected));
	}

	@Test
	public void testFlatMap() {
		List<String> expected = Arrays.asList("aaa", "AAA", "bb", "BB", "c", "C");
		List<String> result = sample.flatMap();
		assertThat(result, is(expected));
	}
}
