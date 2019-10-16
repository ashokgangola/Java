package com.ask.java.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 4;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				val++;
				for (int j = val; j >= i; j--) {
					if (j != i)
						System.out.print(j + "*");
					else
						System.out.print(j);
				}
				val++;
			} else {
				for (int j = 1; j <= i; j++) {
					if (j != i)
						System.out.print(val + "*");
					else
						System.out.print(val);
					val++;
				}
			}

			System.out.println();
		}
	}

	private static void m1() {
		int n = 4;
		int val = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= i; j++) {
					if (j == i)
						System.out.print(val);
					else
						System.out.print(val + "*");
					val++;
				}
			} else {
				int line[] = new int[i];
				for (int j = 0; j <= i - 1; j++) {
					line[j] = val;
					val++;
				}

				for (int l = line.length - 1; l >= 0; l--) {
					if (l == line.length - 1) {
						System.out.print(line[l]);
						if (l != 0)
							System.out.print("*");
					} else {
						System.out.print(line[l]);
						if (l != 0)
							System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}

}
