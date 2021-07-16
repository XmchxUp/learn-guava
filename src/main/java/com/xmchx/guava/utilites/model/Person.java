package com.xmchx.guava.utilites.model;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {
	private Integer id;
	private String lastName;
	private String firstName;
	private int zipCode;


	@Override
	public int compareTo(Person that) {
		return ComparisonChain.start()
				.compare(this.lastName, that.lastName)
				.compare(this.firstName, that.firstName)
				// 传一个比较器
				.compare(this.zipCode, that.zipCode, Ordering.natural().nullsLast())
				.result();
	}
}
