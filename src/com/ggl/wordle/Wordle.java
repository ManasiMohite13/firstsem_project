package com.ggl.wordle;
import javax.swing.SwingUtilities;
import com.ggl.wordle.model.WordleModel;
import com.ggl.wordle.view.WordleFrame;
import java.sql.*;

public class Wordle implements Runnable {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Wordle());
	
		        // JDBC URL, user name, and password of MySQL server
		        String url = "jdbc:mysql://localhost:3306/your_database";
		        String user = "root";
		        String password = "Mohite13@";

		        // SQL query
		        String query = "INSERT INTO players (id, name, played, win, current_streak, longest_streak ) VALUES ('?', '?','?','?','?','?','?')";

		        // Establishing the connection
		        try (Connection connection = DriverManager.getConnection(url, user, password);
		             Statement statement = connection.createStatement()) {

		            // Executing the query
		            statement.executeUpdate(query);

		           

		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    
		
		
		
		
		
		
	}

	@Override
	public void run() {
		new WordleFrame(new WordleModel());
	}

}
