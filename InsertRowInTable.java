import java.sql.*;
class InsertRowInTable
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("registered successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established successfully");
		Statement c=con.createStatement();
		String sql="insert into iron values(90,'ganesh')";
		int rowseffected=c.executeUpdate(sql);
		System.out.println(rowseffected+" rows effected");
	}
}
