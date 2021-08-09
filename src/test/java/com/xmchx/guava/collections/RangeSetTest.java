package com.xmchx.guava.collections;

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import org.junit.Test;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class RangeSetTest {

	@Test
	public void testRangeSet() {
		RangeSet<Integer> rangeSet = TreeRangeSet.create();

		// []
		rangeSet.add(Range.closed(1, 10)); // {[1, 10]}
		System.out.println(rangeSet);

		// [)
		rangeSet.add(Range.closedOpen(11, 15)); // disconnected range: {[1, 10], [11, 15)}
		System.out.println(rangeSet);

		rangeSet.add(Range.closedOpen(15, 20)); // connected range; {[1, 10], [11, 20)}
		System.out.println(rangeSet);

		// (]
		rangeSet.add(Range.openClosed(0, 0)); // empty range; {[1, 10], [11, 20)}
		System.out.println(rangeSet);

		// ()
		rangeSet.remove(Range.open(5, 10)); // splits [1, 10]; {[1, 5], [10, 10], [11, 20)}
		System.out.println(rangeSet);

		// 还有其它操作：补集，子集
	}
}
