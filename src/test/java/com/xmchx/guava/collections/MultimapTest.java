package com.xmchx.guava.collections;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class MultimapTest {
	Map<String, List<Integer>> map = new HashMap<>();
	Multimap<String, Integer> multimap = HashMultimap.create();

	@Before
	public void init() {
		processMap("a", 1);
		processMap("a", 2);
		processMap("a", 3);
		processMap("b", 4);
		processMap("c", 5);
		processMap("d", 3);
		processMap("d", 2);

		processMultiMap("a", 1);
		processMultiMap("a", 2);
		processMultiMap("a", 3);
		processMultiMap("b", 4);
		processMultiMap("c", 5);
		processMultiMap("d", 3);
		processMultiMap("d", 2);

	}

	private void processMap(String key, Integer value) {
		if (map.containsKey(key)) {
			map.get(key).add(value);
		} else {
			map.put(key, Lists.newArrayList(value));
		}
	}

	private void processMultiMap(String key, Integer value) {
		multimap.put(key, value);
	}

	@Test
	public void testGet() {
		System.out.println(map.get("a"));
		System.out.println(multimap.get("a"));
	}

	@Test
	public void testKeys() {
		System.out.println(map.keySet());
		System.out.println(multimap.keySet());
		System.out.println(multimap.keys());
	}

	@Test
	public void testValues() {
		System.out.println(map.values());
		System.out.println(multimap.values());
		System.out.println(multimap.asMap().values());
	}
}
