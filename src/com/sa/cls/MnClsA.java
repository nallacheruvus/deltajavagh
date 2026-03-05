package com.sa.cls;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sa.db.DbUtilsCls;
import com.sa.recs.MyView;
import com.sa.recs.Register;

/**
 * Main class for performing various query operations on Register records.
 * 
 * This class demonstrates the use of Java Streams API and functional programming
 * to perform filtering, sorting, and statistical operations on user registration data.
 * It connects to a database using DbUtilsCls and processes Register records.
 * 
 * Key Functionality:
 * - Statistical analysis (max, min, average, sum, count) of record IDs
 * - Filtering records by specific criteria (ID values, name patterns)
 * - Sorting records in ascending or descending order
 * - Displaying view data from the database
 * 
 * @author Development Team
 * @version 1.0
 */
public class MnClsA {
	//Databases which are loaded into RAM HANA(SAP)
	static DbUtilsCls cls=new DbUtilsCls();
	
	/**
	 * Main entry point for the application.
	 * 
	 * Performs statistical analysis on Register records including:
	 * - Maximum ID value
	 * - Minimum ID value
	 * - Average ID value
	 * - Total count of records
	 * - Sum of all ID values
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		List<Register> li=cls.retRegs();
		Stream<Register> strRegs=li.stream();
		Stream<Register> strRegsa=cls.retRegsProc().stream();
		Function<Register, Integer> funa=(a)->a.id();
//		strRegs.map(funa).forEach(System.out::println);
		var summary=strRegs.map(funa).collect(Collectors.summarizingInt(i->i));
		System.out.println(summary.getMax());
		System.out.println(summary.getMin());
		System.out.println(summary.getAverage());
		System.out.println(summary.getCount());
		System.out.println(summary.getSum());
	}

	/**
	 * Seventh query: Displays all registers from the provided stream.
	 * 
	 * Simply prints each Register record to the console.
	 * 
	 * @param strRegsa Stream of Register objects to be displayed
	 */
	public static void sevenQuery(Stream<Register> strRegsa) {
		strRegsa.forEach(System.out::println);
	}

	/**
	 * Sixth query: Retrieves and displays MyView records from the database.
	 * 
	 * Fetches view data and prints each MyView object to the console.
	 */
	public static void sixthQuery() {
		Stream<MyView> strView=cls.retList().stream();
		strView.forEach(System.out::println);
	}

	/**
	 * Fifth query: Filters registers whose names start with 'J'.
	 * 
	 * Extracts all records where the name begins with the character 'J'
	 * and displays them in array format.
	 * 
	 * @param strRegs Stream of Register objects to filter
	 */
	public static void fifthQuery(Stream<Register> strRegs) {
		Predicate<Register> preda=(i)->i.name().startsWith("J");
		var pp=strRegs.filter(preda).collect(Collectors.toList());
		System.out.println(Arrays.deepToString(pp.toArray()));
	}

	/**
	 * Fourth query: Filters registers with even ID values.
	 * 
	 * Excludes registers with odd ID values (1, 3, 5, 7, 9)
	 * and displays only those with even IDs.
	 * 
	 * @param strRegs Stream of Register objects to filter
	 */
	public static void fourthQuery(Stream<Register> strRegs) {
		Predicate<Register> preda=(i)->i.id()==1||i.id()==3||i.id()==5||i.id()==7||i.id()==9;
		strRegs.filter(preda.negate()).forEach(System.out::println);
	}
	
	/**
	 * Third query: Filters registers with odd ID values.
	 * 
	 * Retrieves all records with odd ID values (1, 3, 5, 7, 9)
	 * and displays them to the console.
	 * 
	 * @param strRegs Stream of Register objects to filter
	 */
	public static void thirdQuery(Stream<Register> strRegs) {
		Predicate<Register> preda=(i)->i.id()==1||i.id()==3||i.id()==5||i.id()==7||i.id()==9;
		strRegs.filter(preda).forEach(System.out::println);
	}
	
	/**
	 * Second query: Sorts registers in descending order by ID.
	 * 
	 * Orders the records from highest ID to lowest ID
	 * and displays each sorted record.
	 * 
	 * @param strRegs Stream of Register objects to sort
	 */
	public static void secQuery(Stream<Register> strRegs) {
		Comparator<Register> compa=(a,b)->b.id()-a.id();
		strRegs.sorted(compa).forEach(System.out::println);
	}
	
	/**
	 * First query: Initial query that delegates to sevenQuery.
	 * 
	 * Serves as an entry point for the first query operation,
	 * displaying all register records.
	 * 
	 * @param strRegs Stream of Register objects to display
	 */
	public static void firstQuery(Stream<Register> strRegs) {
		sevenQuery(strRegs);
	}

}
