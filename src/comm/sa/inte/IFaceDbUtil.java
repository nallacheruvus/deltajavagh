package comm.sa.inte;

/**
 * Interface for database utility constants and connection parameters.
 * 
 * This interface defines all database connection constants and SQL queries
 * used throughout the application for accessing the deltajavamarch database.
 * 
 * Key Constants:
 * - className: MySQL JDBC Driver class name
 * - url: Database connection URL for MySQL
 * - uname: Database username for authentication
 * - password: Database password for authentication
 * 
 * Predefined Queries:
 * - query: Retrieve all registers
 * - querya: Retrieve all registers sorted by ID descending
 * - queryb: Retrieve registers with odd IDs (1, 3, 5, 7, 9)
 * - queryc: Retrieve registers with even IDs (2, 4, 6, 8, 10)
 * - queryd: Retrieve registers whose names start with 'J'
 * - querye: Retrieve records from the myyiew database view
 * 
 * @author Development Team
 * @version 1.0
 */
public interface IFaceDbUtil {
	public String className="com.mysql.cj.jdbc.Driver";
	public String url="jdbc:mysql://localhost:3306/deltajavamarch";
	public String uname="root";
	public String password="admin";
	//adhoc queries
	public String query="select * from register";
	public String querya="select * from register order by id desc";
	public String queryb="select * from register where id in (1,3,5,7,9)";
	public String queryc="select * from register where id in (2,4,6,8,10)";
	public String queryd="select * from register where name like ('J%')";
	public String querye="select * from myyiew";
	
}
