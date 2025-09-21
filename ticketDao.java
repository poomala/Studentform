package net.javaguides.registration.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import net.javaguides.registration.model.*;
public class ticketDao {
	  public int registerticket(ticket tick) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO booking" +
	            "  (id, passname, startloc, destination, seat,price) VALUES " +
	            " (?, ?, ?, ?,?,?);";
	        int result = 0;
	        Class.forName("com.mysql.jdbc.Driver");
	        try (Connection connection = DriverManager
		            .getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false", "root", "naveenumasankar$26");
	        		
	        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	            preparedStatement.setInt(1, 1);
	            preparedStatement.setString(2, tick.getPassname());
	            preparedStatement.setString(3, tick.getStartloc());
	            String d=tick. getDestintion();
	            preparedStatement.setString(4, d);
	            preparedStatement.setString(5, tick.getSeat());
	            String s=tick.getSeat();
	            int n=Integer.parseInt(s);
	            String str=""+n;
	            preparedStatement.setString(6,str);
	           
	            System.out.println(preparedStatement);

	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {

	            printSQLException(e);
	        }
	        return result;
	    }

	    private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
}
