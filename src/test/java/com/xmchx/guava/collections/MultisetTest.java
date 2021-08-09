package com.xmchx.guava.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class MultisetTest {
	public static List<String> words = Lists.newArrayList("xmchx", "xmchx", "kevin", "sun");

	@Test
	public void testMultiset() {
		HashMultiset<String> set = HashMultiset.create();
		set.addAll(words);
		System.out.println(set.count("xmchx"));
		System.out.println(set.size());
	}

	@Test
	public void testJDKCountWord() {

		var map = new HashMap<String, Integer>();
		for (String word : words) {
			Integer count = map.get(word);
			if (count == null) {
				map.put(word, 1);
			} else {
				map.put(word, count + 1);
			}
		}
		System.out.println(map.get("xmchx"));
	}
}
