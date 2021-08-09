package com.xmchx.guava.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class BiMapTest {
	@Test
	public void testBiMap() {
		BiMap<String, Integer> biMap = HashBiMap.create();

		biMap.put("xmchx", 1);
		biMap.put("xmchx", 2);
		// value不能相同
		// biMap.put("xmchx2", 2);

		Integer id = biMap.get("xmchx");
		String name = biMap.inverse().get(id);
		System.out.println(id + ": " + name);
	}
}
