import java.sql.*;
class InsertMultipleAddBatch
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("registered successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established successfully");
		Statement c=con.createStatement();
		String row1="insert into iron values(68,'hemanth')";
		c.addBatch(row1);
		String row2="insert into iron values(71,'vamsi')";
		c.addBatch(row2);
		c.executeBatch();
	}
}
