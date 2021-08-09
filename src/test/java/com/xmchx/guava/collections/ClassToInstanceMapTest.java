package com.xmchx.guava.collections;

import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import org.junit.Test;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class ClassToInstanceMapTest {

	@Test
	public void testClassToInstanceMap() {
		// 存放不同Key类型的Map
		// ClassToInstanceMap<B> = Map<? extends B, B>
		ClassToInstanceMap<Number> numberDefaults = MutableClassToInstanceMap.create();
		numberDefaults.putInstance(Integer.class, Integer.valueOf(0));
		numberDefaults.putInstance(Double.class, Double.valueOf(1.2));

		System.out.println(numberDefaults);
	}
}
