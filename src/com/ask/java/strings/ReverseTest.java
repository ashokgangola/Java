package com.ask.java.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.StringBuilder;

public class ReverseTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t;
		List<StringBuilder> l = new ArrayList<>();
		t = s.nextInt();
		String p;
		while (t > 0) {
			System.out.println(t);
			StringBuilder prev = new StringBuilder();
			p = s.next();
			prev.append(p);
			prev = prev.reverse();
			l.add(prev);
			t--;
		}
		s.close();
		for (StringBuilder i : l)
			System.out.println(i);
	}
}
