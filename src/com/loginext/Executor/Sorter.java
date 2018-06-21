package com.loginext.Executor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter implements Comparator <String>
{
	@Override
	public int compare(String arg0, String arg1) {
		for(int i=0;i<arg0.length() && i<arg1.length();i++) {
			if((arg0.charAt(i) > 64 && arg0.charAt(i) < 91) || (arg0.charAt(i) > 97 && arg0.charAt(i) < 122)) {
				if(arg0.charAt(i) < arg1.charAt(i)) return 1;
				if(arg0.charAt(i) > arg1.charAt(i)) return -1;
			} else {
				if(arg0.charAt(i) < arg1.charAt(i)) return -1;
				if(arg0.charAt(i) > arg1.charAt(i)) return 1;
			}
		}
		return 0;
	}
	public static void main(String[] a) {
		List<String> l = new ArrayList<String>();
		l.add("B3224KHN");
		l.add("123asda");
		l.add("MH 407 01");
		l.add("mh 14 du 8174");
		l.add("Veh1234567");
		l.add("Z123");
		/*Normal sort*/
		Collections.sort(l);
		System.out.println(l.toString());
		/*Custom sort*/
		Collections.sort(l, new Sorter());
		System.out.println(l.toString());
	}
}