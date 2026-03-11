package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> ls=Arrays.asList("shobhit","nishant","vivek","tushar");

		
		Map<String, Integer> map = ls.stream().collect(Collectors.toMap(i->i,i->i.length()));
		System.out.println(map);
		
		String collect = ls.stream().collect(Collectors.joining());
		System.out.println(collect);
	}
	}