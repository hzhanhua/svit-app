/**
 * 
 */
package com.svit.java.l1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Code is for learning purpose, not for commercial use.
 * @author Brian
 *
 */

class StringComparatorAsc implements Comparator {
	public int compare(Object a, Object b) {
		String aStr, bStr;
		aStr = (String) a;
		bStr = (String) b;
		return aStr.compareTo(bStr);
	}
}

class StringComparatorDes implements Comparator {
public int compare(Object a, Object b) {
	String aStr, bStr;
	aStr = (String) a;
	bStr = (String) b;
	return bStr.compareTo(aStr);
	}
}


public class HelloSVIT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("HELLO SVIT!");
		TreeSet ts = new TreeSet(new StringComparatorAsc());
		ts.add("abc");
		ts.add("abd");
		ts.add("ac");
		ts.add("ad");
		ts.add("aa");
		
		Iterator i = ts.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
//		System.out.println(a.compareTo(b));

	}
}



