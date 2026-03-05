package com.sa.cls;

import com.sa.recs.Register;

/**
 * Test class for demonstrating Register record functionality.
 * 
 * This class creates a sample Register instance and displays
 * its properties (id, name, email, mobile) to verify the record implementation.
 * 
 * @author Development Team
 * @version 1.0
 */
public class TestCls {

	/**
	 * Main entry point for testing Register record.
	 * 
	 * Creates a Register instance with sample data and prints
	 * all record fields to the console.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		var rec=new Register(10, "Meenal", "meenal@gmail.com", "93873838383");
		System.out.println(rec.id()+" "+rec.name()+" "+rec.email()+" "+rec.mobile());
		

	}

}
