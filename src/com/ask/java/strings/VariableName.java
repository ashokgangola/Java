package com.ask.java.strings;

public class VariableName {

	public static void main(String[] args) {
		String variable = "helloRam";
		StringBuilder sb = new StringBuilder();
		if(variable.contains("_")) {
			String[] variables = variable.split("_");
			sb.append(variables[0]);
			if(variables != null && variables.length > 1) {
				for(int i=1; i<variables.length; i++) {
					String abc = variables[i];
					char[] var = abc.toCharArray();
					String str = "";
					int j = 0;
					for(char c : var) {
						if(j == 0) {
							char ch = (char) ((char) c - 'a' + 'A');
							str = ch+"";
							j++;
						}
						else
							str += c;
					}
					sb.append(str);
				}
			}
		} else {
			char[] varr = variable.toCharArray();
			for(int i=0;i<varr.length;i++) {
				if(varr[i] >= 'A' && varr[i] <= 'Z') {
					sb.append("_"+Character.toLowerCase(varr[i]));
				} else {
					sb.append(varr[i]);
				}
			}
		}
		System.out.println("Modified variable = "+sb);
	}

}
