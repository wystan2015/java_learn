import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCTest {
	
	public static void main(String[] args) {
		try {
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String urlString="jdbc:oracle:thin:@192.168.205.136:1521:orcl";
			Connection connection=DriverManager.getConnection(urlString,"work","work");
			java.sql.Statement stmt=connection.createStatement();
			
			ResultSet rs = stmt.executeQuery("select sysdate,sysdate+1,to_char(sysdate,'yyyymmdd') from dual");
			while(rs.next()){
				System.out.println("name:"+rs.getString(1));
			}
			rs.close();
			stmt.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

