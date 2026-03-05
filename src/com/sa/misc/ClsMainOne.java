package com.sa.misc;

import java.io.Console;

public class ClsMainOne {
	public static void main(String[] args) {
		Console consa=System.console();
		System.out.println("\t\t\tWelcome to on screen authentication");
		System.out.println("Enter username");
		String uname=consa.readLine();
		System.out.println("Enter password ");
		String pass=String.valueOf(consa.readPassword());
		if(uname.equals(pass)) {
			System.out.println("You are authorized");
		}else {
			System.out.println("Not authorized");
		}
	}

	public static void methOne() {
		Console cons=System.console();
		System.out.println("Enter your name");
		String myName=cons.readLine();
		System.out.printf("Welcome to AI assited learning Mr./Ms/Mrs. "+myName);
	}
}
