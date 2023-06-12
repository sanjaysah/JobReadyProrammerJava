import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employees_database";
		try {
			//Establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "MySql@9623");
			
			//Create a statement object to send to database
			Statement statement = conn.createStatement();
			
			//Execute the statement with query
			ResultSet resultset = statement.executeQuery("select * from employees_tbl");
			//Process the results
			while(resultset.next()) {
				System.out.println(resultset.getString("name")+" - "+resultset.getString("salary"));
			}
			
			int rowaffected = statement.executeUpdate("insert into employees_tbl value(800, \"Sanjay\", \"IT\", 10000)");
			System.out.println("Insert Statement affected no of rows equal to - "+rowaffected);
			resultset = statement.executeQuery("select * from employees_tbl");
			//Process the results
			while(resultset.next()) {
				System.out.println(resultset.getString("name")+" - "+resultset.getString("salary"));
			}
			
			rowaffected = statement.executeUpdate("update employees_tbl set salary=8000 where name=\"Sanjay\"");
			System.out.println("Update Statement affected no of rows equal to - "+rowaffected);
			resultset = statement.executeQuery("select * from employees_tbl");
			//Process the results
			while(resultset.next()) {
				System.out.println(resultset.getString("name")+" - "+resultset.getString("salary"));
			}
			
			rowaffected = statement.executeUpdate("delete from employees_tbl where id=800");
			System.out.println("Delete Statement affected no of rows equal to - "+rowaffected);
			resultset = statement.executeQuery("select * from employees_tbl");
			//Process the results
			while(resultset.next()) {
				System.out.println(resultset.getString("name"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
