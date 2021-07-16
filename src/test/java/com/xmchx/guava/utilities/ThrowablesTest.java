package com.xmchx.guava.utilities;

import com.google.common.base.Throwables;
import org.junit.Test;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class ThrowablesTest {
	@Test()
	public void test() {
		try {
			int a = 1 / 0;
			String d = null;
			d.indexOf(20);
		} catch (Throwable t) {
			Throwables.throwIfInstanceOf(t, ArithmeticException.class);
			Throwables.throwIfUnchecked(t);
			throw new RuntimeException(t);
		}

	}
}
