package com.xmchx.guava.collections;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class ImmutableTest {
	@Test
	public void testBuilder() {
		HashSet<String> aset = Sets.newHashSet("a", "b", "c", "c");
		var imset = ImmutableSet.<String>builder()
				.addAll(aset)
				.add("d")
				.build();
		System.out.println(imset);
	}

	@Test
	public void testCopyOf() {
		ArrayList<Integer> numberList = Lists.newArrayList(1, 1, 2, 3, 4);
		var numberSet = ImmutableSet.copyOf(
				numberList
		);

		System.out.println(numberSet);
		numberList.add(33);
		System.out.println(numberSet);
	}

	@Test
	public void testOf() {
		var colorNames = ImmutableSet.of(
				"red",
				"orange",
				"yellow",
				"green",
				"blue",
				"purple");
		System.out.println(colorNames);
	}
}
