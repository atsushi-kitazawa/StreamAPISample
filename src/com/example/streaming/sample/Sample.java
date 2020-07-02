package com.example.streaming.sample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {
	public List<String> map() {
		Stream<String> stream = Stream.of("aaa", "bb", "c");
		List<String> list = stream.map(e -> e.concat("hoge")).collect(Collectors.toList());
		return list;
	}

	public int mapToInt() {
		Stream<String> stream = Stream.of("aaa", "bb", "c");
		int sum = stream.mapToInt(e -> e.length()).sum();
		return sum;
	}

	public long mapToLong() {
		Stream<String> stream = Stream.of("aaa", "bb", "c");
		long sum = stream.mapToLong(e -> e.length()).sum();
		return sum;
	}

	public double mapToDouble() {
		Stream<String> stream = Stream.of("aaa", "bb", "c");
		double sum = stream.mapToDouble(e -> e.length()).sum();
		return sum;
	}

	public List<String> flatMap() {
		Stream<String> stream = Stream.of("aaa", "bb", "c");
		List<String> list = stream.flatMap(e -> Stream.of(e, e.toUpperCase())).collect(Collectors.toList());
		return list;
	}
}
