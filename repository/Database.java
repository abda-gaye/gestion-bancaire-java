package repository;
import java.sql.*;

public class Database {
    
    public String connectMysql()
    {
        try {
            Class.forName("com.mysql.Driver.sql");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root", "5423488ag");
            Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM person");
			while(res.next())
				return res
.getString(0)	;		conn.close();

        } catch (Exception e) {
            System.out.println("Error connecting to"+e);
        }
        return null;
    }
}
