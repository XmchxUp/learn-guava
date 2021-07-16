package com.xmchx.guava.utilities;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class OptionalTest {
	/*
		建议直接使用：Java8 Optional
	 */
	@Test
	public void testOptional() {
		Optional<Integer> possible = Optional.of(5);
		System.out.println(possible.isPresent());
		System.out.println(possible.orElse(-1));

//		不能为 null
		possible = Optional.of(7);
		System.out.println(possible.get());

//		为值空时不能获取
		possible = Optional.ofNullable(null);
		System.out.println(possible.orElseThrow(NoSuchElementException::new));
	}
}
