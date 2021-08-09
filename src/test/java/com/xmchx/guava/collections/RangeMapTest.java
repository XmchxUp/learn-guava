package com.xmchx.guava.collections;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import org.junit.Test;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class RangeMapTest {
	// 看起来很有用的样子🤣！
	@Test
	public void testRangeMap() {
		RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

		rangeMap.put(Range.closed(1, 10), "foo"); // {[1, 10] => "foo"}
		System.out.println(rangeMap);

		rangeMap.put(Range.open(3, 6), "bar"); // {[1, 3] => "foo", (3, 6) => "bar", [6, 10] => "foo"}
		rangeMap.put(Range.open(10, 20), "foo"); // {[1, 3] => "foo", (3, 6) => "bar", [6, 10] => "foo", (10, 20) => "foo"}
		System.out.println(rangeMap);

		rangeMap.remove(Range.closed(5, 11)); // {[1, 3] => "foo", (3, 5) => "bar", (11, 20) => "foo"}
		System.out.println(rangeMap);

	}
}
