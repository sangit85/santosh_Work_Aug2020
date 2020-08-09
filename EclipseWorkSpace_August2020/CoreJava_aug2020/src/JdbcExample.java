
import java.sql.*;

public class JdbcExample {
	
	public static void main(String ar[]) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			Statement st=con.createStatement();
			String sql="Select *from employee";
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
