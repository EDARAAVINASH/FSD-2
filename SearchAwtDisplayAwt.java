import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Search extends Frame implements ActionListener
{
	Label l1;
	TextField t1,t2;
	Button b;
	Search() //constructor
	{
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		l1=new Label("Enter Roll Number ");
		t1=new TextField(20);
		b=new Button("Search");
		t2=new TextField(20);
		add(l1);
		add(t1);
		add(b);
		add(t2);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
			PreparedStatement pst=con.prepareStatement("select * from iron where EID=?");
			//read input from textfield
			String num=t1.getText();
			pst.setString(1,num);
			ResultSet rs=pst.executeQuery();
			int x=0;
			while(rs.next())
			{
				//System.out.println(rs.getString(1)+" "+rs.getString(2));
				//t1.setText(rs.getString(1));
				t2.setText(rs.getString(2));
				x++;
			}
			if(x==0)
			{
				t2.setText("record not found");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
class SearchAwtDisplayAwt
{
	public static void main(String args[])
	{
		Search s=new Search();	
	}
}