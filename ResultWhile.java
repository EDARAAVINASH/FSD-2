import java.sql.*;
class ResultWhile
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("registered successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established successfully");
		Statement c=con.createStatement();
		String sql="select * from iron";
		ResultSet rs=c.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" ");	
			System.out.println(rs.getString("ename"));
		}
	}
}
