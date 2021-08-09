package com.xmchx.guava.collections;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Test;

import java.util.Map;

/**
 * @author xmchx (sunhuayangak47@gmail.com)
 */
public class TableTest {
	@Test
	public void testTable() {
		Table<Integer, Integer, String> weightedGraph = HashBasedTable.create();
		weightedGraph.put(1, 2, "4");
		weightedGraph.put(1, 3, "20");
		weightedGraph.put(2, 3, "5");

		System.out.println(weightedGraph);

		System.out.println("RowMap: " + weightedGraph.rowMap());
		Map<Integer, String> row1 = weightedGraph.row(1);
		System.out.println("Row1: "+row1);

		System.out.println("ColMap: " + weightedGraph.columnMap());
		Map<Integer, String> col3 = weightedGraph.column(3);
		System.out.println("Col3: " + col3);


	}
}
