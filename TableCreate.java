import java.sql.*;
class TableCreate
{
	public static void main(String args[])throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("registered successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
   		System.out.println("connection established successfully");
		Statement c=con.createStatement();
		String sql="create table iron(eid integer,ename varchar(20))";
		c.execute(sql);
		System.out.println("table created");
	}
}
























