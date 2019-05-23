package ua.com.fan.taskone.third;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountingOccurrences {
	public static void main(String[] args) {
		String[] myArray = { "thisis", "and", "that", "and" };
		InterviewMap myMap = new InterviewMap();
		System.out.println(myMap.getIterviewMap1(myArray));
		System.out.println(myMap.getIterviewMap2(myArray));
	}
}

class InterviewMap {

	public Map<String, Integer> getIterviewMap1(String[] array) {

		List<String> list = Arrays.asList(array);
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		return map;
	}

	// method returning sorted map
	public Map<String, Integer> getIterviewMap2(String[] array) {

		List<String> list = Arrays.asList(array);
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
		return treeMap;
	}
}
