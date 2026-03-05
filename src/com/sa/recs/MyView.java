package com.sa.recs;

/**
 * Record class representing a user view with personal information.
 * 
 * This Java record encapsulates user view data containing:
 * - name: User's full name
 * - email: User's email address
 * - mobile: User's mobile phone number
 * - raddress: User's residential address
 * 
 * The record provides a custom toString() method for formatted output
 * displaying all fields in a readable multi-line format.
 * 
 * @author Development Team
 * @version 1.0
 */
public record MyView(String name,String email, String mobile,String raddress) {
	/**
	 * Provides a formatted string representation of the MyView record.
	 * 
	 * @return formatted string containing name, email, mobile, and address
	 */
	@Override
	public final String toString() {
		String h=String.format("Name:%s\nEmail:%s\nMobile:%s\nAddress:%s\n",name,email,mobile,raddress);
		return h;
	}
}
