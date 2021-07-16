package com.xmchx.guava.utilities;

import com.google.common.base.Preconditions;
import org.junit.Test;

import java.util.Objects;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class PreconditionTest {
	@Test
	public void start() {
		Preconditions.checkNotNull("", "不能为null");
		Objects.requireNonNull("");

		Preconditions.checkElementIndex(1, 2, "检测索引是符合[0,size)");
		Preconditions.checkPositionIndex(1, 2);
		// end <= size
		Preconditions.checkPositionIndexes(0, 10, 10);

	}
}
