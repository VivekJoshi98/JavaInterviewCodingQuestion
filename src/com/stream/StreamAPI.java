package com.stream;

import java.util.Arrays;import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 2, 3, 5, 6, 7, 3, 4, 5, 6, 7, 8, 9, 12, 43);

		Stream<Integer> stream = list.stream();
		List<Integer> collect = stream.filter(l -> l % 2 == 0).collect(Collectors.toList());

		System.out.println(collect);

		List<Integer> collect2 = list.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(collect2);

		List<String> str = Arrays.asList("tu shar", "vai bh av", "sho bh it", "v iv ek");
//		List<String> collect3 = str.stream().filter(i->i.startsWith("s")).collect(Collectors.toList());
//		System.out.println(collect3);

		List<String> collect3 = str.stream().map(i -> i.replace(" ", "")).collect(Collectors.toList());

		System.out.println(collect3);
		Map<Integer, Long> map1 = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(map1);

		List<Integer> asList = Arrays.asList(10, 23, 11, 101, 34, 56, 111);

		List<Integer> collect4 = asList.stream().filter(i -> String.valueOf(i).startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(collect4);

		List<Integer> collect5 = asList.stream().map(i -> i * 2).collect(Collectors.toList());

		System.out.println(collect5);
		

		List<String> ls = Arrays.asList("shobhit", "nishant", "vivek", "tushar");
		Map<String, Integer> map = ls.stream().collect(Collectors.toMap(i -> i, i -> i.length()));
		System.out.println(map);
		
		String collect6 = ls.stream().collect(Collectors.joining());
		System.out.println(collect6);
		
		Optional<String> reduce = ls.stream().reduce(String::concat);
	
		System.out.println(reduce.get());
		
		
		List<String> collect7 = ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect7);
		
		List<String> collect8 = ls.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect8);
		
		List<String> collect9 = ls.stream().map(i->new StringBuilder(i).reverse().toString()).collect(Collectors.toList());
		System.out.println(collect9);
		
		// Reverse List
		
		List<String> collect10 = ls.stream().collect(Collectors.collectingAndThen(Collectors.toList(), i->{
			Collections.reverse(i);
			return i;
		}));
		
		System.out.println(collect10);
		
		
	}
}
