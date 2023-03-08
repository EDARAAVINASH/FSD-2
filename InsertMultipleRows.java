import java.sql.*;
class InsertMultipleRows
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("registered successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established successfully");
		Statement c=con.createStatement();
		String sql1="insert into iron values(86,'abi')";
		int rowseffected=c.executeUpdate(sql1);
		System.out.println(rowseffected+" rows effected");
		String sql2="insert into iron values(85,'harsha')";
		int rowseffected1=c.executeUpdate(sql2);
		System.out.println(rowseffected1+" rows effected");
	}
}
