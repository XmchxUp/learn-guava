package com.xmchx.guava.utilities;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class OrderingTest {
	class Foo {
		@Nullable
		String sortedBy;
		int notSortedBy;

		public Foo(@Nullable String sortedBy, int notSortedBy) {
			this.sortedBy = sortedBy;
			this.notSortedBy = notSortedBy;
		}

		@Override
		public String toString() {
			return "(" + sortedBy + "," + notSortedBy + ")";
		}
	}

	@Test
	public void testOrdering() {
		Foo f1 = new Foo("a", 4);
		Foo f2 = new Foo("b", 3);
		Foo f3 = new Foo(null, 2);
		Foo f4 = new Foo("c", 1);
		List<Foo> list = Lists.newArrayList(f1, f2, f3, f4);

		Ordering<Foo> ordering = Ordering.natural()
				.nullsFirst() //必须处理排序字段为null的情况
				.onResultOf(new Function<Foo, String>() {
					public String apply(Foo foo) {
						return foo.sortedBy;
					}
				});
		List<Foo> sortedList = ordering.sortedCopy(list);
		System.out.println(sortedList);
		System.out.println("老列表是否有序：" + ordering.isOrdered(list));
		System.out.println("新列表是否有序：" + ordering.isOrdered(sortedList));
		System.out.println("最大的两个：" + ordering.greatestOf(list, 2));
		System.out.println("最大的：" + ordering.max(list));
		System.out.println("最小的：" + ordering.min(list));
	}
}
