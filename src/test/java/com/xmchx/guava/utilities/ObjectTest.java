package com.xmchx.guava.utilities;


import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.xmchx.guava.utilites.model.Person;
import org.junit.Test;

/**
 *
 *
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class ObjectTest {

	// Java1.7引用了Objects.equals()
	@Test
	public void testEqual() {
		System.out.println(Objects.equal("a", "a"));
		System.out.println(Objects.equal(null, "a"));
		System.out.println(Objects.equal("a", null));
		System.out.println(Objects.equal(null, null));
	}
	@Test
	public void testToStringHelper() {
		System.out.println(MoreObjects.toStringHelper(this).add("x", 1).toString());
		System.out.println(MoreObjects.toStringHelper("MyObject").add("x", 1).toString());
	}


	@Test
	public void testComparisonChain() {
		//test ComparisonChain
		Person person1 = new Person(1, "a","b",1);
		Person person2 = new Person(2, "a","b",2);
		System.out.println(person1.compareTo(person2));
	}
}
