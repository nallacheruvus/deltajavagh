package com.sa.recs;

/**
 * Record class representing a user registration entry.
 * 
 * This Java record encapsulates user registration data containing:
 * - id: Unique identifier for the user (integer)
 * - name: User's full name (string)
 * - email: User's email address (string)
 * - mobile: User's mobile phone number (string)
 * 
 * The record is immutable and provides accessor methods for each field.
 * It's primarily used for mapping database records to Java objects
 * and for stream-based data processing operations.
 * 
 * @author Development Team
 * @version 1.0
 */
public record Register(int id,String name,String email,String mobile) {
}
