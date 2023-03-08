import java.sql.*;
class DBConnect
{
	public static void main(String args[])throws ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("registered successfully");
	}
}