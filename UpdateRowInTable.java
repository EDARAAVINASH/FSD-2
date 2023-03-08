import java.sql.*;
class UpdateRowInTable
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("registered successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established successfully");
		Statement c=con.createStatement();
		String sql="update iron set eid=568 where ename='hemanth'";
		c.executeUpdate(sql);
	}
}
