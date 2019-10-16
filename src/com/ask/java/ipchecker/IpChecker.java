/**
 * 
 */
package com.ask.java.ipchecker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author A$hok@
 *
 */
public class IpChecker implements IpAddress, IpClass{

	/**
	 * @author : @shok@ 28-May-2019
	 * @param args
	 *            void main
	 * @Description :
	 */
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a valid ip Address : ");
		//String ip = sc.nextLine();
		checkIp("255.300.0.0");
		//sc.close();

	}
	
	public static void checkIp(final String ip) {
		IpChecker check = new IpChecker();
		check.isValidIp(ip);
	}

	@Override
	public boolean isValidIp(String ip) {
		if(ip != null && !ip.isEmpty()) {
			String pattern = "^[1-9]{1}[0-9]{0,2}[.][0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}$";
			Pattern compiled = Pattern.compile(pattern);
			Matcher _check = compiled.matcher(ip);
			if(_check.find()) {
				
				if(_ClassA(ip));
				else if (_ClassB(ip));
				else if (_ClassC(ip));
				else if (_ClassD(ip));
				else if (_ClassE(ip));
				else
					System.err.println("Not a valid ip address");
				return true;
			} else {
				System.err.println("not a valid ip");
				return false;
			}
		} else {
			System.err.println("not a valid ip");
			return false;
		}
	}

	@Override
	public boolean classOfIp(String ip) {
		
		return false;
	}
	
	private boolean compilePattern(final String pattern, final String ip) {
		
		Pattern compiled = Pattern.compile(pattern);
		Matcher _check = compiled.matcher(ip);
		return _check.find();
	}
	@Override
	public boolean _ClassA(String ip) {
		String public_Pattern = "(^1\\.)|(^[1-9][0-9]\\.)|(^1[0-1][0-9]\\.)|(^12[0-6]\\.)";//Class A Public ip
		String private_pattern = "(^127\\.)";//Class A private ip
		if(compilePattern(public_Pattern, ip)) {
			System.err.println("Valid class A public ip");
			return true;
		} else if(compilePattern(private_pattern, ip)){
			System.err.println("Valid class A private ip");
			return true;
		} else {
			System.err.println("Not a valid class A ip");
		}
		return false;
	}

	@Override
	public boolean _ClassB(String ip) {
		String public_Pattern = "(^12[8-9]\\.)|(^1[3-9][0]\\.)|(^191\\.)";//Class A Public ip
		if(compilePattern(public_Pattern, ip)) {
			System.err.println("Valid class B public ip");
			return true;
		} else {
			System.err.println("Not a valid class B ip");
		}
		return false;
	}

	@Override
	public boolean _ClassC(String ip) {
		String public_Pattern = "(^19[2-9]\\.)|(^2[0-1][0-9]\\.)|(^22[0-3]\\.)";//Class A Public ip
		if(compilePattern(public_Pattern, ip)) {
			System.err.println("Valid class C public ip");
			return true;
		} else {
			System.err.println("Not a valid class C ip");
		}
		return false;
	}

	@Override
	public boolean _ClassD(String ip) {
		String public_Pattern = "(^22[4-9]\\.)|(^23[0-9]\\.)";//Class D Public ip
		if(compilePattern(public_Pattern, ip)) {
			System.err.println("Valid class D public ip");
			return true;
		} else {
			System.err.println("Not a valid class D ip");
		}
		return false;
	}

	@Override
	public boolean _ClassE(String ip) {
		String public_Pattern = "(^24[0-9]\\.)|(^25[0-5]\\.)";//Class E Public ip
		if(compilePattern(public_Pattern, ip)) {
			System.err.println("Valid class E public ip");
			return true;
		} else {
			System.err.println("Not a valid class E ip");
		}
		return false;
	}



}
