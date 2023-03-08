import java.sql.*;
import java.lang.*;
import java.util.*;
class PreparedStatementInsertScanner
{
	public static void main(String args[]) throws Exception
	{
		int id;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("enter id");
		id=s.nextInt();
		System.out.println("enter name");
		name=s.next();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("registered successfully");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established successfully");
		String sql="insert into iron values(?,?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1,id);
		stmt.setString(2,name);
		int i=stmt.executeUpdate();
		System.out.println(i+"records inserted");
		con.close();
		
	}
}
