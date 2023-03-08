import java.sql.*;
class PreparedStatementInsert
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("registered successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established successfully");
		String sql="insert into iron values(?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1,78);
		stmt.setString(2,"pavan");
		int i=stmt.executeUpdate();
		System.out.println(i+"records inserted");
		con.close();
		
	}
}
